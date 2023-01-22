package com.maven.com.maven.rahul;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class ScriptOne {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyTitle() {
		String str = driver.getTitle();
		String tle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(str, tle);
		
	}
	
	@AfterMethod
	public void endTest() {
		driver.quit();
	}

}
