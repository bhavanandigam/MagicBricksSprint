package com.elementRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyWorthPage {
	
	public PropertyWorthPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='loc-card__prpworth']/span[2][text()=' 12500.0 sqft']")
	private WebElement propertyWorthButton;
	
	@FindBy(xpath="//label[@for='propertytype_10002']")
	private WebElement flat;
	
	@FindBy(xpath="//label[@for='bhk_11701']")
	private WebElement twoBHk;
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement superArea;
	
	@FindBy(xpath="//div[text()='Get Estimate']")
	private WebElement getEstimate;
	
	public void propertyWorthButton() {
		propertyWorthButton.click();
	}
	public void flat() {
		flat.click();
	}
	public void twoBHk() {
		twoBHk.click();
	}
	
	public void superArea() {
		superArea.sendKeys("23000");
	}
	
	public void getEstimate() {
		getEstimate.click();
	}
}
