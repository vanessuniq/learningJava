package modeling_entities;

import inheritanceandinterfaces.Automobile;
import inheritanceandinterfaces.Book;
import inheritanceandinterfaces.FictionBook;
import inheritanceandinterfaces.Lamborghini;
import inheritanceandinterfaces.ResidentialProperty;
import inheritanceandinterfaces.Sedan;
import inheritanceandinterfaces.ResidentialProperty.Type;

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

    Book javaBook = new Book("Java Learning");
    System.out.println("Java Book binding type: " + javaBook.getBindingType());
    System.out.println(javaBook);
    javaBook.checkOutBook();
    FictionBook fictionBook = new FictionBook("Marvel", "Galaxy");
    fictionBook.setBindingType("OnlinePDF");
    System.out.println("\n" + fictionBook);
    fictionBook.checkOutBook();
    System.out.println("\nIs fictionBook an instance of book?: " + ((fictionBook instanceof Book) ? "Yes" : "No"));

    ResidentialProperty alphaResidence = new ResidentialProperty("Gracious", Type.CONDO, 1800, 132.78);
    alphaResidence.printDetails();
    alphaResidence.calculateNewFees();
    System.out.println("New HOA fees for alphaResidence: $" + alphaResidence.getHoaFees());

    Automobile sedan = new Sedan("Honda", "Civic", 24000.00);
    System.out.println(sedan);
    System.out.println("\nIs sedan and instance of Automobile?: " + ((sedan instanceof Sedan) ? "Yes" : "No"));

    Automobile lambo = new Lamborghini("Aventura", 55300.00, 100);
    System.out.println(lambo);
  }
}
