package inheritanceandinterfaces;

public class ResidentialProperty extends Property {
  public enum Type {
    SINGLE_FAMILY_HOME,
    CONDO,
    TOWNHOUSE
  }

  public static final double INCREASE_RATE = 0.15;
  private Type residentialType = Type.SINGLE_FAMILY_HOME;
  private double hoaFees;

  public ResidentialProperty(String name, Type residentialType, int size, double hoaFees) {
    super(name, "Residential", size);
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

  public double getHoaFees() {
    return hoaFees;
  }

  public void setHoaFees(double hoaFees) {
    this.hoaFees = hoaFees;
  }

  @Override
  public void printDetails() {
    super.printDetails();
    System.out.format("Residential property additional details {residentialType = %s, hoaFees = $%.2f}",
        getResidentialType(),
        hoaFees);
    System.out.println();
  }

  @Override
  public void calculateNewFees() {
    double newHoaFees = getHoaFees() * (1 + INCREASE_RATE);
    setHoaFees(newHoaFees);
  }
}
