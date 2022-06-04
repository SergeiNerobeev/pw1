package webpages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage{

  public MainPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//div[contains(@class,'header2-menu_main')]//p[contains(@class,'header2-menu__item-text')][contains(text(),'Курсы')]")
  public WebElement coursesButton;

  @FindBy(xpath = "//div[contains(@class,'header2-menu__item header2-menu__item_dropdown header2-menu__item_open')]//a[contains(@title,'Тестирование')]")
  public WebElement dropDownTesting;

  @FindBy(xpath = "//div[contains(@class,'header2-menu_main')]//p[contains(@class,'header2-menu__item-text')][contains(text(),'События')]")
  public WebElement eventsButton;

  @FindBy(xpath = "//div[contains(@class,'header2-menu_main')]//a[@title='Календарь мероприятий'][contains(text(),'Календарь мероприятий')]")
  public WebElement dropDownCalendar;

  public void clickOnCoursesButton() {
    coursesButton.click();
  }

  public TestingPage clickOnTestingButton() {
    dropDownTesting.click();
    return new TestingPage(driver);
  }

  public void clickOnEventsButton() {
    eventsButton.click();
  }

  public CalendarEventsPage clickOnCalendarButton() {
    dropDownCalendar.click();

    return new CalendarEventsPage(driver);
  }
}
