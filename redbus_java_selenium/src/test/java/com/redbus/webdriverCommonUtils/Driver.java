package com.redbus.webdriverCommonUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

	public static WebDriver crossDriver;
	public static String browser;
	private  static  ChromeDriver driver1(){
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\luckie\\Downloads/chromedriver.exe");
		
		return new  ChromeDriver(co);
				
		
	}
	
	//public static WebDriver driver =driver1();
	
	public static WebDriver cross_driver(String browser){
		
	String[] checkBra={"ie","chrome","firefox"};
	for(int i = 0; i < checkBra.length; i++) {
		
	
	if(checkBra[i].equalsIgnoreCase(browser)){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\luckie\\Downloads/IEDriverServer.exe");
		return new InternetExplorerDriver();
	  }else if(checkBra[i++].equalsIgnoreCase(browser)){
			
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-notifications");
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\luckie\\Downloads/chromedriver.exe");
			 return new ChromeDriver();
	  }else{
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\luckie\\Downloads/geckodriver.exe");
	    return new FirefoxDriver();
		  
	  }
	 }
	return crossDriver;
	}
	
	public static WebDriver driver=cross_driver(browser);
		
	
	
}
