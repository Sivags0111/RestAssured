package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");
				
				WebDriver driver= new  ChromeDriver();
				 
				driver.get("https://www.tnpsc.gov.in/");
				
				driver.manage().window().maximize();
				
				WebElement toolTip= driver.findElement(By.xpath("//*[@id=\'gsc-i-id1\']"));
				

				String toolTipText =toolTip.getAttribute("title");
				
				System.out.println(toolTipText);
				
				driver.quit();
				
				
		
	}

}
