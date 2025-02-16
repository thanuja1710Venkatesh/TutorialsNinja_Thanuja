package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//*[text()='Qafox.com']")
	WebElement URLlaunchSuccessfulAssertion;
	
	@FindBy(xpath= "//span[text()='My Account']")
	WebElement MyAccountDropdown;

	@FindBy(xpath = "//*[text()='Register']")
	WebElement RegisterButton;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement loginButton;
	 

	public String uRLlaunchSuccessfulAssertion() {
		return URLlaunchSuccessfulAssertion.getText();
	}
	public void ClickOnMyAccountDropDownMenu() {
		MyAccountDropdown.click();
	}
	public void RegisterButtonClick() {
		RegisterButton.click();
	}
	public void LoginButtonClick() {
		loginButton.click();
	}

}
