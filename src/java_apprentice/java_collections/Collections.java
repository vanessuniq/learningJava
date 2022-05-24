package java_apprentice.java_collections;

import java.util.Arrays;

public class Collections {
  public static void main(String[] args) {
    int[][] dims = new int[3][4];
    System.out.println("\n================================");
    System.out.println("Welcome ...\n");
    System.out.println("Printing the dimensional array...\n");
    System.out.println(Arrays.deepToString(dims));
    System.out.println("\nIterating over the dimensional array...\n");
    for (int[] array : dims) {
      System.out.println(Arrays.toString(array));
    }

    System.out.println("\nGoodbye!\n");
  }
}
