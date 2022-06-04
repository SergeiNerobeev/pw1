package webpages.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCardPage extends BasePage {
  public TestCardPage(WebDriver driver) {
    super(driver);
  }
  public void getTitleCard3() {
    String titleCard3Actual = driver.findElement(By.xpath("//div[contains(@class,'course-header2__title')]")).getText();
    String titleCard3Expected = "Java QA Engineer. Basic";
    Assert.assertEquals("Description of card 3 is wrong", titleCard3Expected, titleCard3Actual);
    logger.info("Название: " + titleCard3Expected);
  }
  public void getDescriptionCard3() {
    String descriptionActual = driver.findElement(By.xpath("//*[contains(@class,'course-header2__subtitle')]")).getText();
    String descriptionExpected = "Автоматизация тестирования на Java с нуля";
    Assert.assertEquals("Description of card 3 is wrong", descriptionExpected, descriptionActual);
    logger.info("Описание курса: " + descriptionExpected);
  }
  public void getDurationCard3() {
    String durationCard4Actual = driver.findElement(By.xpath("//*[contains(@class,'course-header2-bottom__content-item')]//*[contains(@class,'container__col_md-4')]//p[contains(@class,'course-header2-bottom__item-text')]")).getText();
    String durationCard4Expected = "4 месяца";
    Assert.assertEquals("Duration of card 3 is wrong", durationCard4Expected, durationCard4Actual);
    logger.info("Длительность: " + durationCard4Expected);
  }
  public void getFormatCard3() {
    String formatCard3Actual = driver.findElement(By.xpath("//*[contains(@class,'container__col_md-2')]//*[contains(@class,'course-header2-bottom__item-text')]")).getText();
    String formatCard3Expected = "Online";
    Assert.assertEquals("Format of card is wrong", formatCard3Expected, formatCard3Actual);
    logger.info("Формат: " + formatCard3Expected);
  }

  }


