package com.maven.com.maven.rahul;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScriptOne {
	WebDriver driver ;
	@Test
	public void f() {
	  
	    String baseUrl = "https://www.toolsqa.com/"; 
	    driver.get(baseUrl);
	    String testTitle = "Tools QA";
	    String originalTitle = driver.getTitle();
	    Assert.assertEquals(originalTitle, testTitle);
  }
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
		System.out.println("Launching Google Chrome browser");
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}
}