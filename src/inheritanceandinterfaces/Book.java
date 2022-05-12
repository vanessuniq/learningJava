package inheritanceandinterfaces;

import java.lang.reflect.Field;

public class Book {
  private String bindingType = "Paperback";

  public String getBindingType() {
    return bindingType;
  }

  public void setBindingType(String bindingType) {
    this.bindingType = bindingType;
  }

  public void checkOutBook() {
    System.out.println("The book has been checked out successfully!");
  }

  public void bookInfo() {
    Field[] fields = this.getClass().getDeclaredFields();
    StringBuilder info = new StringBuilder("Book info: bindingType: " + bindingType);
    for (Field field : fields) {
      if (field.getName().equals("bindingType")) {
        continue;
      }
      field.setAccessible(true);
      try {
        info.append(", " + field.getName() + ": " + field.get(this));
      } catch (IllegalArgumentException | IllegalAccessException e) {
        continue;
      }

    }
    System.out.println(info.toString());
  }
}
