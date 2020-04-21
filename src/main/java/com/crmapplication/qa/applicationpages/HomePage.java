package com.crmapplication.qa.applicationpages;


import com.crmapplication.qa.baseclasses.TestBase;

public class HomePage extends TestBase {

	public String validateHomePageTitle(){
		return driver.getTitle();
	}
}
