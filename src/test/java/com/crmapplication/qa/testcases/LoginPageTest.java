package com.crmapplication.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crmapplication.qa.applicationpages.DesktopLandingPage;
import com.crmapplication.qa.applicationpages.HomePage;
import com.crmapplication.qa.applicationpages.LoginPage;
import com.crmapplication.qa.baseclasses.TestBase;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	DesktopLandingPage desktopPage;
	HomePage homePage;
	
	/*public LoginPageTest() {
		super();
	}*/
	@BeforeSuite
	public void setUp(){
		initialization();
		desktopPage= new DesktopLandingPage();		
		loginPage=desktopPage.clickOnLogin();
		loginPage= new LoginPage();
	}
	
	@Test
	public void validateLogin(){
		homePage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		
	}
		
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}
	

}
