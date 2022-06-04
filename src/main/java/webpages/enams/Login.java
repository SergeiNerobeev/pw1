package webpages.enams;

public enum Login {

  LOGIN_1("temiraj871@procowork.com"), LOGIN_2(""), LOGIN_3("");

  private String login;

  Login(String login) {
    this.login = login;
  }

  public String getLogin() {
    return login;
  }
}
