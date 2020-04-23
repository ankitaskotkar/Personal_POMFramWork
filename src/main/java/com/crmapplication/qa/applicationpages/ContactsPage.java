package com.crmapplication.qa.applicationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmapplication.qa.baseclasses.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'Ankita')]//preceding-sibling::td//div")
	WebElement checkBox;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateContactPageTitle(){
		return driver.getTitle();
	}
	
	public String validateContact() {
		return driver.getCurrentUrl();
	}
	
	public void validateCheckBox(String name) {
		
		driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]//preceding-sibling::td//div")).click();
		
	}
	
	public void clickOnNewContactButton() {
		driver.findElement(By.xpath("//a[@href=\"/contacts/new\"]")).click();
	}
}