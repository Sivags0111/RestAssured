package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement doubleClick=driver.findElement(By.xpath("//*[@id=\'HTML46\']/div[1]/button"));
		
		Actions actions=new Actions(driver);
		actions.doubleClick(doubleClick).build().perform();
		Thread.sleep(3000);

		WebElement accept=driver.findElement(By.xpath("//*[@id=\'HTML46\']/div[2]"));
		accept.click();
				
		
	}

}
