package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepositry.SeeProjectsPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;

public class SeeAllProjects {
	
	WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility webDriver = new WebDriverUtility();
	SeeProjectsPage project = new SeeProjectsPage(driver);
	FileUtility file = new FileUtility();

	
	@Then("the user should click on the see all projects button")
	public void the_user_should_click_on_the_see_all_projects_button() throws Exception {
		webDriver.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("TopLocalitiestab"));
		Assert.assertEquals(driver.getTitle(),file.getDataFromPropertiesFiles("TopLocalitiestab"));
		project.SeeAllProjects();
		Thread.sleep(3000);
		Reporter.log("User clicked on see all projects button");
	}

	@Then("the user should click on a project")
	public void the_user_should_click_on_a_project() throws Exception {
		webDriver.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("NewProjectsInWgiteField"));
		Assert.assertEquals(driver.getTitle(),file.getDataFromPropertiesFiles("NewProjectsInWgiteField"));
		webDriver.javascriptClick(driver, project.getPhase());
		Reporter.log("User clicked on phase 1 project");
	}

	@Then("click on the Amenities link and return to the project details page")
	public void click_on_the_amenities_link_and_return_to_the_project_details_page() throws Exception {
		webDriver.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("SarangPahse"));
		webDriver.scrollToElementJS(driver, project.getViewAmenities());
		webDriver.javascriptClick(driver, project.getViewAmenities());
	    Thread.sleep(4000);
	    Reporter.log("User clicked on amenities");
	    webDriver.javascriptClick(driver, project.getBackAmenities());
	    Thread.sleep(4000);
	    Reporter.log("User closes on amenities");
	}

	@Then("click on the Specifications")
	public void click_on_the_specifications() {
		webDriver.scrollToElementJS(driver, project.getViewSpecifications());
		webDriver.javascriptClick(driver, project.getViewSpecifications());
		Reporter.log("User clicked on specifications");
	}
}
