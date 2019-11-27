package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealLoginPOM {
	private WebDriver driver; 
	
	public RealLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@id='responsive']//a[@href='http://realestatem1.upskills.in/my-profile/']")
	private WebElement loginLink; 
	
	
	@FindBy(xpath="/html//input[@id='user_login']")
	private WebElement userName; 
	
	@FindBy(xpath="/html//input[@id='user_pass']")
	private WebElement password;
	
	@FindBy(xpath="/html//div[@id='wrapper']/div[@class='container full-width']//article//div[@class='col-md-4 col-md-offset-4']/div/div/div/form[@action='http://realestatem1.upskills.in/wp-login.php']//input[@name='login']")
	private WebElement loginBtn; 
	
	
	
	public void clickLoginLink() {
		this.loginLink.click(); 
	}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}
