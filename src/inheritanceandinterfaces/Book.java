package inheritanceandinterfaces;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
  private String bindingType = "Paperback";
  private String name;

  public Book(String bindingType, String name) {
    this(name);
    this.bindingType = bindingType;
  }

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBindingType() {
    return bindingType;
  }

  public void setBindingType(String bindingType) {
    this.bindingType = bindingType;
  }

  public void checkOutBook() {
    System.out.format("The book %s has been checked out successfully!", name);
  }

  @Override
  public String toString() {
    List<Field> fields = new ArrayList<>(Arrays.asList(this.getClass().getSuperclass().getDeclaredFields()));
    fields.addAll(Arrays.asList(this.getClass().getDeclaredFields()));

    StringBuilder info = new StringBuilder("Book info");
    for (Field field : fields) {
      field.setAccessible(true);
      try {
        info.append(", " + field.getName() + ": " + field.get(this));
      } catch (IllegalArgumentException | IllegalAccessException e) {
        continue;
      }

    }
    return info.toString();
  }
}
