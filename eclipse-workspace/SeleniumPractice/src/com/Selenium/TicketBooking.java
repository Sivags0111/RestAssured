package com.Selenium;

import java.awt.Window;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TicketBooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Siva\\Downloads\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();

		driver.navigate().to("https://www.makemytrip.com/");


		WebElement bus= driver.findElement
				(By.xpath("//*[@id=\'SW\']/div[1]/div[2]/div/div/nav/ul/li[6]/span/a/span[2]"));
		bus.click();

		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement from =wait.until
				(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'fromCity\']")));

		from.click();

		WebElement input=wait.until
				(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")));
		input.sendKeys("thanjavur");
		
		Thread.sleep(2000);
		
		WebElement thanjai= driver.findElement
				(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/p/span"));
		thanjai.click();
		
		Thread.sleep(2000);
		WebElement to=driver.findElement
				(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/input"));
		to.sendKeys("chennai");
		
		Thread.sleep(2000);
		WebElement chen= driver.findElement
				(By.xpath("//*[@id=\'react-autowhatever-1-section-0-item-0\']/div/p/span"));
		chen.click();
		

		Thread.sleep(2000);
		WebElement sldate=
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[2]"));
		sldate.click();
		
		
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//*[@id=\'search_button\']"));
		search.click();
		

		
		Thread.sleep(2000);
		WebElement slBus=driver.findElement(By.xpath("//*[@id=\'busList\']/div[2]/div[2]/div[7]/div[2]/div"));
		slBus.click();
		
		Thread.sleep(2000);
		WebElement slSeat=
		driver.findElement(By.xpath("//*[@id=\'busList\']/div[2]/div[2]/div[7]/div[3]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[11]/div/li/span[1]"));
		slSeat.click();
		
		Thread.sleep(2000);
		WebElement continueBtn=
		driver.findElement(By.xpath("//*[@id='busList']/div[2]/div[2]/div[7]/div[3]/div/div/div[2]/div[3]/div/div[2]/span"));
		continueBtn.click();
		
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("//*[@id=\'fname\']"));
		name.sendKeys("SivaG");
		
		Thread.sleep(2000);
		WebElement age=driver.findElement(By.xpath("//*[@id=\'age\']"));
		age.sendKeys("35");

		Thread.sleep(2000);
		WebElement gender=driver.findElement(By.xpath("//*[@id=\'trv_form_L12\']/form/div/div[4]/div/div[1]"));
		gender.click();

//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("window.scrollTo(0,1650,)","");

		Thread.sleep(2000);
		WebElement state=driver.findElement(By.id("dt_state_gst_info"));
		state.click();
		WebElement dropdn=driver.findElement(By.xpath("//*[@id='dt_gstn_container']/div/div[2]/div/ul/li[35]"));
		dropdn.click();
		
		Thread.sleep(2000);
		WebElement gstInfo=driver.findElement(By.xpath("//*[@id=\'dt_gstn_container\']/div/div[3]"));
		gstInfo.click();
		
		Thread.sleep(2000);
		WebElement emailID=driver.findElement(By.id("contactEmail"));
		emailID.click();
		emailID.sendKeys("sivaeee.tamil1@gmail.com");
		
		Thread.sleep(2000);
		WebElement mobileNumber=driver.findElement(By.id("mobileNumber"));
		mobileNumber.click();
		mobileNumber.sendKeys("9876543210");
		
		Thread.sleep(2000);
		WebElement continue1=driver.findElement(By.xpath("//*[@id='root']/div[4]/div/section[2]/div[3]/div[2]/div/span"));
		continue1.click();
		
		
	}

}

