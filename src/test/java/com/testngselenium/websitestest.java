package com.testngselenium;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class websitestest {

	public String baseUrlString = "http://demo.guru99.com/test/newtours/";
	String driverpath = "C:\\Users\\user\\Desktop\\chromedriver.exe";

	public WebDriver driver;

	@Test
	public void verifyHomepageTitle() {
		System.out.println("Launching browser");
		System.setProperty("webdriver.gecko.driver", driverpath);
		driver = new ChromeDriver();

		driver.get(baseUrlString);
		String exString="Welcome: Mercury-Tours";
		
	String accString = driver.getTitle();
    	
    	Assert.assertEquals(accString, exString);
    	
//    	driver.quit();
		
		
	}

}
