package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepositry.Explore;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;

public class ExploreRates {
	WebDriver driver = DriverFactory.getDriver();
	Explore explore = new Explore(driver);
	WebDriverUtility webDriver = new WebDriverUtility();
	FileUtility file = new FileUtility();
	
	@Then("the user clicks on explore locality button")
	public void the_user_clicks_on_explore_locality_button() throws Exception {
		// Switch to the relevant tab based on title
		webDriver.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("TopLocalitiestab"));
		
		 // Assert if the button is displayed before clicking
        Assert.assertTrue(explore.getExploreLocalityButton().isDisplayed(), file.getDataFromPropertiesFiles("Explorenotdisplayed"));
        Reporter.log("Explore Locality button is displayed.", true);
        
        // Click the button
        explore.explorebutton();
        Reporter.log("Clicked on Explore Locality button.", true);
	}

	@Then("the user clicks on explore rates and trends in detail")
	public void the_user_clicks_on_explore_rates_and_trends_in_detail() throws Exception {
		 // Switch to the tab with title matching the locality details
        webDriver.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("Whitefieldtab"));
        
        // Scroll to the element for Rates and Trends
        webDriver.scrollToElement(driver, explore.getRatesAndTrends());
        
     // Assert if the element is displayed before clicking
        Assert.assertTrue(explore.getRatesAndTrends().isDisplayed(), file.getDataFromPropertiesFiles("RatesStatment"));
        Reporter.log("Rates and Trends button is displayed.", true);
        
        // Click the Rates and Trends option
        Thread.sleep(2000);
        explore.ratesAndTrends();
        Reporter.log("Clicked on Rates and Trends button.", true);
	}
}
