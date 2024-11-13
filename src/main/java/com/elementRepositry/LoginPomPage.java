package com.elementRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityClasses.WebDriverUtility;

public class LoginPomPage {
    public LoginPomPage(WebDriver driver) {
        PageFactory.initElements(driver, this);    
    }

    @FindBy(id = "emailOrMobile")
    private WebElement emailOrPhoneTextField;

    @FindBy(id = "btnStep1")
    private WebElement nextButton;

    @FindBy(xpath = "(//button[contains(text(),'Continue')])[2]")
    private WebElement continueButton;

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    private WebElement loginLink;

    @FindBy(xpath = "(//a[text()='Login'])[2]")
    private WebElement loginButton;
    
	@FindBy(id = "captchaCodeSignIn")
	private WebElement getCaptLink;

	public WebElement getGetCaptLink() {
		return getCaptLink;
	}
	@FindBy(xpath = "//div[@class='onmodal__cross']")
	private WebElement getCrossLink;

	public WebElement getGetCrossLink() {
		return getCrossLink;
	}

    // Actions on elements
   
    public void clickLoginButton() {
        loginButton.click();
    }


    public WebElement getEmailOrPhoneTextField() {
		return emailOrPhoneTextField;
	}


    public void mobileNumber() {
    	emailOrPhoneTextField.sendKeys("9392398199");
    }
	public WebElement getNextButton() {
		return nextButton;
	}


	public WebElement getContinueButton() {
		return continueButton;
	}


	public WebElement getLoginLink() {
		return loginLink;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public void clickNextButton() {
        nextButton.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public boolean isUserLoggedIn() {
        return emailOrPhoneTextField.isDisplayed();
    }
    
    public WebElement CaptLink() {
		return getCaptLink;
	}
	

	public void GetCrossLink() {
		 getCrossLink.click();
	}
    
    
}
