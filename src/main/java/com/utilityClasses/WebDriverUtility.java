 package com.utilityClasses;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

public class WebDriverUtility {
	public void implicitWaitAndMaximize(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
	
	public void waitForElementPresent(WebDriver driver , WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
	
	public void switchToTabOnUrl(WebDriver driver ,String partialUrl) {
		Set<String> childwindow = driver.getWindowHandles();
		for (String window : childwindow) {
			driver.switchTo().window(window);
			if (driver.getCurrentUrl().contains(partialUrl)) {
				break;
			}
		}
	}
	
	
	public void switchToTabOnTitle(WebDriver driver ,String partialTitle) {
		Set<String> childwindow = driver.getWindowHandles();
		for (String window : childwindow) {
			driver.switchTo().window(window);
			if (driver.getCurrentUrl().contains(partialTitle)) {
				break;
			}
		}
	}
	public void scrollVertically(WebDriver driver, int y) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, arguments[0]);", y);
    }
	 public void scrollToElement(WebDriver driver, WebElement element) {
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	    }
	
	public void switchToFrame(WebDriver driver , int index)	{
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(WebDriver driver , String nameID)	{
		driver.switchTo().frame(nameID);
	}
	
	public void switchToFrame(WebDriver driver , WebElement element )	{
		driver.switchTo().frame(element);
	}

	public void switchToAlertAndAccept (WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchToAlertAndCancel (WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void select(WebElement element , String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	
	public void select(WebElement element , int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void mouseHover(WebDriver driver , WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void doubleClick(WebDriver driver , WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	// New Method: JavaScript Click
    public void javascriptClick(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    // New Method: JavaScript Scroll To Position
    public void scrollToPosition(WebDriver driver, int x, int y) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(arguments[0], arguments[1]);", x, y);
    }

    // New Method: JavaScript Scroll To Element
    public void scrollToElementJS(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void handlePopups(WebDriver driver) throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='__st_preview_frame_bpn']")));
		driver.findElement(By.name("notnow")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//button[@aria-label=\"Close\"])[5]")).click();	
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//img[@title='close icon'])[2]"))).click().perform();
		
	}
 // New Method: JavaScript Hover
    public void javascriptHover(WebDriver driver, WebElement element) {
        String mouseOverScript = "var event = new MouseEvent('mouseover', { bubbles: true, cancelable: true }); arguments[0].dispatchEvent(event);";
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript(mouseOverScript, element);
    }
}
