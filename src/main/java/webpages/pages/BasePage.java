package webpages.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

  protected WebDriver driver;
  protected WebDriverWait wait;
  final Logger logger = (Logger) LogManager.getLogger(MainPage.class);
  public BasePage(WebDriver driver) {
    PageFactory.initElements(driver, this);
    this.driver = driver;
    this.wait = wait;
  }

}