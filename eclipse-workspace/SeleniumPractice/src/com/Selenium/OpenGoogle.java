	package com.Selenium;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class OpenGoogle {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");
			
			WebDriver driver = new  ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			driver.findElement(By.name("q")).sendKeys("Murugan"+Keys.ENTER);
			
			driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div/div[5]/div/a[3]")).click();
		}
	
	}
