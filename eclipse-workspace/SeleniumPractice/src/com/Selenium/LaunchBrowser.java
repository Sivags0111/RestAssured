package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class LaunchBrowser {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		WebElement email= driver.findElement(By.id("email"));
		
		email.sendKeys("sivaasss");
			
		driver.findElement(By.id("pass")).sendKeys("sdw3656");
		
		driver.findElement(By.name("login")).click();
		
	}

}
