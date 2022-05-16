package inheritanceandinterfaces;

public class CommercialProperty extends Property {
  public enum Type {
    OFFICE,
    RETAIL,
    INDUSTRIAL
  }

  private Type commercialPropertyType = Type.OFFICE;
  private float contractedServicesFees;

  public CommercialProperty(String name, int size, Type commercialPropertyType, float contractedServicesFees) {
    super(name, size);
    this.contractedServicesFees = contractedServicesFees;
    this.commercialPropertyType = commercialPropertyType;
  }

  public float getContractedServicesFees() {
    return contractedServicesFees;
  }

  public void setContractedServicesFees(float contractedServicesFees) {
    this.contractedServicesFees = contractedServicesFees;
  }

  public String getCommercialPropertyType() {
    String typeValue = "Office";
    switch (commercialPropertyType) {
      case RETAIL:
        typeValue = "Retail";
        break;
      case INDUSTRIAL:
        typeValue = "Industrial";
        break;
      default:
        break;
    }
    return typeValue;
  }
}
