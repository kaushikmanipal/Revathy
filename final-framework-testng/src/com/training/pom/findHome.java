package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class findHome {
	public WebDriver driver; 
	
	public findHome(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//div[@id ='map-container']")
	public WebElement map;
	
	
	@FindBy(xpath="/html//input[@id='keyword_search']")
	public WebElement address;
	
	
	
	@FindBy(xpath="//div[@id='_property_type_chosen']//span[.='Property type']")
	public WebElement propertyType;
	
	
	
	@FindBy(xpath="/html//form[@id='realteo-search-form']/div/div/div//span[.='Any Regions']")
	public WebElement region;
	
	
	
	@FindBy(xpath="/html//form[@id='realteo-search-form']//button[@class='button fullwidth']")
	public WebElement search;
	
	
}
