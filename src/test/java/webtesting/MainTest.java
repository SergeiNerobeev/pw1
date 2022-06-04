package webtesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import webpages.enams.Urlotus;
import webpages.pages.*;

import java.time.Duration;

public class MainTest {

  public LoginPage loginPage;
  public MainPage mainPage;
  public TestingPage testingPage;
  public TestCardPage testCardPage;
  public CalendarEventsPage calendarEventsPage;
  public WebDriver driver;
  final Logger logger = (Logger) LogManager.getLogger(MainTest.class);

  @Before
  public void startUp() {

    WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
    logger.info("Logs on");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    loginPage = new LoginPage(driver);
    mainPage = new MainPage(driver);
    testingPage = new TestingPage(driver);
    testCardPage = new TestCardPage(driver);
    calendarEventsPage = new CalendarEventsPage(driver);
    driver.get(Urlotus.URLOTUS.getUrl());
  }

  @After
  public void tearDown() {
    if (driver != null)
      driver.close();
  }

  @Test
  public void test() throws Exception {

    mainPage.clickOnCoursesButton();
    mainPage.clickOnTestingButton();

    testingPage.cardsCounter();
    testingPage.clickOnCard3();
    testCardPage.getTitleCard3();
    testCardPage.getDescriptionCard3();
    testCardPage.getDurationCard3();
    testCardPage.getFormatCard3();

    mainPage.clickOnCoursesButton();
    mainPage.clickOnEventsButton();
    mainPage.clickOnCalendarButton();

    calendarEventsPage.clickOnCalendarEventsElement();
    calendarEventsPage.getSumEventsElemets();
    calendarEventsPage.getEventDays();

    Thread.sleep(5000);

  }
}