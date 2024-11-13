package com.elementRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class stepSorting {

	public stepSorting(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='MB Advice']")
	private WebElement getMBAdviceLink;

	@FindBy(id = "rankingSort")
	private WebElement rank;

	@FindBy(xpath = "//div[text()='Rating ']")
	private WebElement rating;


	@FindBy(linkText = "Rajajinagar, Bangalore")
	private WebElement rankSorting;

	@FindBy(linkText = "Chinnapa Garden, Bangalore") 
	private WebElement ratingSorting;

	// Actions perfomed
	
	public void MBAdviceLink() {
		getMBAdviceLink.click();
	}

	public void ranking() {
		rank.click();
	}

	public void rating() {
		rating.click();
	}

	public WebElement getRankSorting() {
		return rankSorting;
	}

	public WebElement getRatingSorting() {
		return ratingSorting;
	}

//	public void rankingSorting() {
//		rankSorting.isDisplayed();
//	}
//
//	public void ratingSorting() {
//		rankSorting.isDisplayed();
//	}
}
