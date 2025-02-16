package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageobjects.HomePage;
import pageobjects.RegisterPage;

public class RegisterTest extends Base {

	public WebDriver driver;

	@BeforeMethod
	public void setup() throws IOException {

		driver = Initialize_Browser();
		driver.get(prop.getProperty("url"));
	}
	@Test(priority = 1)
	public void RegisterWithMandatoryFields() {
		HomePage homepage = new HomePage(driver);
		RegisterPage registerPage = new RegisterPage(driver);

		try {
			homepage.ClickOnMyAccountDropDownMenu();
			Thread.sleep(5000);
			homepage.RegisterButtonClick();
//		driver.wait(4000); // its deprecated.
			Thread.sleep(5000);
			registerPage.EnterFirstName(prop.getProperty("firstname"));
			registerPage.EnterLastName(prop.getProperty("lastname"));
			registerPage.EnterEmailid(prop.getProperty("validemail"));
			registerPage.EnterTelephoneNo(prop.getProperty("telephone"));
			registerPage.EnterPassword(prop.getProperty("validpassword"));
			registerPage.EnterPasswordConfirm(prop.getProperty("validpassword"));
			registerPage.NewsletterSubscribe();
			registerPage.PrivacyAgreement();
			registerPage.SubmitContinueButton();
			Thread.sleep(5000);
			String SuccessfulRegistration = registerPage.AssertionOnSuccessfulRegistration();
			System.out.println(SuccessfulRegistration);
			System.out.println(prop.getProperty("accountsuccessmessage"));
			Assert.assertEquals(SuccessfulRegistration,prop.getProperty("accountsuccessmessage"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 2, enabled=false)
	public void RegisterWithMandatoryFields_NegativeTC() throws Throwable {
		HomePage homepage = new HomePage(driver);
		homepage.ClickOnMyAccountDropDownMenu();
		Thread.sleep(5000);
		homepage.RegisterButtonClick();
//		driver.wait(4000); // its deprecated.
		Thread.sleep(5000);
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.EnterFirstName(prop.getProperty("firstname"));
		registerPage.EnterLastName(prop.getProperty("lastname"));
		registerPage.EnterEmailid(prop.getProperty("validemail"));
		registerPage.EnterTelephoneNo(prop.getProperty("telephone"));
		registerPage.EnterPassword(prop.getProperty("validpassword"));
		registerPage.EnterPasswordConfirm(prop.getProperty("validpassword"));
		registerPage.NewsletterSubscribe();
		registerPage.PrivacyAgreement();
		registerPage.SubmitContinueButton();
		Thread.sleep(5000);
		String SuccessfulRegistration = registerPage.AssertionOnSuccessfulRegistration();
		Assert.assertEquals(SuccessfulRegistration,prop.getProperty("accountsuccessmessage"));

	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
