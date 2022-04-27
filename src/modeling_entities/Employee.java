package modeling_entities;

public class Employee {
  private String name;
  private double experience;
  private double salary;
  private String title;

  public Employee() {

  }

  public Employee(String name, String title) {
    this.name = name;
    this.title = title;
  }

  public Employee(String name, String title, double experience, double salary) {
    this(name, title);
    this.experience = experience;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public String getTitle() {
    return title;
  }

  public double getExperience() {
    return experience;
  }

  public double getSalary() {
    return salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setExperience(double experience) {
    this.experience = experience;
  }

  public void update(String name, String title, double experience, double salary) {
    setName(name);
    setTitle(title);
    setExperience(experience);
    setSalary(salary);

    saveToDatabase();
  }

  public void update(String name) {
    update(name, title, experience, salary);
  }

  public void update(String name, String title) {
    update(name, title, experience, salary);
  }

  public double calculateBonus(float performancePercentage) {
    double bonus = salary * performancePercentage * 0.01;
    return bonus;
  }

  public double calculateIncrement() {
    double increment = 0.05;
    if (salary < 65000) {
      increment = 0.10;
    }
    salary += salary * increment;
    return increment;
  }

  public void printEmployeeInfo() {
    System.out.format("%s is a %s with %.2f experience making $%.2f.\n", name, title, experience, salary);
    System.out.format("After the performance review this year, %s received a bonus of $%.2f.\n", name,
        calculateBonus(10));
    System.out.format("Moreover, %s's salary increased by %.2f percent to $%.2f.\n\n", name, calculateIncrement() * 100,
        salary);
  }

  public void saveToDatabase() {
    System.out.format("Updating data to database .....(%s, %s, %.2f, %.2f).\n\n", name, title, experience, salary);
  }
}
