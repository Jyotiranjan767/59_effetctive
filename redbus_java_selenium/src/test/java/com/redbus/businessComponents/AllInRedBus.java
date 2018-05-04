package com.redbus.businessComponents;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.redbus.pagefactory.FrontPage;
import com.redbus.pagefactory.SecondPage;
import com.redbus.webdriverCommonUtils.CommonClasses;
import com.redbus.webdriverCommonUtils.Driver;

public class AllInRedBus {

	FrontPage fp=PageFactory.initElements(Driver.driver, FrontPage.class);
	SecondPage sp=PageFactory.initElements(Driver.driver, SecondPage.class);
	CommonClasses cc=new CommonClasses();
	
	
	public WebDriver login(String value){
		return Driver.cross_driver(value);
	}
	public void travelFirst(String startDate,String returnDate) throws InterruptedException, AWTException{
		
		//Driver.driver.get("https://www.redbus.in/?gclid=CP3o4pCM_tICFcQXaAodDo8NJw");
		
		Thread.sleep(2000);
		fp.from().sendKeys("Bangalore");
		Thread.sleep(1000);
		cc.robo().keyPress(KeyEvent.VK_ENTER);
		cc.robo().keyRelease(KeyEvent.VK_ENTER);
		fp.to().sendKeys("goa");
		Thread.sleep(1000);
		cc.robo().keyPress(KeyEvent.VK_ENTER);
		cc.robo().keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		fp.onDate().click();
		
	/*  for(int i=0;i<fp.onDateCal().size();i++){
		 
		  System.out.println("size ----->"+fp.onDateCal().size());
		  System.out.println(fp.onDateCal().get(i).getText());
		  System.out.println(fp.onDateCal().get(i).findElements(By.tagName("tr")).get(4).getText());
		  for(int j=0;j<fp.onDateCal().get(i).findElements(By.tagName("tr")).size();j++){
		 List<WebElement> sfth= fp.onDateCal().get(i).findElements(By.tagName("tr")).get(j).findElements(By
				 .tagName("th"));
		 for(WebElement ds:sfth){
			 System.out.println("th  size "+sfth.size());
			  System.out.println("@*$$$$$$$@*$@");
		 	  System.out.println(ds.getText());
		  }
		 
	 }
	  }*/
	  
	  Thread.sleep(3231);
	  for(int i=0;i<fp.onDateCal().size();i++){
			 
		/*  System.out.println("size ----->"+fp.onDateCal().size());
		  System.out.println(fp.onDateCal().get(i).getText());
		  System.out.println(fp.onDateCal().get(i).findElements(By.tagName("tr")).get(4).getText());*/
		  for(int j=0;j<fp.onDateCal().get(i).findElements(By.tagName("tr")).size();j++){
		 
		 List<WebElement> sftd= fp.onDateCal().get(i).findElements(By.tagName("tr")).get(j).findElements(By
				 .tagName("td"));
		  
		  for(WebElement ds:sftd){
			 // System.out.println("td  size "+sftd.size());
		 	 // System.out.println(ds.getText());
		 	  if(ds.getText().equalsIgnoreCase(startDate)){
		 		  ds.click();
		 	  }
		  }
		/*  List<WebElement> rftd= fp.returnDateCal().get(i).findElements(By.tagName("tr")).get(j).findElements(By
					 .tagName("td"));
		  for(WebElement ds:rftd){
			  System.out.println("td  size "+rftd.size());
		 	  System.out.println("on return calender "+ds.getText());
		 	  System.out.println(ds.getText());
		  }*/
	 }
	  }
	  fp.returnDate().click();
	  System.out.println("it's successfully clicked");
	  for(int i=0;i<fp.returnDateCal().size();i++){
		  System.out.println("it's successfully clicked inside even for loop");
		  for(int j=0;j<fp.returnDateCal().get(i).findElements(By.tagName("tr")).size();j++){
				 List<WebElement> sfth= fp.returnDateCal().get(i).findElements(By.tagName("tr")).get(j).findElements(By
						 .tagName("td"));
				 for(WebElement ds:sfth){
					 /*System.out.println("th  size "+sfth.size());
					  System.out.println("on return date for second for loop");
				 	  System.out.println(ds.getText());*/
				 	 if(ds.getText().equalsIgnoreCase(returnDate)){
				 		  ds.click();
				 	  }
				  }
	   }
		  
	  }
	  Thread.sleep(1311);
	  fp.searchBuses().click();
	}
	
	public void busDetails() throws InterruptedException{
		
		int size=sp.firstBusDetail().size();
	
		for (int i=0;i<size;i++){
			
			//System.out.println(size );

			for (int j=0;j<sp.firstBusDetail().get(i).findElements(By.tagName("div")).size();j++){
			//	System.out.println(sp.firstBusDetail().get(i).findElements(By.tagName("div")).size()+"@####");
		/*	System.out.println(sp.firstBusDetail().get(i).findElements(By.tagName("div")).get(j).
					getText());*/
			}
			List<WebElement> asd=sp.firstBusDetail().get(i).findElements(By.tagName("div"));
			for(WebElement sd:asd){
			//System.out.println("inside for loop "+sd.getText());
			if(sd.getText().equalsIgnoreCase("VIEW SEATS")){
				if(sd.isSelected())
				System.out.println(sd.getText());
				Thread.sleep(3104);
				cc.moveToElement(sd);
			} 
			}
		}
	}

	
	
}
