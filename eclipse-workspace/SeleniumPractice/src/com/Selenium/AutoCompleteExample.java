package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompleteExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");
		
			WebDriver driver= new ChromeDriver();	
			
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			
			WebElement search= driver.findElement(By.id("APjFqb"));
			search.sendKeys("selenium");
			
			WebDriverWait wait = new WebDriverWait(driver, 5);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']//li"))); 
	        
			List<WebElement> elements= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
			
			System.out.println(elements.size());
			
			for (WebElement b:elements) {
				
				String element=b.getText();
				System.out.println(element);
				
				if(element.equalsIgnoreCase("selenium Download")) {
					
					b.click();
					
					break;
				}
				
				
			}
			
			
			driver.close();
	}

}
