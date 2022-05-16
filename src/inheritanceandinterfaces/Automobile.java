package inheritanceandinterfaces;

public interface Automobile {
  /**
   * Note: all methods in an interface are public and abstract by default.
   * We can omit the public modifier for the interfaces. If you try to specify
   * modifiers other than public, it will show an error.
   *
   * Fields or member variables of interfaces are public, static, and final.
   */

  String safetyAssessmentProgram = "Global NCAP";

  String getMake();

  String getModel();

  Double getPrice();
}
