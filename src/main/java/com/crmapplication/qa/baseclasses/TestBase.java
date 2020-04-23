package com.crmapplication.qa.baseclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		 
		 try {
				prop = new Properties();
				FileInputStream ip = 
				new FileInputStream("C:\\Users\\akotkar\\study\\Personal_POMFramWork\\src\\main\\java\\com\\crmapplication\\qa\\config\\config.properties");
				prop.load(ip);
			} 
		catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		 
		 catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public void initialization(){
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")){
			  System.setProperty("webdriver.chrome.driver", prop.getProperty("systemPath")+"Personal_POMFramWork\\Drivers\\chromedriver.exe");	  
			   driver= new ChromeDriver();
		}else if(browserName.equals("FireFox")){
			 driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("pageLoadTimeOut")), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitWait")), TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
	}
	
}
