package inheritanceandinterfaces;

public class CommercialProperty extends Property {
  public enum Type {
    OFFICE,
    RETAIL,
    INDUSTRIAL
  }

  public static final double INCREASE_RATE = 0.20;

  private Type commercialPropertyType = Type.OFFICE;
  private double contractedServicesFees;

  public CommercialProperty(String name, int size, Type commercialPropertyType, double contractedServicesFees) {
    super(name, "Commercial", size);
    this.contractedServicesFees = contractedServicesFees;
    this.commercialPropertyType = commercialPropertyType;
  }

  public double getContractedServicesFees() {
    return contractedServicesFees;
  }

  public void setContractedServicesFees(double contractedServicesFees) {
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

  @Override
  public void calculateNewFees() {
    double newFees = getContractedServicesFees() + (1 + INCREASE_RATE);
    setContractedServicesFees(newFees);
  }
}
