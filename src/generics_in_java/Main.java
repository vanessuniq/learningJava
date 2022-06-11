package generics_in_java;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("\nStarting the program...\n");
    System.out.println("******* Entern a number to check if it's even... *******");
    Scanner scanner = new Scanner(System.in);
    while (!scanner.hasNextDouble()) {
      System.out.println("\nError: " + scanner.next() + " is not a valid number.\nPlease enter a valid number: \n");
      scanner = new Scanner(System.in);
    }
    Double number = scanner.nextDouble();
    System.out.println("\nThe number " + number + " is even: " + MathUtils.isEven(number));
    System.out.println("\n******* Entern an integer to check if it's a prime number... *******");

    Scanner intScanner = new Scanner(System.in);
    while (!intScanner.hasNextInt()) {
      System.out
          .println("\nError: " + intScanner.next() + " is not a valid integer.\nPlease enter a valid integer: \n");
      intScanner = new Scanner(System.in);
    }
    Integer num = intScanner.nextInt();
    System.out.println("\nThe number " + num + " is prime: " + MathUtils.isPrime(num));
    scanner.close();
    intScanner.close();
  }
}
