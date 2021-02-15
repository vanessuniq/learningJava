import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        int num = 8;
        // if-else-if statement
        if (num < 0) {
            System.out.println("The variable num is a negative number");
        } else if (num > 0) {
            System.out.println("The variable num is a positive number");
        } else {
            System.out.println("The variable num is zero");
        }
        
        // switch statement
        char operator;
        Double double1, double2, result = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Choose an operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter your first number: ");
        double1 = input.nextDouble();

        System.out.print("Enter your second number: ");
        double2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = double1 + double2;
                break;

            case '-':
                result = double1 - double2;
                break;

            case '*':
                result = double1 * double2;
                break;
                
            case '/':
                result = double1/double2;
                break;

            default:
                System.out.println("Unknown operator: thus, the following is not a valid operation.");
                break;
        }
        System.out.println(double1 + " " + operator + " " + double2 + " = " + result);

        /**
         * Note: The Java switch statement only works with:
         * 
         * Java Primitive data types: byte, short, char, and int
         * Java Enumerated types
         * Java String Class
         * Java Wrapper Classes: Character, Byte, Short, and Integer.
         */

        // for loop
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);

        // for-each loop to iterate through arrays
        int[] arr = {2,4,5,8,10};

        for (int i : arr) {
            System.out.print(i);
        }

        // while loop
        // ask user for numbers and add them until the input number is negative
        int sum1 = 0;
        System.out.print("Sum = " + sum1 +". Enter a number to add to Sum: ");
        int inputNum = input.nextInt();

        while (inputNum >= 0) {
            sum1 += inputNum;
            System.out.print("Sum = " + sum1 +". Enter a number to add to Sum: ");
            inputNum = input.nextInt();
        }
        System.out.println("The sum of all positive number you entered is " + sum1);
        input.close();
    }
}
