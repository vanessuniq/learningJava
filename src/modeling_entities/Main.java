package modeling_entities;

public class Main {
  public static void main(String[] args) {
    Student vanessa = new Student("Vanessa", 29, 3.59);
    System.out.format("Hello, my name is %s, I am %d, and my GPA is %,.2f.\n", vanessa.name, vanessa.age, vanessa.gpa);
  }
}
