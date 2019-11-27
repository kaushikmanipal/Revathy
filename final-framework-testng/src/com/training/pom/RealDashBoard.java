package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealDashBoard {
	public WebDriver driver; 
	
	public RealDashBoard(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@id='wp-admin-bar-site-name']/a[@href='http://realestatem1.upskills.in/']")
	public WebElement home; 
	
	//li[@id='wp-admin-bar-site-name']/a[@href='http://realestatem1.upskills.in/']
	
	
	@FindBy(xpath="//ul[@id='responsive']/li[2]/a")
	public WebElement  newLaunch ; 
	
	
	
	@FindBy(xpath="/html//ul[@id='responsive']/div/div/div/div[@class='wpmm-entry-title']/a[@title='Donec quis']")
	public WebElement  doneQuis ; 
	
	
	
	
	
	
	public void clickHomeLink() {
		this.home.click(); 
	}
	
	
	
	public void clickdoneQuis() {
		this.doneQuis.click(); 
	}
}
