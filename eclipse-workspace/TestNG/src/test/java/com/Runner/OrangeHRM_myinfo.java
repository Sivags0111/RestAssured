package com.Runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.Manager.PageObjectManager;

import com.base.BaseClass;

public class OrangeHRM_myinfo extends BaseClass{

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = browserLaunch("chrome");
	}

	@Test
	public void orangeHRM_Login() {

		PageObjectManager pom = new PageObjectManager(driver);

		urlLaunch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		sendvalues(pom.getInstanceLP().getUsername(), "Admin");

		sendvalues(pom.getInstanceLP().getPassword(), "admin123");

		clickElement(pom.getInstanceLP().getLogin());

	}

	@Test(dependsOnMethods = "orangeHRM_Login")

	public void myInfo_Page() throws InterruptedException {

		PageObjectManager pom = new PageObjectManager(driver);


		clickElement(pom.getInstancemyInf().getMyInfoBtn());

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		clickElement(pom.getInstancemyInf().getFirstName());
		pressCtrlA(pom.getInstancemyInf().getFirstName());
		sendvalues(pom.getInstancemyInf().getFirstName(), "Sri");


		Thread.sleep(2000);
		clickElement(pom.getInstancemyInf().getMiddleName());
		Thread.sleep(1000);
		pressCtrlA(pom.getInstancemyInf().getMiddleName());
		sendvalues(pom.getInstancemyInf().getMiddleName(), "Ram");

		clickElement(pom.getInstancemyInf().getLastName());
		pressCtrlA(pom.getInstancemyInf().getLastName());
		Thread.sleep(1000);
		sendvalues(pom.getInstancemyInf().getLastName(), "Chandra");

		doubleClick_element(pom.getInstancemyInf().getEmployeeID());

		sendvalues(pom.getInstancemyInf().getEmployeeID(), "159357");


		doubleClick_element(pom.getInstancemyInf().getOtherId());

		sendvalues(pom.getInstancemyInf().getOtherId(), "963213585	");


		doubleClick_element(pom.getInstancemyInf().getDriervLicenseNum());

		sendvalues(pom.getInstancemyInf().getDriervLicenseNum(), "75534490");

		clickElement(pom .getInstancemyInf().getLicenseExpDate());
		Thread.sleep(1000);
		clickElement(pom .getInstancemyInf().getSelectExpDate());

		Thread.sleep(2000);
		clickElement(pom.getInstancemyInf().getNationality());

		Thread.sleep(1000);
		clickElement(pom.getInstancemyInf().getSelectIndian());

		Thread.sleep(1000);
		clickElement(pom.getInstancemyInf().getMaritalStatus());

		Thread.sleep(1000);
		clickElement(pom.getInstancemyInf().getSelectMarried());

		Thread.sleep(1000);
		clickElement(pom.getInstancemyInf().getdOB());

		Thread.sleep(1000);
		clickElement(pom.getInstancemyInf().getSelectdOB());

		Thread.sleep(1000);
		clickElement(pom.getInstancemyInf().getGenderBtn());

		Thread.sleep(1000);
		clickElement(pom.getInstancemyInf().getSaveSub());

		Thread.sleep(1000);
		clickElement(pom.getInstancemyInf().getBloodGrp());


		clickElement(pom.getInstancemyInf().getSelectbloodGrp());

		Thread.sleep(1000);
		clickElement(pom.getInstancemyInf().getSaveSub1());
	}

	@Test(dependsOnMethods = "myInfo_Page")

	public void logOut() throws InterruptedException {

		PageObjectManager pom = new PageObjectManager(driver);

		clickElement(pom.getInstancemyInf().getLogout());
		Thread.sleep(1000);

		clickElement(pom.getInstancemyInf().getLogoutBtn());

	}

	@AfterClass
	public void tearDown() {

				driver.quit();
	}
}
