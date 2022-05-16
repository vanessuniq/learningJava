package inheritanceandinterfaces;

public class Lamborghini implements SportsCar {
  private static final String SPORTS_CAR_MAKE = "Lamborghini";
  private String model;
  private Double price;

  public Lamborghini(String model, Double price) {
    this.model = model;
    this.price = price;
  }

  @Override
  public String getMake() {
    return SPORTS_CAR_MAKE;
  }

  @Override
  public String getModel() {
    return model;
  }

  @Override
  public Double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return String.format("Lamborghini(Model: %s, Price: $%.2f)", model, price);
  }
}
