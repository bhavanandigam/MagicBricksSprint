package com.elementRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Explore {
	public Explore(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Explore Rates & Trends in detail")
	private WebElement ratesAndTrends;

	public WebElement getRatesAndTrends() {
		return ratesAndTrends;
	}

	public void ratesAndTrends() {
		ratesAndTrends.click();
	}

	@FindBy(linkText = "Explore Locality")
	private WebElement exploreLocalityButton;

	public WebElement getExploreLocalityButton() {
		return exploreLocalityButton;
	}

	public void explorebutton() {
		exploreLocalityButton.click();
	}
	
	
}
