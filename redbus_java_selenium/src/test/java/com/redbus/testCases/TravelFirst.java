package com.redbus.testCases;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.redbus.businessComponents.AllInRedBus;
import com.relevantcodes.extentreports.*;

public class TravelFirst {

	//AllInRedBus air=new AllInRedBus();
	WebDriver driver;
	 //static final  ExtentReports extent=ExtentReports.get(TravelFirst.class);
	//@Test
    //@Parameters("browser")
/*	public void  verifyPageLogin(String browserName){
		
		extent.init("C:\\Users\\luckie\\Desktop/extent1.html",true);
		extent.log(LogStatus.INFO, "starta et fiago");
		
		if(browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver","C:\\Users\\luckie\\Downloads/IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		} if(browserName.equalsIgnoreCase("chrome")){
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-notifications");
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\luckie\\Downloads/chromedriver.exe");
			 driver= new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
		
		driver.get("http://facebook.com");
		extent.log(LogStatus.INFO, "title found but still not collected.");
		String title=driver.getTitle();
		extent.log(LogStatus.INFO, "title get collected.");
		System.out.println(title +"################");
		Assert.assertTrue(title.contains("Facebook"));
		extent.log(LogStatus.INFO,"value checked.");
	}
	
	*/

	/*@Test
	@Parameters("browser")
	public void login_(String browserName){
		air.login(browserName);
	}*/
	/*@Test
	public void travelFirst() throws InterruptedException, AWTException{
		
		
		air.travelFirst("8", "18");
		Thread.sleep(2741);
		air.busDetails();
		
	}*/
}
