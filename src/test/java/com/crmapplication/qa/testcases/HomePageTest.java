package com.crmapplication.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crmapplication.qa.applicationpages.DesktopLandingPage;
import com.crmapplication.qa.applicationpages.HomePage;
import com.crmapplication.qa.applicationpages.LoginPage;
import com.crmapplication.qa.baseclasses.TestBase;

public class HomePageTest extends TestBase{
	DesktopLandingPage desktopPage;
	LoginPage loginPage;
	HomePage homePage;
	
/*	public HomePageTest() {
		super();
	}*/
	
	@BeforeSuite
	public void setUp(){
		initialization();
		desktopPage= new DesktopLandingPage();
		desktopPage.clickOnLogin();
		loginPage= new LoginPage();
		homePage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	}
	
	@Test
	public void HomePageTitle(){
		
		String title=homePage.validateHomePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}
	
}
