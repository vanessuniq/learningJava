package inheritanceandinterfaces;

public class FictionBook extends Book {
  private String subject;

  public FictionBook(String subject) {
    this.subject = subject;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }
}
