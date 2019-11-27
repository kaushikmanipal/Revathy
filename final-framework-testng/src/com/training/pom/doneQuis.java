package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class doneQuis {
	private WebDriver driver; 
	
	public doneQuis(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	

		
	

	@FindBy(xpath="	//h3[contains (text() , 'FOR ENQUIRIES')]")
	public WebElement  enquiryTitle; 
	
	
	@FindBy(xpath="/html//div[@id='widget_contact_widget_findeo-2']//div[@role='form']/form[@action='/donec-quis/#wpcf7-f4-o1']//input[@name='your-name']")
	private WebElement  name ; 
	
	@FindBy(xpath="/html//div[@id='widget_contact_widget_findeo-2']//div[@role='form']/form[@action='/donec-quis/#wpcf7-f4-o1']//input[@name='your-email']")
	private WebElement  mail ; 
	
	@FindBy(xpath="/html//div[@id='widget_contact_widget_findeo-2']//div[@role='form']/form[@action='/donec-quis/#wpcf7-f4-o1']//input[@name='your-subject']")
	private WebElement  subject ; 
	
	
	
	@FindBy(xpath="/html//div[@id='widget_contact_widget_findeo-2']//div[@role='form']/form[@action='/donec-quis/#wpcf7-f4-o1']//textarea[@name='your-message']")
	private WebElement  message ; 
	
	
	
	@FindBy(xpath="//div[@id='widget_contact_widget_findeo-2']//div[@role='form']/form[@action='/donec-quis/#wpcf7-f4-o1']//input[@value='Send']")
	private WebElement  submit ; 
	
	@FindBy(xpath="/html//input[@id='amount']")
	private WebElement  salePrice ; 
	
	@FindBy(xpath="/html//input[@id='downpayment']")
	private WebElement  downPayment ; 
	
	@FindBy(xpath="/html//input[@id='years']")
	private WebElement  loanYears ;
	
	@FindBy(xpath="/html//input[@id='interest']")
	private WebElement  Interest ;

	
	
	@FindBy(xpath="//div[@id='widget_mortgage_calc_properties-4']//button[@class='button calc-button']")
	private WebElement  calculate ;
	
	//@FindBy(xpath="//*[@id=\"widget_mortgage_calc_properties-4\"]/form/div[5]/div/strong")
	//private WebElement  mortageValue ;
	
	
	
	@FindBy(xpath="//div[@id='widget_mortgage_calc_properties-4']/form[@action='javascript:void(0);']//strong[@class='calc-output']")
	public WebElement value ;
	
	public void sendEnquiryName(String Name) {
		this.name.clear();
		this.name.sendKeys(Name);
	}
	
	public void sendEnquiryMail(String Mail) {
		this.mail.clear();
		this.mail.sendKeys(Mail);
	}
	
	public void sendEnquirySubject(String Subject) {
		this.subject.clear();
		this.subject.sendKeys(Subject);
	}
	
	public void sendEnquiryMessage(String Message) {
		this.message.clear();
		this.message.sendKeys(Message);
	}
	
	public void clickEnquirySubmit() {
		this.submit.click(); 
		
		
	}
	
	
	
	public void sendSalesPrice(String sale) {
		this.salePrice.clear();
		this.salePrice.sendKeys(sale);
	}
	public void sendDownPayment(String sale) {
		this.downPayment.clear();
		this.downPayment.sendKeys(sale);
	}
	
	public void sendLoanYears(String sale) {
		this.loanYears .clear();
		this.loanYears .sendKeys(sale);
	}
	
	public void sendInterest(String sale) {
		this.Interest .clear();
		this.Interest.sendKeys(sale);
	}
	
	public void clickCalulateSubmit() {
		this.calculate.click(); 
	}
	
	
	
}
