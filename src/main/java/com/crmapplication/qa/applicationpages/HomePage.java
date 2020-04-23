package com.crmapplication.qa.applicationpages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmapplication.qa.baseclasses.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[text()='Calendar']")
	WebElement calendarLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTitle(){
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContact() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public CalendarPage clickOnCalendar() {
		calendarLink.click();
		return new CalendarPage();
	}
}
