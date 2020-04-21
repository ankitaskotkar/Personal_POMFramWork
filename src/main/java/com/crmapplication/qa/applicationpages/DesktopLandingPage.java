package com.crmapplication.qa.applicationpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmapplication.qa.baseclasses.TestBase;

public class DesktopLandingPage extends TestBase{

	//Page Factory or Object Repository
	@FindBy(css=".icon.icon-xs.mdi-chart-bar")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@href='https://freecrm.com/;]")
	WebElement crmLOgo;
	
	//Initializing the Page Object
	public DesktopLandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String  ValidateDesktopPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateDesktopPageLogo(){
		return crmLOgo.isDisplayed();
	}
	
	public LoginPage clickOnLogin(){
		loginButton.click();
		
		return new LoginPage();
	}
}


