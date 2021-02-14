/**
 * HelloWorld
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // variables, data types and literal
    /**
     * Java is a statically-type language. There's no hoisting concept here, meaning variables must be declared
     * before being used. Data types are the type of data that can be stored in variables in Java. There are 8
     * primitive pre-defined data types in Java. These include:
     * 
     * boolean type: usually used for true/false condition. boolean variables have two possible values(true or false),
     * with the default value being false.
     * 
     * byte type: this is any 8-bit signed integer (values from -2^7 to 2^7 -1 or -128 and 127). The default value
     * here is 0. If we are certain that the value of a variable is an 8-bit integer, we should use the byte type
     * to be memory savyy.
     * 
     * short type:  this is any 16-bit signed integer (values from -2^15 to 2^15 -1). The default value is 0.
     * 
     * int type: this is any 32-bit signed integer (values from -2^31 to 2^31 -1). The default value is 0.
     * 
     * long type: this is any 64-bit signed integer (values from -2^63 to 2^63 -1). The default value is 0.
     * 
     * float type: this is a single precision 32-bit floating point with default value of 0.0f. It should never
     * be used for precise values like currency.
     * 
     * double type: this is a double precision 64-bit floating point and should not be used on precise values like
     * currency for example. The default value here is 0.0d.
     * 
     * char type: this is a 16-bit unicode character with minimum value of  '\u0000' (0) 
     * and the maximum value of'\uffff'. ASCII(65 - 90) => (A-Z); ASCII(97 - 122) => (a -z)
     * LEARN MORE ABOUT ASCII CODE here https://www.ascii-code.com/
     * 
     * Each variable is assigned a data type when declared; and that data type cannot be change
     * whitin the same scope. Also note that Java is case sensitive. best practice follows the camelCase nomenclature.
     * 
     */

        // boolean literals
        boolean flag = true;
        System.out.println(flag);

        // integer literals:
        int age = 28;
        System.out.println(age);
        // floating-point literals
        float myFloat = 3.4F;
        double myDouble = 3.4d;

        System.out.println(myDouble + myFloat);

        // byte literal
        byte num = 123;
        System.out.println(num);

        // short literal
        short shortNum = -3000;
        System.out.println(shortNum);

        // long literal
        long myLong = -42332200000L; // L at the end represents an interal literal of long type.
        System.out.println(myLong);

        // character literal (unicode character in single quote)
        char letter = 'V';
        System.out.println(letter);

        //String literal (this is not a primitive data but an object or String class)
        String programming = "Java";
        System.out.println(programming);
    }
    
}