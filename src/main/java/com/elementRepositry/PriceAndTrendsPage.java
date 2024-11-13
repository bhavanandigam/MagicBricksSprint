package com.elementRepositry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityClasses.WebDriverUtility;

public class PriceAndTrendsPage {
	WebDriver driver;
	WebDriverUtility webDriver = new WebDriverUtility();
	public PriceAndTrendsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Price Trends')]")
	private WebElement priceTrends;

	public void PriceTrends() {
		 priceTrends.click();
	}
	
	public WebElement getPriceTrends() {
		return priceTrends;
	}

	@FindBy(xpath="//a[@href='https://www.magicbricks.com/Whitefield-in-Bangalore-Overview' and text()='Explore Locality']")
	private WebElement explorelocalitybutton;

	public void Explorelocalitybutton() {
//		 explorelocalitybutton.click();
		webDriver.javascriptClick(driver, explorelocalitybutton);
	}
	
	public WebElement getGetHouse() {
		return getHouse;
	}

	public WebElement getFloor() {
		return floor;
	}

	public WebElement getExplorelocalitybutton() {
		return explorelocalitybutton;
	}

	@FindBy(xpath="//div[@id='resi']/label[1]")
	private WebElement apartments;

	public WebElement getApartments() {
		return apartments;
	}
	@FindBy(xpath = "//label[contains(text(),'Residential House')]")
	private WebElement getHouse;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div[2]/div[7]/div/div[6]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/label[2]")
	private WebElement floor;
	
	public void house() {
		getHouse.click();
	}
	public void floor() {
		floor.click();
	}
	public void apartments() {
		apartments.click();
	}
	
	@FindBy(xpath="//input[@value='10000']")
	private WebElement plot;
	
//	public WebElement getPlot(WebDriver driver) {
//		
//		return driver.findElement(By.xpath("//input[@value='10000']"));
//	}
	
	public void plot() {
		plot.click();
	}
}
