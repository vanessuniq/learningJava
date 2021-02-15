// import the scanner package
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //create a scanner object
        Scanner input = new Scanner(System.in);
        // ask user for input
        System.out.println("Enter an integer: ");
        
        // read input
        int num = input.nextInt();

        // return the output to user
        System.out.println("You entered: " + num);

        // close the input scanner
        input.close();

    }
}
