package modeling_entities;

public class Main {
  public static void main(String[] args) {
    Student vanessa = new Student("Vanessa", 29, 3.59);
    vanessa.printStudentInfo();

    Employee matt = new Employee("Matt", "teacher", 3.5, 60000);
    matt.printEmployeeInfo();
    matt.update("Matthew");
    matt.printEmployeeInfo();

    Cookie c1 = new Cookie("ujefkj", "Vaness", "hkklsf", 0);
    System.out.println("\n(c1): " + c1 + ", " + Cookie.cookieType);
  }
}
