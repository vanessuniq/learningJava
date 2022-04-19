package control_flow;

import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
    System.out.println("Hello, thank you for interacting with my program.");
    System.out.println("Enter the temperature in Farenheit: ");
    Scanner tempInput = new Scanner(System.in);
    while (!tempInput.hasNextFloat()) {
      System.out.println("Your input should be a number.");
      System.out.println("Please enter the temperature in Farenheit: ");
      tempInput = new Scanner(System.in);
    }
    float temp = tempInput.nextFloat();
    int tempInt = (int) temp;
    tempInput.close();
    System.out.format("It is %d F out there.%n", tempInt);
    if (tempInt >= 75) {
      System.out.println("It is a hot day!\n");
    } else if (tempInt >= 60) {
      System.out.println("It is chilly out there. Not too hot, not too cold.\n");
    } else {
      System.out.println("It's cold out there. Grab a sweater or a coat.\n");
    }
  }
}
