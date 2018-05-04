package com.redbus.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage {

	
	@FindBy(xpath=".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div")
	private List<WebElement> firstBusDetail;
	public List<WebElement> firstBusDetail(){
		return firstBusDetail;
	}
	
}
