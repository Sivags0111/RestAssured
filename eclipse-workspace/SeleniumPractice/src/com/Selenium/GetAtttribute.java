package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtttribute {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();	

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		
		String getAttributeText= driver.findElement
				(By.xpath("//*[@id=\'HTML31\']/div[1]/form/button")).getAttribute("value");
		
		System.out.println(getAttributeText);
		
	}

}
