package com.crmapplication.qa.applicationpages;

import com.crmapplication.qa.baseclasses.TestBase;

public class CalendarPage extends TestBase{
	
	public String validateCalendarPageTitle(){
		return driver.getTitle();
	}
	
}
