package inheritanceandinterfaces;

public abstract class Property {
  private final int size;
  private final String type;
  private final String name;

  public Property(String name, String type, int size) {
    this.name = name;
    this.type = type;
    this.size = size;
  }

  public String getType() {
    return type;
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

  public abstract void calculateNewFees();
}
