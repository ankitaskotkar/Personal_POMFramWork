package com.crmapplication.qa.applicationpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmapplication.qa.baseclasses.TestBase;

public class LoginPage extends TestBase{

	@FindBy(name="email")
	WebElement name;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(css=".ui.fluid.large.blue.submit.button")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un, String pass){
		name.sendKeys(un);
		password.sendKeys(pass);
		loginButton.click();
		
		return new HomePage();
	}
	
}
