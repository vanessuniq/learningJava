package inheritanceandinterfaces;

public class Property {
  private final int size;
  private final String name;

  public Property(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public static String getType() {
    return "Unknown";
  }

  public int getSize() {
    return size;
  }

  public String getName() {
    return name;
  }

  public void printDetails() {
    System.out.format("\nProperty {name = '%s', type = '%s', size = %d}", name, getType(), size);
    System.out.println();
  }
}
