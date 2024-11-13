package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepositry.stepSorting;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;

public class SortingStep {

	WebDriver driver = DriverFactory.getDriver();
	stepSorting sort = new stepSorting(driver);
	WebDriverUtility webDriver = new WebDriverUtility();
	FileUtility file = new FileUtility();

	@Then("the user should be able to click on localities in Bangalore and navigate to the localities page")
	public void the_user_should_be_able_to_click_on_localities_in_bangalore_and_navigate_to_the_localities_page() {
		sort.MBAdviceLink();
		Reporter.log("User clicked on localities in Banglore");
	}

	@Then("the user should be able to sort the localities using rating")
	public void the_user_should_be_able_to_sort_the_localities_using_rating() throws Exception {
			webDriver.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("TopLocalitiestab"));
			sort.rating();
			Reporter.log("User is able to sort the localities using rating filter");
	}

	@Then("the localities sorted by rating are displayed")
	public void the_localities_sorted_by_rating_are_displayed() throws InterruptedException {
			
			webDriver.scrollToElementJS(driver, sort.getRatingSorting());
			Assert.assertTrue(sort.getRatingSorting().isDisplayed());
			Reporter.log("User is able to sort the localities using rating filter");
	}

	@Then("the user should be able to sort the localities using ranking")
	public void the_user_should_be_able_to_sort_the_localities_using_ranking() throws Exception {
			webDriver.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("TopLocalitiestab"));
			sort.ranking();
			Reporter.log("User is able to sort the localities using ranking filter");
	}

	@Then("the localities sorted by ranking are displayed")
	public void the_localities_sorted_by_ranking_are_displayed() throws InterruptedException {
			webDriver.scrollToElementJS(driver, sort.getRankSorting());
			Assert.assertTrue(sort.getRankSorting().isDisplayed());
			Reporter.log("User is able to sort the localities using ranking filter");
	}
}
