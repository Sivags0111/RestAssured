package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotelRegistration {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://adactinhotelapp.com/index.php");
		
		WebElement newRegister= driver.findElement(By.linkText("New User Register Here"));
		newRegister.click();
		
		Thread.sleep(1000);
		WebElement username= driver.findElement(By.xpath("//*[@id=\'username\']"));
		username.sendKeys("sivasubramaniyan");
		
		Thread.sleep(2000);
		WebElement password= driver.findElement(By.xpath("//*[@id=\'password\']"));
		password.sendKeys("thara@0111");
		
		Thread.sleep(2000);
		WebElement confirmPWD= driver.findElement(By.xpath("//*[@id=\'re_password\']"));
		confirmPWD.sendKeys("thara@0111");
		
		Thread.sleep(2000);
		WebElement fullName= driver.findElement(By.xpath("//*[@id=\'full_name\']"));
		fullName.sendKeys("Sivasubramaniyan");
		
		Thread.sleep(2000);
		WebElement email= driver.findElement(By.xpath("//*[@id=\"email_add\"]"));
		email.sendKeys("sivaeee.tamil1@gmail.com");
		
		Thread.sleep(2000);
		WebElement captcha= driver.findElement(By.xpath("//*[@id=\'captcha-form\']"));
		captcha.click();
		
		Thread.sleep(5000);
		WebElement agree= driver.findElement(By.xpath("//*[@id=\'tnc_box\']"));
		agree.click();
		
		Thread.sleep(2000);
		WebElement register= driver.findElement(By.xpath("//*[@id=\'Submit\']"));
		register.click();
		
		
	}

}
