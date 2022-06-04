package webpages.enams;

public enum Password {
  PASS_1("1qaz2wsx"), PASS_2(""), PASS_3("");

  private String password;

  Password(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }
}
