package com.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/window.xhtml");

		String oldWindow = driver.getWindowHandle();

		WebElement openButton = driver.findElement(By.id("j_idt88:new"));
		openButton.click();

		Set<String> handles = driver.getWindowHandles();

		for (String newWindow : handles) {

			driver.switchTo().window(newWindow);
		}
		WebElement notificationButn = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[2]/a"));
		notificationButn.click();

		driver.close();

		driver.switchTo().window(oldWindow);

		WebElement openMultiple = driver.findElement(By.id("j_idt88:j_idt91"));
		openMultiple.click();

		int windowsOpened = driver.getWindowHandles().size();
		System.out.println("No.of Windows opened is " + windowsOpened);

		WebElement closeWindows = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		closeWindows.click();

		Set<String> newWindowsHandles = driver.getWindowHandles();

		for (String allWindows : newWindowsHandles) {
			if (!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
			
		}

	}
}
