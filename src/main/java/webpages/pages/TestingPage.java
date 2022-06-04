package webpages.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class TestingPage extends BasePage {

//  WebDriverWait wait;
//  WebDriver driver;

  public TestingPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//*[contains(@class,'container container-lessons')]//a[contains(@href,'/lessons/java-qa-pro/?int_source=courses_catalog&int_term=testing')]")
  public WebElement card1;

  @FindBy(xpath = "//*[contains(@class,'container container-lessons')]//a[contains(@href,'/lessons/qajs/?int_source=courses_catalog&int_term=testing')]")
  public WebElement card2;

  @FindBy(xpath = "//*[contains(@class,'container container-lessons')]//a[contains(@href,'/lessons/java-qa-basic/?int_source=courses_catalog&int_term=testing')]")
  public WebElement card3;

  @FindBy(xpath = "//*[contains(@class,'container container-lessons')]//a[contains(@href,'/lessons/qa-auto-java-specialization/?int_source=courses_catalog&int_term=testing')]")
  public WebElement card4;

  @FindBy(xpath = "//*[contains(@class,'container container-lessons')]//a[contains(@href,'/lessons/kotlin-qa-engineer/?int_source=courses_catalog&int_term=testing')]")
  public WebElement card5;

  @FindBy(xpath = "//*[contains(@class,'container container-lessons')]//a[contains(@href,'/lessons/avtomatizaciya-web-testirovaniya/?int_source=courses_catalog&int_term=testing')]")
  public WebElement card6;

  @FindBy(xpath = "//*[contains(@class,'container container-lessons')]//a[contains(@href,'/lessons/loadqa/?int_source=courses_catalog&int_term=testing')]")
  public WebElement card7;

  @FindBy(xpath = "//*[contains(@class,'container container-lessons')]//a[contains(@href,'/lessons/qa-game/?int_source=courses_catalog&int_term=testing')]")
  public WebElement card8;

  @FindBy(xpath = "//*[contains(@class,'container container-lessons')]//a[contains(@href,'/lessons/qa-lead/?int_source=courses_catalog&int_term=testing')]")
  public WebElement card9;

  @FindBy(xpath = "//*[contains(@class,'container container-lessons')]//a[contains(@href,'/lessons/qa-engineer/?int_source=courses_catalog&int_term=testing')]")
  public WebElement card10;

  @FindBy(xpath = "//*[contains(@class,'container container-lessons')]//a[contains(@href,'/online/manualtesting/')]")
  public WebElement card11;

  public void cardsCounter() {
    List<WebElement> cards = new ArrayList<>();
    cards.add(card1);
    cards.add(card2);
    cards.add(card3);
    cards.add(card4);
    cards.add(card5);
    cards.add(card6);
    cards.add(card7);
    cards.add(card8);
    cards.add(card9);
    cards.add(card10);
    cards.add(card11);
    int etalon = 11;
    if (cards.size() >= etalon) {
      logger.info("Количество карточек на вебстранице равно: " + cards.size());
    } else {
      logger.info("Количество карточек на вебстранице не равно: " + cards.size());
    }
  }

      public TestCardPage clickOnCard3 () {
        card3 = driver.findElement(By.xpath("//*[contains(@class,'container container-lessons')]//a[contains(@href,'/lessons/java-qa-basic/?int_source=courses_catalog&int_term=testing')]"));
        String expectedHrefOfCard3 = "https://otus.ru/lessons/java-qa-basic/?int_source=courses_catalog&int_term=testing";
        Assert.assertEquals("Link of Card3 is wrong", expectedHrefOfCard3, card3.getAttribute("href"));

        card3.click();

        logger.info("Карточка №3 открыта");

        return new TestCardPage(driver);
      }
    }

