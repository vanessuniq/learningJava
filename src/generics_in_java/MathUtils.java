package generics_in_java;

public class MathUtils {
  public static <T extends Number> boolean isEven(T element) {
    Number number = (Number) element;
    return number.doubleValue() % 2 == 0;
  }

  public static boolean isPrime(Integer element) {
    int divisor = element / 2;
    for (int i = 2; i <= divisor; i++) {
      if (element % i == 0) {
        return false;
      }
    }
    return true;
  }
}
