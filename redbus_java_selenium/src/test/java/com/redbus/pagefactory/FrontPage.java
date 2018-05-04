package com.redbus.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrontPage {

	
	@FindBy(xpath=".//*[@id='src']")
	private  WebElement from;
	
	public WebElement from(){
		return from;
	}
	
	
	@FindBy(xpath=".//*[@id='dest']")
	private  WebElement to;
	
	public WebElement to(){
		return to;
	}
	@FindBy(xpath=".//*[@id='search']/div/div[3]/div/label")
	private  WebElement onDate;
	
	public WebElement onDate(){
		return onDate;
	}
	@FindBy(xpath=".//*[@id='rb-calendar_onward_cal']/table/tbody")
	private  List<WebElement> onDateCal;
	
	public List<WebElement> onDateCal(){
		return onDateCal;
	}

	@FindBy(xpath=".//*[@id='search']/div/div[4]/div/label")
	private  WebElement returnDate;
	
	public WebElement returnDate(){
		return returnDate;
	}
	@FindBy(xpath=".//*[@id='rb-calendar_return_cal']/table/tbody")
	private  List<WebElement> returnDateCal;
	
	public List<WebElement> returnDateCal(){
		return returnDateCal;
	}
	
	
	@FindBy(xpath=".//*[@id='search_btn']")
	private  WebElement searchBuses;
	
	public WebElement searchBuses(){
		return searchBuses;
	}
}
