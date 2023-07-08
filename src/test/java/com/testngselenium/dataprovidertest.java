package com.testngselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class dataprovidertest {

		@Test
		public void TestGoogle() throws InterruptedException {
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("miit technology",Keys.ENTER);
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			driver.quit();
		}
		@Test
		public void Testyoutube() throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.youtube.com/");
			driver.findElement(By.id("search")).sendKeys("miit tech");
		
			System.out.println(driver.getTitle());
			Thread.sleep(50000);
			driver.quit();
		}
	}
