package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepositry.LoginPomPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginn {

	WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility webDriver = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	LoginPomPage login = new LoginPomPage(driver);
	

	@When("user should be able to hover on login link")
	public void user_should_be_able_to_hover_on_login_link() throws InterruptedException {
		webDriver.mouseHover(driver, login.getLoginLink());
		Thread.sleep(3000);
	}

	@When("user should be able to click on login button and navigate to the login page")
	public void user_should_be_able_to_click_on_login_button_and_navigate_to_the_login_page() throws Exception {
		login.clickLoginButton();
		Thread.sleep(3000);
		webDriver.switchToTabOnTitle(driver,"User Login" );
		Thread.sleep(3000);
	}

	@When("user should be able to enter valid credentials and click on next button")
	public void user_should_be_able_to_enter_valid_credentials_and_click_on_next_button() throws Exception {
		webDriver.switchToTabOnTitle(driver, "User Login");
		login.getEmailOrPhoneTextField().sendKeys(fileUtility.getDataFromPropertiesFiles("mobilenumber"));;
		Thread.sleep(5000);
		login.clickNextButton();
		Thread.sleep(30000);
	}

	@When("user should be able to click on continue")
	public void user_should_be_able_to_click_on_continue() throws InterruptedException {
		login.clickContinueButton();
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
		Assert.assertTrue(login.isUserLoggedIn());
		Reporter.log("User is logged in");
	}
}
