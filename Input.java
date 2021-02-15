// import the scanner package
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //create a scanner object
        Scanner input = new Scanner(System.in);
        // ask user for integer input
        System.out.print("Enter an integer: ");
        
        // read input
        int num = input.nextInt();

        // return the output to user
        System.out.println("You entered: " + num);

        // ask for float input
        System.out.print("Enter a float: ");
        System.out.println("You entered: " + input.nextFloat());

        // ask for double
        System.out.print("Enter a double: ");
        System.out.println("You entered: " + input.nextDouble());

        // ask for string
        System.out.print("What is your name? ");
        System.out.println("Hey " + input.next() + "!");

        // close the input scanner. This is recommended after capturing the inputs
        input.close();

    }
}
