package com.elementRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeeProjectsPage {
		
	public SeeProjectsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='https://www.magicbricks.com/new-projects-Whitefield-in-Bangalore' and @class='loc-card__all-project' and contains(text(), 'See all Projects')]")
	private WebElement seeAllProjects;

	public WebElement getSeeAllProjects() {
		return seeAllProjects;
	}
	
	public void SeeAllProjects() {
		 seeAllProjects.click();
	}
	
	@FindBy(xpath = "//a[text()='Sarang By Sumadhura Phase I']")
	private WebElement phase;

	public WebElement getPhase() {
		return phase;
	}
	
	public void phase() {
		 phase.click();
	}
	
	
	@FindBy(xpath="//div[@class='pdp__amenspecfic']/span[text()='View Amenities (']")
	private WebElement viewAmenities;

	@FindBy(xpath="//div[@class='slidepopup allAmenties open-state']/div/div[@class='popup__header__back']")
	private WebElement backAmenities;

	@FindBy(xpath="//div[@class='pdp__amenspecfic']/span[text()='View Specifications']")
	private WebElement viewSpecifications;

	public WebElement getViewAmenities() {
		return viewAmenities;
	}
	
	public void ViewAmenities() {
		viewAmenities.click();
	}

	public WebElement getBackAmenities() {
		return backAmenities;
	}
	
	public void backAmenities() {
		backAmenities.click();
	}

	public WebElement getViewSpecifications() {
		return viewSpecifications;
	}
	
	public void ViewSpecifications() {
		 viewSpecifications.click();
	}
	
}
