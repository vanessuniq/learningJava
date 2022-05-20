//JShell Script

import java.util.List;
import java.util.ArrayList;

System.out.println("This program is a shell script");
System.out.println("The program reads a csv file of products detail, loads the data to a Product class, convert the price to EUR and then write the new data to a file called eu_products.csv.");

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
  try {
    products.add(new Product(prod[0].trim(), prod[1].trim(), Double.parseDouble(prod[2].trim())));
  } catch (Exception e) {
    System.out.format("Exception: %s found.\nSkipping product: %s\n", e.toString(), Arrays.toString(prod));
    continue;
  }

}
reader.close();
products

// Transformation of products data and write data to new file:
// Convert the price of each product from usd to eur
double USD_EUR = .94;

double usdToEur(double usdValue) {
  return USD_EUR * usdValue;
}

String outFilePath = "/Users/vfotso/Development/code/java-learning/java-basic/eu_products.csv";
BufferedWriter writer = new BufferedWriter(new FileWriter(outFilePath));

for(Product prod: products) {
  prod.price = usdToEur(prod.price);
  String line = String.format("%s, %s, %.2f %n", prod.name, prod.description, prod.price);
  writer.write(line);
}
writer.close();

System.out.println("The program has completed!");
/exit
