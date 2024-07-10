package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class searchHotel {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://adactinhotelapp.com/index.php");
		
		WebElement username=driver.findElement(By.xpath("//*[@id=\'username\']"));
		username.sendKeys("sivasubramaniyan");
		
		Thread.sleep(1000);
		WebElement password=driver.findElement(By.xpath("//*[@id=\'password\']"));
		password.sendKeys("thara@123");
		
		Thread.sleep(1000);
		WebElement login=driver.findElement(By.xpath("//*[@id=\'login\']"));
		login.click();
		
		WebElement location =driver.findElement(By.xpath("//*[@id=\'location\']"));
		location.click();
		Select select= new Select(location);
		select.selectByVisibleText("London");
		
		Thread.sleep(2000);
		WebElement hotels =driver.findElement(By.xpath("//*[@id=\'hotels\']"));
		hotels.click();
		Select selectHotel= new Select(hotels);
		selectHotel.selectByIndex(2);
		
		Thread.sleep(2000);
		WebElement noOfRooms =driver.findElement(By.xpath("//*[@id=\'room_nos\']"));
		noOfRooms.click();
		Select selectRoom= new Select(noOfRooms);
		selectRoom.selectByValue("1");
		
		Thread.sleep(1000);
		WebElement checkInDate=driver.findElement(By.xpath("//*[@id=\'datepick_in\']"));
		checkInDate.clear();
		checkInDate.sendKeys("30/12/2023");
		
		Thread.sleep(1000);
		WebElement checkOutDate=driver.findElement(By.xpath("//*[@id=\'datepick_out\']"));
		checkOutDate.clear();
		checkOutDate.sendKeys("01/01/2024");
		
		Thread.sleep(1000);
		WebElement noOfAdults =driver.findElement(By.xpath("//*[@id=\'adult_room\']"));
		noOfAdults.click();
		Select selectAdults= new Select(noOfAdults);
		selectAdults.selectByIndex(1);
		
		Thread.sleep(2000);
		WebElement noOfChild =driver.findElement(By.xpath("//*[@id=\'child_room\']"));
		noOfChild.click();
		Select selectChild= new Select(noOfChild);
		selectChild.selectByIndex(3);
		
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//*[@id=\'Submit\']"));
		search.click();
		
		Thread.sleep(2000);
		WebElement hotelBtn=driver.findElement(By.xpath("//*[@id=\'radiobutton_2\']"));
		hotelBtn.click();
		
		Thread.sleep(2000);
		WebElement continueBtn=driver.findElement(By.xpath("//*[@id=\'continue\']"));
		continueBtn.click();
		
			
	}

}
