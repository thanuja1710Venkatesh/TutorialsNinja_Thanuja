package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginTest extends Base {
	WebDriver driver;
	

	@BeforeTest
	public void setup() throws IOException {
		try {
			driver = Initialize_Browser();
			driver.get(prop.getProperty("url"));
			Thread.sleep(3000);
//	String URLlaunchSuccessfulAssertion_Text = homePage.uRLlaunchSuccessfulAssertion();
//	System.out.println(URLlaunchSuccessfulAssertion_Text);
//	System.out.println(prop.getProperty("URLlaunchcheckText"));
//	Assert.assertEquals(prop.getProperty("URLlaunchcheckText"),URLlaunchSuccessfulAssertion_Text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void LoginWithValidCredentials() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		try {
			homePage.ClickOnMyAccountDropDownMenu();
			homePage.LoginButtonClick();
			loginPage.InputEmailAddress(prop.getProperty("validemail"));
			loginPage.InputPassword(prop.getProperty("validpassword"));
			loginPage.LoginButtonClick();
			String accountSuccessPage = loginPage.myAccountSuccessPage();
			System.out.println(accountSuccessPage);
			Assert.assertEquals("My Account",accountSuccessPage);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@AfterTest
	public void TearDown() {
		driver.quit();
	}

}
