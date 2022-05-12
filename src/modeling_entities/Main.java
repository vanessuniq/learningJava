package modeling_entities;

import inheritanceandinterfaces.Book;
import inheritanceandinterfaces.FictionBook;

public class Main {
  public static void main(String[] args) {
    Student vanessa = new Student("Vanessa", 29, 3.59);
    vanessa.printStudentInfo();

    Employee matt = new Employee("Matt", "teacher", 3.5, 60000);
    matt.printEmployeeInfo();
    matt.update("Matthew");
    matt.printEmployeeInfo();

    Cookie c1 = new Cookie("Vaness", "hkklsf", 0);
    Cookie c2 = new Cookie("Jojo", "kslf", 3);
    System.out.println("\n(c1): " + c1 + ", " + Cookie.cookieType);
    System.out.println("\n(c2): " + c2);
    System.out.println("Total number of active cookies: " + Cookie.getAll());

    Book javaBook = new Book();
    System.out.println("Java Book binding type: " + javaBook.getBindingType());
    javaBook.bookInfo();
    javaBook.checkOutBook();
    FictionBook fictionBook = new FictionBook("Marvel");
    fictionBook.setBindingType("OnlinePDF");
    fictionBook.bookInfo();
    fictionBook.checkOutBook();
    System.out.println("Is fictionBook an instance of book?: " + ((fictionBook instanceof Book) ? "Yes" : "No"));
  }
}
