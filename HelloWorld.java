/**
 * HelloWorld
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // variables and literal
    /**
     * Java is a statically-type language. There's no hoisting concept here, meaning variables must be declared
     * before being used. Each variable is assigned a data type when declared; and that data type cannot be change
     * whitin the same scope. Also note that Java is case sensitive. best practice follows the camelCase nomenclature
     */
        // integer literals:
        int age = 28;
        System.out.println(age);
        // floating-point literals
        float myFloat = 3.4F;
        double myDouble = 3.4;

        System.out.println(myDouble + myFloat);

        // character literal (unicode character in single quote)
        char letter = 'V';
        //String literal
        String programming = "Java";

        System.out.println(letter);
        System.out.println(programming);

        // boolean literals

        boolean flag = false;
        System.out.println(flag);
    }
    
}