package com.crmapplication.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crmapplication.qa.applicationpages.ContactsPage;
import com.crmapplication.qa.applicationpages.DesktopLandingPage;
import com.crmapplication.qa.applicationpages.HomePage;
import com.crmapplication.qa.applicationpages.LoginPage;
import com.crmapplication.qa.baseclasses.TestBase;

public class ContactPagetest extends TestBase{
	
	DesktopLandingPage desktopPage;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactPage;
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		desktopPage= new DesktopLandingPage();
		desktopPage.clickOnLogin();
		loginPage= new LoginPage();
		homePage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		contactPage=homePage.clickOnContact();
	}

	@Test(priority = 1)
	public void verifyContactPageTitleTest() {
		String title=contactPage.validateContactPageTitle();
		Assert.assertEquals(title, "wrong title");
	}
	
	@Test(priority = 2)
	public void VerifyContactURLTest() {
		String url=contactPage.validateContact();
		Assert.assertEquals(url, "https://ui.freecrm.com/contacts");
	
	}
	
	@Test(priority = 3)
	public void verifyContactCheckTest() throws InterruptedException {
		Thread.sleep(20000);
		contactPage.validateCheckBox("Ankita");
	}
	
	@Test(priority=4)
	public void verifyClickonNewContactTest() {
		contactPage.clickOnNewContactButton();
	}
	
	/*
	 * @AfterMethod public void tearDown(){ driver.quit(); }
	 */
	 
	 
}
