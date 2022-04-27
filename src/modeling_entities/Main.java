package modeling_entities;

public class Main {
  public static void main(String[] args) {
    Student vanessa = new Student("Vanessa", 29, 3.59);
    vanessa.printStudentInfo();

    Employee matt = new Employee("Matt", "teacher", 3.5, 60000);
    matt.printEmployeeInfo();
    matt.update("Matthew");
    matt.printEmployeeInfo();
  }
}
