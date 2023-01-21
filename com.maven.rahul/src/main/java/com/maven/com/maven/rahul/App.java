package com.maven.com.maven.rahul;

/**
 * Hello world!
 *
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//driver.findElement(By.id("email")).sendKeys("rahulsoni442000@gmail.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("rahul");
		//driver.findElement(By.id("pass")).sendKeys("bh");
		driver.findElement(By.cssSelector("#pass")).sendKeys("jai");
		//driver.findElement(By.xpath("//*[@id=\'u_0_h_zo\']/text()")).click();
		//driver.findElement(By.cssSelector("#u_0_h_R6")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.quit();
	
	}
}

