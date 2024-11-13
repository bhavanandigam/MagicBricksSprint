package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepositry.ReadMorePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;

public class ReadMore {
		
	WebDriver driver = DriverFactory.getDriver();
	ReadMorePage read = new ReadMorePage(driver);
	WebDriverUtility webDriver = new WebDriverUtility();
	FileUtility file = new FileUtility();
	
	@Then("click on the read more option and see te read more data")
	public void click_on_the_read_more_option_and_see_te_read_more_data() throws Exception {
		webDriver.switchToTabOnTitle(driver, "Top Localities In Bangalore | List of Localities in Bangalore - MagicBricks");   
		webDriver.javascriptClick(driver, read.getReadmore());
		Thread.sleep(3000);

        // Assert that the 'Read More' button is displayed before clicking
        Assert.assertTrue(read.getReadmore().isDisplayed(), file.getDataFromPropertiesFiles("Readmore") );
        Reporter.log("The 'Read More' option is displayed.", true);
        Thread.sleep(3000);
        // Click on the 'Read More' button
        read.getReadless().click();
        Reporter.log("Clicked on 'Read less' option.", true);
		
	}
}
