package com.redbus.webdriverCommonUtils;



	import java.awt.AWTException;
	import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class CommonClasses {

		Select sel=null;
		WebDriverWait wait=null;
		Alert alert=null;
		Actions act=null;
		JavascriptExecutor jse=null;
		
		public void  waitForPageToLoad(int seconds,WebElement xpath ){
			wait=new WebDriverWait(Driver.driver,seconds);
			wait.until(ExpectedConditions.elementToBeSelected(xpath));
		}
		public void impli(int seconds){
			Driver.driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		}
		public void selectByVisibleText(WebElement we,String eir){
			
			sel=new Select(we);
			sel.selectByVisibleText(eir);
			
		}
		  
	    public void selectByIndex(WebElement we,int eir){
			
			sel=new Select(we);
			sel.selectByIndex(eir);
			
		}
	 
	    public Alert sendKeysAlert(){
	    	alert=Driver.driver.switchTo().alert();
	    	return alert;
	    }
	    public void accept(){ 
	    	alert=Driver.driver.switchTo().alert();
	    	alert.accept();
	    }
	    
	    public void moveToElement(WebElement ele){
	    	
	    	act=new Actions(Driver.driver);
	    	act.moveToElement(ele).click().build().perform();
	    }
	    
	    public void getMeWindowsToHandle(){
	    	
	    	Set<String> windows=Driver.driver.getWindowHandles();
	    	
	    	Iterator<String> itr=windows.iterator();
	    	while(itr.hasNext()){
	    		itr.next();
	    		String child=itr.next();
	    		
	    		Driver.driver.switchTo().window(child);
	    	}
	    }
	public void getChildClosed(){
	    	
	    	Set<String> windows=Driver.driver.getWindowHandles();
	    	
	    	Iterator<String> itr=windows.iterator();
	    	while(itr.hasNext()){
	    		String parent=itr.next();
	    		String child=itr.next();
	    		
	    		Driver.driver.switchTo().window(child).close();
	    		Driver.driver.switchTo().window(parent);
	   
	    	}
	    }
	    public Robot robo() throws AWTException{
			return new Robot();
		}
	    
	    public void canvasActions(WebElement toElement,int x,int y,int s,int t){
	    	act=new Actions(Driver.driver);
	    	act.moveToElement(toElement, x, y).click().perform();
	    	
	    }
	    public void javascriptExecutor(WebElement ds){
	    	jse=(JavascriptExecutor)Driver.driver;
	    	jse.executeScript("var ej=arguement[0].click()", ds);
	    }
	    public String takingScreenShot(WebDriver driver,String screenShotName) throws IOException{
	    	
	    	TakesScreenshot ts=(TakesScreenshot)driver;
	    	File source=ts.getScreenshotAs(OutputType.FILE);
	    	String dest="C://users//luckie//desktop//"+screenShotName+".png";
	    	File destination=new File(dest);
	    	FileUtils.copyFile(source, destination);
	    	return dest;	
	    }

	}
