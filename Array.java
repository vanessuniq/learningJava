import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /**
         * Java arrays have a fixed size. Here's the syntax to declare an array:
         * dataType[] arrayName;
         * where the dataType is either a primitive data type or java objects
         * and arrayName is the variable name that will contain the elements of the array.
         */
        // Declare and allocate memory of an array
        float[] floatArray = new float[10];
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = (float)i *2;
        }
        System.out.println(Arrays.toString(floatArray));

        // declare and initialize an array
        int[] ages = {12, 45, 29, 20, 19};

        int agesSize = ages.length, sum = 0;

        for (int i : ages) {
            sum += i;
        }

        double avg = (double)sum / (double)agesSize;
        System.out.println("The age average is " + avg);

        // copy an array
        //method 1
        int[] agesCopy = new int[ages.length];
        System.arraycopy(ages, 0, agesCopy, 0, agesSize);
        System.out.println(Arrays.toString(agesCopy));

        // method 2
        int[] agesPartial = Arrays.copyOfRange(ages, 0, 3);
        System.out.println(Arrays.toString(agesPartial));
    }
}
