package java_apprentice.handling_errors;

public class HandlingExcepion {
  public static void main(String[] args) {
    double[] prices = { 4.56, 5.34, 29.34, 85.85, 83, 55 };
    System.out.println("Starting the program");
    for (int i = 0; i < prices.length; i++) {
      i *= 3;
      try {
        System.out.format("\nThe price value at index %d in the list of prices is %.2f", i, prices[i]);
      } catch (Exception e) {
        System.out.format("\nAn error occurred when trying to access the price value at index %d.", i);
        System.out.format("\nException cause: %s.", e.getCause());
        System.out.format("\nException class: %s.", e.getClass().getName());
        System.out.format("\nException message: %s.", e.getMessage());
        System.out.format("\nException localized message: %s.", e.getLocalizedMessage());
        e.printStackTrace();
      }
      i /= 2;
    }
  }

  public void myMethod() {
    System.out.println("Welcome to java_apprentice.handling_errors");
  }
}
