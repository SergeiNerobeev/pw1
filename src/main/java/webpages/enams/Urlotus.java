package webpages.enams;

public enum Urlotus {

  URLOTUS("https://otus.ru/"), URLOTUS2("");

  private String url = "https://otus.ru/";

  Urlotus(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }
}
