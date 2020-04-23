package com.crmapplication.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.crmapplication.qa.applicationpages.CalendarPage;
import com.crmapplication.qa.applicationpages.ContactsPage;
import com.crmapplication.qa.applicationpages.DesktopLandingPage;
import com.crmapplication.qa.applicationpages.HomePage;
import com.crmapplication.qa.applicationpages.LoginPage;
import com.crmapplication.qa.baseclasses.TestBase;

public class HomePageTest extends TestBase{
	DesktopLandingPage desktopPage;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactPage;
	CalendarPage calendarPage;
	
/*	public HomePageTest() {
		super();
	}*/
	
	@BeforeMethod
	public void setUp(){
		initialization();
		desktopPage= new DesktopLandingPage();
		desktopPage.clickOnLogin();
		loginPage= new LoginPage();
		homePage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void HomePageTitleTest(){
		
		String title=homePage.validateHomePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority = 2)
	public void clickOnContactsPageTest() {
		contactPage=homePage.clickOnContact();
	}
	
	@Test(priority = 3)
	public void clickonCalendarPageTest() {
		calendarPage=homePage.clickOnCalendar();	
	}
	
	/*
	 * @AfterMethod public void tearDown(){ driver.quit(); }
	 */
}
