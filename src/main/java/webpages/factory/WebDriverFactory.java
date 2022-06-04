package webpages.factory;

public class WebDriverFactory {

    private WebDriverFactory webDriverFactory;

//    public  static WebDriver getWebDriver (Browser browser){
//      switch (browser) {
//        case CHROME:
//          WebDriverManager.chromedriver();
//          return new ChromeDriver();
//        case FIREFOX:
//          WebDriverManager.firefoxdriver();
//          return new FirefoxDriver();
//        case OPERA:
//          WebDriverManager.operadriver();
//          return new OperaDriver();
//        default:
//          throw new RuntimeException("Incorrect BrowserName");
//      }
//    }

  public WebDriverFactory getWebDriverFactory() {
    return webDriverFactory;
  }

  public void setWebDriverFactory(WebDriverFactory webDriverFactory) {
    this.webDriverFactory = webDriverFactory;
  }
}
