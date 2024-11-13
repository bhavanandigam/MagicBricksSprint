package com.elementRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class OpenPage {
	
	public OpenPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='MB Advice']")
	private WebElement getMBAdviceLink;

	public WebElement getGetMBAdviceLink() {
		return getMBAdviceLink;
	}
	
	@FindBy(linkText = "Localities in Bangalore")
	private WebElement localitiesInBanglore;
	
	public void LocalitiesInBanglore() {
		 localitiesInBanglore.click();
	}
	@FindBy(xpath="//div[text()='Localities & Projects']")
	private WebElement LocalitiesandProjects;

	public WebElement getLocalitiesandProperties() {
		return LocalitiesandProjects;
	}
}
