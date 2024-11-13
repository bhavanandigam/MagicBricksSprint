package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepositry.LoginPomPage;
import com.elementRepositry.OpenPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MbAdviceOpen {
	WebDriver driver = DriverFactory.getDriver();
	FileUtility file = new FileUtility();
	LoginPomPage login = new LoginPomPage(driver);
	WebDriverUtility webDriver = new WebDriverUtility();
	OpenPage open = new OpenPage(driver);
	
	

	@Given("the user is logged in")
	public void the_user_is_logged_in() throws InterruptedException {
		//User is logging
		webDriver.mouseHover(driver, login.getLoginLink());
		login.clickLoginButton();
		webDriver.switchToTabOnTitle(driver, "User Login");
		webDriver.waitForElementPresent(driver, login.getEmailOrPhoneTextField());
		Thread.sleep(3000);
		login.mobileNumber();
		Thread.sleep(3000);
		login.clickNextButton();
		Thread.sleep(10000);
		login.clickContinueButton();
		Thread.sleep(5000);
		login.GetCrossLink();
		Reporter.log("User is logged in",true);
		
	}


	@Given("the browser is open and the URL is navigating to the webpage")
	public void the_browser_is_open_and_the_url_is_navigating_to_the_webpage() throws Exception {
		//The broswr is launched and navigated to the magicbrick url
		Assert.assertEquals(driver.getCurrentUrl(), file.getDataFromPropertiesFiles("url") );
		Reporter.log("User navigated to magicbricks url");
	}

	@When("the user hovers on the MB Advice option")
	public void the_user_hovers_on_the_mb_advice_option() {
		//Hovering on mbadvice
		webDriver.mouseHover(driver, open.getGetMBAdviceLink() );
		Reporter.log("User is Hover on MbAdvicelink",true);
	}

	@When("the user should be able to see sub-options in the MbAdvice")
	public void the_user_should_be_able_to_see_sub_options_in_the_mb_advice() throws InterruptedException {
		//Can see sub-options after hover
		Thread.sleep(4000);
		Assert.assertTrue(open.getLocalitiesandProperties().isDisplayed());
		Reporter.log("User is able to see the sub-options",true);
	}
	@Then("user should be click on localities and  should navigate to the localities in banglore")
	public void user_should_be_click_on_localities_and_should_navigate_to_the_localities_in_banglore() throws InterruptedException {
		 // Click on the "Localities in Bangalore" link or button
	    open.LocalitiesInBanglore();
	    Thread.sleep(3000); 

	    Reporter.log("User successfully navigated to the localities page in Bangalore", true);
	}

	
}
