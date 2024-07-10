package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert_ {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		
		WebElement simple=driver.findElement(By.id("accept"));
		simple.click();
		
		Alert a=  driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		
		WebElement confirm= driver.findElement(By.id("confirm"));
		Thread.sleep(2000);
		confirm.click();
		
		Alert a1=driver.switchTo().alert();
		a1.dismiss();
		
		WebElement prompt=driver.findElement(By.id("prompt"));
		prompt.click();
		
		Alert a2=driver.switchTo().alert();
		a2.sendKeys("Sivasubramaniyan");
		a2.accept();
		
		WebElement name=driver.findElement(By.id("myName"));
		String text = name.getText();
		System.out.println(text);
		
		
	}

}
