package control_flow;

import java.security.cert.PolicyNode;

public class ForLoop {
  public static void main(String[] args) {
    String[] treasureItems = { "Magic Book", "Silver spoon", "Gold", "History document" };

    System.out.println("Let the search for Gold begin!\n");
    int position = 0;
    for (String item : treasureItems) {
      if (item.equals("Gold")) {
        System.out.format("Yesss! We found the Gold item at position %d. Sweeeeet!\n", position);
        break;
      }
      System.out.format("%s is not the item of interest was not found yet ... Continuing with the search\n", item);
      position++;
    }
  }
}
