package java_apprentice.handling_errors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FinallyBlock {
  public static void main(String[] args) {
    File file = new File("/Users/vfotso/Development/code/java-learning/java-basic/product.csv");
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(file));
      String line = "";
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (Exception e) {
      System.out.format("\nAn error occurred: the file '%s' does not exist.", file.getAbsolutePath());
    } finally {
      try {
        reader.close();
      } catch (IOException e) {
        System.out.println(e.getMessage());
        System.out.println("Error message: There is no reader to close.\n");
      }
    }
  }
}
