package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepositry.PriceAndTrendsPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;

public class PriceAndTrends {
	
	WebDriver driver = DriverFactory.getDriver();
	PriceAndTrendsPage price = new PriceAndTrendsPage(driver);
	WebDriverUtility webDriver = new WebDriverUtility();
	FileUtility file = new FileUtility();
	
	@Then("user should be able to click on the explorelocality")
	public void user_should_be_able_to_click_on_the_explorelocality() throws Exception {
		webDriver.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("TopLocalitiestab"));
		webDriver.scrollToElementJS(driver,price.getExplorelocalitybutton());
		Thread.sleep(3000);
	    webDriver.javascriptClick(driver, price.getExplorelocalitybutton());
	    Reporter.log("User clicked on explore locality button");
	}

	@Then("user is navigate to the locality page")
	public void user_is_navigate_to_the_locality_page() throws Exception {
		webDriver.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("Whitefieldtab"));
	    Assert.assertEquals(driver.getTitle(), file.getDataFromPropertiesFiles("Whitefieldtab"));
	    Reporter.log("User navigated to the locality page");
	}

	@Then("click on the Price and Trends option")
	public void click_on_the_price_and_trends_option() throws InterruptedException {
		webDriver.waitForElementPresent(driver, price.getPriceTrends());
	    price.PriceTrends();
	    Reporter.log("User is able to click on price and trends options");
	    Thread.sleep(2000);
	}

	@Then("click on the {int} in the for sale section")
	public void click_on_the_in_the_for_sale_section(Integer int1) throws Exception {
		String option = file.getDataFromExcel("Sheet1", int1-1, 0);
		switch (option) {

		case "apartment":
			price.apartments();
			Thread.sleep(2000);
			Reporter.log("Clicked on apartment");

			break;
			
		case "floor":
			webDriver.scrollToElement(driver, price.getFloor());
			price.floor();
			Thread.sleep(2000);
			Reporter.log("Clicked on floor");
			break;
			
		case "house":
			price.getGetHouse();
			Thread.sleep(2000);
			Reporter.log("Clicked on house");

			break;
		case "plot":
			price.plot();
			Thread.sleep(2000);
			Reporter.log("Clicked on plot");
			break;

		}
	}
}
