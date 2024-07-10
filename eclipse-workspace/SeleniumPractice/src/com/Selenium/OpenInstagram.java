package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenInstagram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		WebElement usrnm=
				driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/div[1]/div/label/input"));
		usrnm.sendKeys("ssss");
		WebElement pwd= 
				driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/div[2]/div/label/input"));
		pwd.sendKeys("1464kb");
		
		WebElement login=driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/div[3]"));
		login.click();
		
		WebElement fB= driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/div[5]/button/span[2]"));
		driver.navigate().to("https://www.facebook.com/login.php");
		
		
		
		
	}

}
