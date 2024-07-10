package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/waits.xhtml");
		
		WebElement clickbtn= driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/span"));
		clickbtn.click();

		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement HideBtn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'j_idt87:j_idt92\']/span")));
		HideBtn.click();
		
		WebElement clickability= wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt87:j_idt95")));
		clickability.click();
		
		WebElement second= driver.findElement(By.id("j_idt87:j_idt96"));
		second.click();
				
		WebElement changeBtn= driver.findElement(By.id("j_idt87:j_idt98"));
		changeBtn.click();
		
		

	}

}
