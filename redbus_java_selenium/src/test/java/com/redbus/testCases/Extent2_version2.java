package com.redbus.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.redbus.webdriverCommonUtils.CommonClasses;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent2_version2 {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	CommonClasses cc=new CommonClasses();
	
	@BeforeTest
	public void init1(){
		
		extent=new ExtentReports("C:/users/luckie/Desktop/extent3_version2.html");
		logger=extent.startTest("any_test_name");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\luckie\\Downloads/chromedriver.exe");
		 driver= new ChromeDriver();
	}
	@Test
	public void init_extent_v02(){
		driver.get("http://facebook.com");
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"));
		logger.log(LogStatus.INFO, "browser started to float ");
		Assert.assertNotEquals(title.length(),7);
		logger.log(LogStatus.PASS, "passed not gonna happen again anyhow ");
	}
	@AfterTest
	public void after_test_compiled(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE){
		String image=cc.takingScreenShot(driver, result.getName());
		String screenShot=logger.addScreenCapture(image);
		logger.log(LogStatus.FAIL,"title verification",screenShot);
		}extent.endTest(logger);
		extent.flush();
		driver.get("C:\\Users/luckie/desktop/extent3_version2.html");
	}
}
