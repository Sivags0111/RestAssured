package com.Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();


		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//*[@id=\'customers\']/tbody/tr[3]/td[2]"));
		
		System.out.println("That Particular data of 2nd row 2nd data");	
		
		
			String text= table.getText();
			System.out.println(text);
			
		}
		
	}

