package java_apprentice.handling_errors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException {
  public static void main(String[] args) throws IllegalArgumentException {
    System.out.println("Starting the program...\n");
    System.out.println("Enter the GPA value to use: ");
    Scanner gpaInput = new Scanner(System.in);
    try {
      validateGpa(gpaInput.nextFloat());
    } catch (InputMismatchException e) {
      e.initCause(new IllegalArgumentException("Your input is not valid. Valid input must be a float.\n"));
      System.out.println("An exception has occurred: \n");
      System.out.println(e.getCause());
    } finally {
      gpaInput.close();
    }
    System.out.println("Ending the program...\n");
    System.out.println("Goodbye!");
  }

  public static void validateGpa(float gpa) throws IllegalArgumentException {
    if (gpa > 0 && gpa <= 4.0) {
      System.out.println("The final GPA entered is " + gpa);
      System.out.println("\n");
    } else {
      throw new IllegalArgumentException("Invalid GPA input. GPA value must be between 0 and 4.0.");
    }
  }
}
