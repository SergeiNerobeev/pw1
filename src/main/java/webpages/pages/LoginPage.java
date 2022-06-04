package webpages.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webpages.enams.Login;
import webpages.enams.Password;

public class LoginPage extends BasePage {

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath ="//button[contains(@data-modal-id, 'new-log-reg')]" )
    private WebElement newLoginButton;

  @FindBy(xpath = "//input[@type='text'][contains(@class,'email')]")
    private WebElement loginField;

  @FindBy(xpath = "//input[@type='password'][contains(@class,'new-input')]")
    private WebElement passwordField;

  @FindBy(xpath = "//button[contains(text(),'Войти')]")
    private WebElement enterButton;

  public void clickNewLoginButton() {
    newLoginButton.click();
  }

  public void inputLogin() {
    loginField.sendKeys(Login.LOGIN_1.getLogin());
  }

  public void inputPassword() {
    passwordField.sendKeys(Password.PASS_1.getPassword());
  }


  public MainPage clickEnterButton(){
    enterButton.click();
    return new MainPage(driver);
  }


}
