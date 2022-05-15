package inheritanceandinterfaces;

public class ResidentialProperty extends Property {
  public enum Type {
    SINGLE_FAMILY_HOME,
    CONDO,
    TOWNHOUSE
  }

  private Type residentialType = Type.SINGLE_FAMILY_HOME;
  private float hoaFees;

  public ResidentialProperty(String name, Type residentialType, int size, float hoaFees) {
    super(name, "Reseidential", size);
    this.residentialType = residentialType;
    this.hoaFees = hoaFees;
  }

  public String getResidentialType() {
    String typeValue = "Single Family Home";
    switch (residentialType) {
      case CONDO:
        typeValue = "Condo";
        break;
      case TOWNHOUSE:
        typeValue = "Townhouse";
        break;
      default:
        break;
    }
    return typeValue;
  }

  public float getHoaFees() {
    return hoaFees;
  }

  public void setHoaFees(float hoaFees) {
    this.hoaFees = hoaFees;
  }

  @Override
  public void printDetails() {
    super.printDetails();
    System.out.format("Additional property details {residentialType = %s, hoaFees = $%.2f}", getResidentialType(),
        hoaFees);
    System.out.println();
  }
}
