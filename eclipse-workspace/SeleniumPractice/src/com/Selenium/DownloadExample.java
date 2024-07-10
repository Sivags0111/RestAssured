package com.Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.leafground.com/file.xhtml");
		
		driver.manage().window().maximize();
		
		WebElement downloadLink= driver.findElement(By.xpath("//*[@id=\'j_idt93:j_idt95\']/span[2]"));
		downloadLink.click();
		Thread.sleep(3000);
		File fileLocaiton=new File("C:\\Users\\Siva\\Downloads");
		
		File[] totalFiles=fileLocaiton.listFiles();
		
		Thread.sleep(3000);

		for (File file : totalFiles) {
			
		if(file.getName().equals("TestLeaf Logo.png")) {
			
			System.out.println("File is Downloaded");
			break;
			
		}
		
		}
		}
		
		
	}

