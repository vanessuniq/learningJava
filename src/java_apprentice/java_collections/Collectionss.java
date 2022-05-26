package java_apprentice.java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Collectionss {
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
    System.out.println("Now dealing with ArrayList...\n");
    List<String> list = new ArrayList<>();
    list.add("Loved");
    list.add("Added");
    System.out.println("Is the list empty?: " + list.size());
    System.out.println("The list contains the word 'gpa': " + list.contains("gpa"));
    System.out.println("\nNow dealing with Linked List...\n");
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("grace");
    linkedList.add("faith");
    linkedList.add("abundance");
    System.out.println("Linked list: " + linkedList);
    Collections.sort(linkedList, new StringComparison());
    System.out.println("\nSorted linked list: " + linkedList);

    int index = linkedList.indexOf("grace");
    if (index == -1) {
      System.out.println("\nThe linked list does not contain the word 'grace'.");
    } else {
      System.out.println("\nThe word 'grace' was found in the linked list at index " + index);
    }

    System.out.println("\nGoodbye!\n");

  }
}

class StringComparison implements Comparator<String> {

  @Override
  public int compare(String string1, String string2) {
    return string1.compareTo(string2);
  }
}
