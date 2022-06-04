package webpages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webpages.enams.DateOfEvent;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CalendarEventsPage extends BasePage{
  public CalendarEventsPage(WebDriver driver){
    super(driver);
  }
  WebDriverWait wait;
  JavascriptExecutor js;
  @FindBy(css = "div.dod_new-events__list.js-dod_new_events")
  private WebElement calendarEventsElement;
  @FindBys(@FindBy(xpath = "//div[contains(@class,'dod_new-events__list')]/a"))
  private List<WebElement> calendarEventsElementS;

  @FindBys(@FindBy(xpath = "//span[contains(@class,'dod_new-event__calendar-icon')]/following-sibling::span"))
  private List<WebElement> dates;
  @FindBy(css = "span.dod_new-events-dropdown__input-selected")
  private  WebElement openDayDropDownMenuButton;
  @FindBy(css = ".dod_new-events-dropdown__list-item[title='ДОД']")
  private WebElement openDayEventTitle;
  @FindBy(css = "div.dod_new-type__text")
  private WebElement openDayEventResult;
  @FindBys(@FindBy(css = "div.dod_new-type__text"))
  private List<WebElement> openDayEventResults;

  @FindBy(css = "div.footer2__links.footer2__links_center")
  private WebElement footer;
  @FindBy(xpath = "//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/android-professional/#event-2093')]")
  private WebElement lastEventHref;

  public void clickOnCalendarEventsElement(){
    calendarEventsElement.click();
  }
  public void getSumEventsElemets(){

    WebElement scrollElement2 = driver.findElement(By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/spark/#event-2085')]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement2);

    By container = By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/kotlin-qa-engineer/#event-2102')]");
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.presenceOfElementLocated(container));
    WebElement scrollElement3 = driver.findElement(By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/kotlin-qa-engineer/#event-2102')]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement3);

    By container2 = By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/highloadarchitect/#event-2067')]");
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.presenceOfElementLocated(container2));
    WebElement scrollElement4 = driver.findElement(By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/highloadarchitect/#event-2067')]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement4);

    By container3 = By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/cpp-professional/#event-2074')]");
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.presenceOfElementLocated(container3));
    WebElement scrollElement5 = driver.findElement(By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/cpp-professional/#event-2074')]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement5);

    By container39= By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/microservice-architecture/#event-2084')]");
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.presenceOfElementLocated(container39));
    WebElement scrollElement6 = driver.findElement(By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/microservice-architecture/#event-2084')]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement6);

    By container4 = By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/java-specialization/')]");
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.presenceOfElementLocated(container4));
    WebElement scrollElement7 = driver.findElement(By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/java-specialization/')]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement7);

    By container5 = By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/spark/#event-2086')]");
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.presenceOfElementLocated(container5));
    WebElement scrollElement8 = driver.findElement(By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/spark/#event-2086')]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement8);

    By container6 = By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/android-professional/#event-2093')]");
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.presenceOfElementLocated(container6));
    WebElement scrollElement9 = driver.findElement(By.xpath("//*[contains(@class,'dod_new-events__list')]//a[contains(@href,'https://otus.ru/lessons/android-professional/#event-2093')]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement9);

    calendarEventsElementS.size();

    logger.info("Количество отображаемых карточек на вебстранице равно: " + calendarEventsElementS.size());
  }

    public boolean getEventDays(LocalDate localDate){
    String dataSome = "01.06.2022";
    LocalDate data = LocalDate.parse(dataSome, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    return data.isBefore(localDate);
  }

  public String getEventDays() {
    List<WebElement> elements = driver.findElements(By.xpath(" //span[contains(@class,'dod_new-event__calendar-icon')]/following-sibling::span"));
    String str = null;
    for (WebElement element : elements) {
      str = element.getText();
      String today = DateOfEvent.JUNE6.getDateOfEvent();
      String after = DateOfEvent.JUNE7.getDateOfEvent();

      if(today.equals(str)) {
      logger.info("Данное мероприятие равно текущей дате " + today);
      }else{
      logger.info("Данное мероприятие больше текущей даты " + today);
      }
    }
    return str;
  }

  @FindBy(xpath = "//*[contains(@class,'dod_new-events__header-left')]//div[contains(@class,'dod_new-events-dropdown__input')]//*[contains(@class,'dod_new-events-dropdown__input-selected')]")
  private WebElement allEventsButtonMenu;

}


