package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/frame.xhtml");

		List<WebElement> countFrame = driver.findElements(By.tagName("iframe"));
		int frameCount = countFrame.size();

		System.out.println("Number of frames in 'Count Frame':" + frameCount);
		
		List<WebElement> countFrame1 = driver.findElements(By.xpath("//*[@id=\'j_idt88\']/div/div[1]/div[1]/h5"));
		int frameCount1 = countFrame.size();

		System.out.println("Number of frames in 'Inside Frame':" + frameCount1);
		
		List<WebElement> countFrame2 = driver.findElements(By.xpath("//*[@id=\'Click\']"));
		int frameCount2 = countFrame.size();

		System.out.println("Number of frames in 'Nested Frame':" + frameCount2);

		driver.close();
	}

}
