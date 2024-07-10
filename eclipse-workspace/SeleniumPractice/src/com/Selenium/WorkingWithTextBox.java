package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTextBox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.leafground.com/input.xhtml");
		
		WebElement typeUrName = driver.findElement(By.xpath("//*[@id=\'j_idt88:name\']"));
		typeUrName.sendKeys("SivaSubramaniyan");
		
		WebElement appendCountry =driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']"));
		 appendCountry.sendKeys(" India");
		 
		WebElement textBoxDisabled=driver.findElement(By.xpath("//*[@id=\'j_idt88\']/div[3]/div"));
		boolean enabled = textBoxDisabled.isEnabled();
		System.out.println(enabled);
		
		WebElement clearMe =driver.findElement(By.id("j_idt88:j_idt95"));
		clearMe.clear();
		
		String value=driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(value);
		
		WebElement typeEmailAndTab= driver.findElement(By.id("j_idt88:j_idt99"));
		typeEmailAndTab.sendKeys("test@gmail.com",Keys.TAB);
		
		WebElement aboutMyself= driver.findElement(By.id("j_idt88:j_idt101"));
		aboutMyself.sendKeys("Hi Im Siva. I am Learning Selenium.");
		
		WebElement enterAndConfirmError =driver.findElement(By.id("j_idt106:thisform:age"));
		enterAndConfirmError.sendKeys("Please enter any value ");
		
		
		
		
	
		
		
		
		
	}

}
