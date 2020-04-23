package com.crmapplication.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crmapplication.qa.applicationpages.DesktopLandingPage;
import com.crmapplication.qa.applicationpages.LoginPage;
import com.crmapplication.qa.baseclasses.TestBase;

public class DesktopLandingTestPage extends TestBase {
	DesktopLandingPage desktopPage;
	LoginPage loginPage;
	/*public DesktopLandingTestPage() {
		super();	
	}*/
	@BeforeMethod
	public void setUp(){		
		initialization();
		desktopPage= new DesktopLandingPage();	
	}
	
	
	@Test(priority=1)
	public void DesktopLandingPageTitleTest(){
		String title=desktopPage.ValidateDesktopPageTitle();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
		System.out.println(title);
	}
	
	@Test(priority=2)
	public void DesktopLandingPageLogoTest(){
		boolean flag=desktopPage.validateDesktopPageLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest(){
		loginPage=desktopPage.clickOnLogin();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
