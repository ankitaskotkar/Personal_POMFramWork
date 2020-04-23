package com.crmapplication.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
	@BeforeMethod
	public void setUp(){
		initialization();
		desktopPage= new DesktopLandingPage();		
		loginPage=desktopPage.clickOnLogin();
		loginPage= new LoginPage();
	}
	
	@Test
	public void validateLoginTest(){
		homePage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		
	}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
