public class Operators {
    public static void main(String[] args) {
        /**
         * We will be learning different types of operators in Java and how to use them.
         * Operators are used to perform operations on variables and values. There are five types of Java operators:
         * assignment, arithmetic, relational, logical, bitwise and unary operators.
         * 
         */

        // Arithmetic Operators
        /**
         * 
         *   Operator	Operation
         * 
             +	        Addition
             -	        Subtraction
             *	        Multiplication
             /	        Division
             %	        Modulo Operation (Remainder after division)
         */
        // the modulo operator is mainly used with int data type; and the division of two integers
        // results in an integer. 

         int a = 10, b = 8;

         System.out.println("a + b = " + (a + b));
         System.out.println("a - b = " + (a - b));
         System.out.println("a * b = " + (a * b));
         System.out.println("a / b = " + (a / b));
         System.out.println("The remainder of a / b is " + (a % b));

         // Assignment operators
         // create variables
        int num = 4;
        int var;

        // assign value using =
        var = num;
        System.out.println("var using =: " + var);

        // assign value using =+
        var += num;
        System.out.println("var using +=: " + var);

        // assign value using =*
        var *= num;
        System.out.println("var using *=: " + var);

        // Relational operators used for comparison. returns true or false

        // == operator
        System.out.println(a == b);  

        // != operator
        System.out.println(a != b);  

        // > operator
        System.out.println(a > b);  

        // < operator
        System.out.println(a < b);  

        // >= operator
        System.out.println(a >= b);  

        // <= operator
        System.out.println(a <= b);  
        
    }
}
