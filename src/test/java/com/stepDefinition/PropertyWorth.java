package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepositry.PropertyWorthPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;

public class PropertyWorth {
	
	WebDriver driver = DriverFactory.getDriver();
	PropertyWorthPage property = new PropertyWorthPage(driver);
	WebDriverUtility webDriver = new WebDriverUtility();
	FileUtility file = new FileUtility();
	

	@Then("user should be able to click on propertyworth button in a locality")
	public void user_should_be_able_to_click_on_propertyworth_button_in_a_locality() throws Exception {
	   webDriver.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("TopLocalitiestab"));
	   property.propertyWorthButton();
	   Assert.assertEquals(driver.getTitle(), file.getDataFromPropertiesFiles("TopLocalitiestab") );
	   Reporter.log("User clicked on property worth button");
	}

	@Then("fill the requirments")
	public void fill_the_requirments() throws Exception {
	    webDriver.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("Propertyworth"));
	    property.flat(); // User is clicking on flat
	    property.twoBHk(); // user is clicking on 2bhk flat
	    property.superArea();//user is passing average value of land
	    property.getEstimate();
	    
	    Reporter.log("The user filled the details of the property worth");
	    webDriver.switchToTabOnTitle(driver,file.getDataFromPropertiesFiles("Propertyworth") );
	    Thread.sleep(3000);
	}
}
