package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[text()='Register Account'])[2]")
	WebElement onRgisterAccountPageAssertion;
	
	@FindBy(id="input-firstname")
	WebElement enterFirstName;
	
	@FindBy(id="input-lastname")
	WebElement enterLastName;
	
	@FindBy(id="input-email")
	WebElement enterEmailid;
	
	@FindBy(id="input-telephone")
	WebElement enterTelephoneNO;
	
	@FindBy(id="input-password")
			WebElement enterPassword;
	
	@FindBy(id="input-confirm")
	WebElement enterPasswordConfirm;
	
	@FindBy(xpath="//*[text()='No']")
	WebElement newletterSubscribe;
	
	@FindBy(name="agree")
	WebElement privacyAgreement;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement submitContinueButton;
	
	@FindBy(xpath="//*[text()='Congratulations! Your new account has been successfully created!']")
	WebElement assertionOnSuccessfulRegistration;
	 
	public void EnterFirstName(String Firstname) {
		enterFirstName.sendKeys(Firstname);
	}
	public void EnterLastName(String Lastname) {
		enterLastName.sendKeys(Lastname);
	}
	public void EnterEmailid(String emailid) {
		enterEmailid.sendKeys(emailid);
	}
	public void EnterTelephoneNo(String telephoneNo) {
		enterTelephoneNO.sendKeys(telephoneNo);
	}
	public void EnterPassword(String password) {
		enterPassword.sendKeys(password);
	}
	public void EnterPasswordConfirm(String passwordConfirm) {
		enterPasswordConfirm.sendKeys(passwordConfirm);
	}
	public void NewsletterSubscribe() {
		newletterSubscribe.click();
	}
	public void PrivacyAgreement() {
		privacyAgreement.click();
	}
	public void SubmitContinueButton() {
		submitContinueButton.click();
	}
	public String AssertionOnSuccessfulRegistration() {
		return assertionOnSuccessfulRegistration.getText();
	}

}
