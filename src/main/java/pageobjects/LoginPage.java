package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 WebDriver driver;
 
 public LoginPage(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }
 


@FindBy(id="input-email")
 WebElement emailidAddress;
 
 @FindBy(id="input-password")
 WebElement inputPassword;
 
 @FindBy(xpath="//input[@value='Login']")
 WebElement LoginButton;
 
 @FindBy(xpath="(//div[@id='content']/h2)[1]")
 WebElement MyAccountSuccessPage; 
 
 public void InputEmailAddress(String emailid) {
	 emailidAddress.sendKeys(emailid);
 }
 public void InputPassword(String Password) {
	 inputPassword.sendKeys(Password);
 }
 public void LoginButtonClick() {
	 LoginButton.click();
 }
 public String myAccountSuccessPage() {
	 return MyAccountSuccessPage.getText();
 }
}
