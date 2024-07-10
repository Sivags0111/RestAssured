package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node01iretnu4joxv215x23dz28cmiu27194.node0");
		driver.manage().window().maximize();

		WebElement favorite = driver
				.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[1]/div/div[2]/span"));
		System.out.println("Before: " + favorite.isSelected());
		favorite.click();

		Thread.sleep(3000);

		WebElement unSelectable = driver.findElement(By.id("j_idt87:city2:2"));
		WebElement unSelectable1 = driver.findElement(By.id("j_idt87:city2:0"));
		WebElement unSelectable2 = driver.findElement(By.id("j_idt87:city2:1"));
		boolean	status1=unSelectable.isSelected();
		boolean	status2=unSelectable1.isSelected();
		boolean status3=unSelectable2.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		System.out.println(status3);



		driver.close();
	}

}
