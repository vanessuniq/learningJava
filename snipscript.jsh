//JShell Script

import java.util.List;
import java.util.ArrayList;

public class Product {
  private static final Random idGenerator = new Random();
  String id;
  String name;
  String description;
  double price;

  public Product (String name, String description, double price) {
    this.id = Integer.toString(Math.abs(idGenerator.nextInt()));
    this.name = name;
    this.description = description;
    this.price = price;
  }

  public String toString() {
    return String.format("Product { id: %s, name: %s, description: %s, price: $%.2f }", id, name, description, price);
  }
}
/types
// Read products from csv file:
String filePath = "/Users/vfotso/Development/code/java-learning/java-basic/products.csv";
FileReader fileReader = new FileReader(filePath);
BufferedReader reader = new BufferedReader(fileReader);

// Now iterate over the file line by line
String line = "";
List<Product> products = new ArrayList<>();

while((line = reader.readLine())!= null) {
  String[] prod = line.trim().split(",");
  System.out.println(Arrays.toString(prod));
  // Product product = new Product(prod[0].trim(), prod[1].trim(), Double.parseDouble(prod[2].trim()));
  // System.out.println(product.id);
  products.add(new Product(prod[0].trim(), prod[1].trim(), Double.parseDouble(prod[2].trim())));
}

products
