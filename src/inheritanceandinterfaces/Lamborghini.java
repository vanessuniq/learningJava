package inheritanceandinterfaces;

public class Lamborghini implements SportsCar {
  private static final String SPORTS_CAR_MAKE = "Lamborghini";
  private String model;
  private Double price;
  private float toSpeed;

  public Lamborghini(String model, Double price, float toSpeed) {
    this.model = model;
    this.price = price;
    this.toSpeed = toSpeed;
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
  public float getToSpeed() {
    return toSpeed;
  }

  @Override
  public String toString() {
    return String.format("Lamborghini(Release Date: %s, Model: %s, Price: $%.2f, toSpeed: %.0f mi/hr)",
        getReleaseDate(), model, price, toSpeed);
  }
}
