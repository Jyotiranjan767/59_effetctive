package com.redbus.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Extent1 {

	/*WebDriver driver ;
	ExtentReports extent=ExtentReports.get(Extent1.class);
	String title;
	@BeforeTest
	public void initExtentReport(){
		
		extent.init("C://users//luckie//desktop//extent2.html", true);
		extent.startTest("myreportTest1");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\luckie\\Downloads/chromedriver.exe");
		 driver= new ChromeDriver();
	}
	@Test
	public void extentReport(){
		driver.get("http://facebook.com");
		extent.log(LogStatus.INFO, "site is opening");
		 title=driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"));
		extent.log(LogStatus.PASS, "validating the value ");
		Assert.assertNotEquals(title.length(), 5);
		extent.log(LogStatus.FAIL, "title length validating  ");
		extent.log(LogStatus.INFO, "title match found");
		extent.attachScreenshot("G:\\Music\\HouseFull/HouseFull - Front.jpg");
		extent.endTest();
	}
	@AfterTest
	public void closeBra(){
		Assert.assertNotEquals(title.length(), 5);
		driver.close();
	}
*/			
}
