package inheritanceandinterfaces;

import java.util.Calendar;

public interface Automobile {
  /**
   * Note: all instance methods in an interface are public and abstract by
   * default.
   * We can omit the public modifier for the interfaces. If you try to specify
   * modifiers other than public, it will show an error.
   *
   * Fields or member variables of interfaces are public, static, and final.
   */

  String safetyAssessmentProgram = "Global NCAP";

  String getMake();

  String getModel();

  Double getPrice();

  static String getFormattedCalendarString() {
    Calendar cal = Calendar.getInstance();
    return String.format("%s-%s-%s", cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.YEAR));
  }

  default String getReleaseDate() {
    return getFormattedCalendarString();
  }
}
