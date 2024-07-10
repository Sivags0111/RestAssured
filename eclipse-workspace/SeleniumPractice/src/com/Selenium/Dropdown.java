package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/dropdowns");

		WebElement drop = driver.findElement(By.xpath("//select[@id='fruits']"));

		Select s = new Select(drop);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("4");
		Thread.sleep(2000);
		s.selectByVisibleText("Banana");

		WebElement multi = driver.findElement(By.id("superheros"));
		Select s1 = new Select(multi);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		s1.selectByIndex(3);

		List<WebElement> list = s1.getOptions();
		int size = list.size();
		System.out.println(size);

		driver.close();

	}

}
