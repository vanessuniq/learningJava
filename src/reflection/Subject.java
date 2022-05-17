package reflection;

import java.util.Random;

public class Subject {
  private static final Random subjectIdGenerator = new Random();
  private int subjectId;
  private String subjectName;
  private int subjectCredit;
  private double subjectCost;

  public Subject() {
    this.subjectId = Math.abs(subjectIdGenerator.nextInt());
  }

  public Subject(String subjectName, int subjectCredit, double subjectCost) {
    this();
    this.subjectName = subjectName;
    this.subjectCredit = subjectCredit;
    this.subjectCost = subjectCost;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public int getSubjectCredit() {
    return subjectCredit;
  }

  public void setSubjectCredit(int subjectCredit) {
    this.subjectCredit = subjectCredit;
  }

  public double getSubjectCost() {
    return subjectCost;
  }

  public void setSubjectCost(double subjectCost) {
    this.subjectCost = subjectCost;
  }

  @Override
  public String toString() {
    return String.format("Subject { id: %s, name: %s, credit: %s, cost: %.2f }", subjectId, subjectName, subjectCredit,
        subjectCost);
  }
}
