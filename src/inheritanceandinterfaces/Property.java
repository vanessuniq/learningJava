package inheritanceandinterfaces;

public class Property {
  private String type;
  private final int size;
  private final String name;

  public Property(String name, String type, int size) {
    this.name = name;
    this.type = type;
    this.size = size;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getSize() {
    return size;
  }

  public String getName() {
    return name;
  }

  public void printDetails() {
    System.out.format("\nProperty {name = '%s', type = '%s', size = %d}", name, type, size);
    System.out.println();
  }
}
