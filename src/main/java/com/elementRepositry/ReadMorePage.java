package com.elementRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadMorePage {
	
	public ReadMorePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Read More")
	private WebElement readmore;

	public WebElement getReadmore() {
		return readmore;
	}
	public void Readmore() {
		 readmore.click();
	}
	
	@FindBy(xpath="//a[text()='Read Less']")
	private WebElement readless;

	public WebElement getReadless() {
		return readless;
	}
	public void Readless() {
		readless.click();
	}
}
