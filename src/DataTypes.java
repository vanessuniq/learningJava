import java.util.Arrays;

public class DataTypes {
  public static void main(String[] args) {
    boolean isJavaFun = true;
    byte courseCredit = 3;
    char gradeLetter = 'A';
    short numCourses = 3;
    int age = 22;
    long tuitionPaid = 25847L;
    float gpa = 3.68f;
    double incomeEarned = 66930.76d;
    // Non primitive
    String car = "Toyota";
    String[] otherCars = { "BMW", "Ford" };

    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
    System.out.println("Is Java fun to learn? : " + isJavaFun);
    System.out.println("Number of credits for the course : " + courseCredit);
    System.out.println("The student's grade in the course : " + gradeLetter);
    System.out.println("The number of courses the student has enrolled in : " + numCourses);
    System.out.println("The student's age : " + age);
    System.out.println("Cumulative tuition paid by the student : " + tuitionPaid);
    System.out.println("The student's GPA : " + gpa);
    System.out.println("Earned income : " + incomeEarned);
    System.out.println("The student usually drives a " + car);
    System.out.println("The student also has two other cars which brands are : " + Arrays.toString(otherCars));
    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");

  }
}
