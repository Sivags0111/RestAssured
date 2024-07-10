package com.Selenium;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

	public static void main(String[] args) throws AWTException, InterruptedException  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();


		driver.get("https://www.leafground.com/file.xhtml");

		driver.manage().window().maximize();


		WebElement upload= driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt89\']"));
		upload.click();

		String file= "C:\\Users\\Siva\\Downloads\\download.jpg";

		StringSelection selection=new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);



	}

}
