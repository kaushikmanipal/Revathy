package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.generics.GenericMethods;
import com.training.pom.RealLoginPOM;
import com.training.pom.RealDashBoard;
import com.training.pom.doneQuis;
import com.training.pom.findHome;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class TC3 {

	private WebDriver driver;
	private String baseUrl;
	private RealLoginPOM loginPOM;
	public RealDashBoard dashBoardPOM;
	private doneQuis quisPOM;
	private findHome fh;
	
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods GM;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new RealLoginPOM(driver); 
		dashBoardPOM = new RealDashBoard(driver);
		fh = new findHome(driver);
		GM = new  GenericMethods (driver);
		quisPOM = new doneQuis(driver);

		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	Assert.assertEquals("http://realestatem1.upskills.in/", baseUrl);

		
	}
		@Test
		public void A_validLoginTest() throws InterruptedException, AWTException {
		/*	loginPOM.clickLoginLink();
			loginPOM.sendUserName("admin");
			loginPOM.sendPassword("admin@123");
			loginPOM.clickLoginBtn(); 
			screenShot.captureScreenShot("First");
			
			Thread.sleep(5000);
			dashBoardPOM.home.click();*/
			
			
			Robot robot = new Robot();
		dashBoardPOM.newLaunch.click();
	System.out.println( "whether map displayed or not " + fh.map.isDisplayed()); 
	GM.assertText("Find Your Home" , "//h4[contains(text() , 'Find Your Home')]", "xpath", "Assert passed");
	
	
	GM.sendValue(fh.address, "Electronic city");
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL).click().perform();
	
	 java.util.List<WebElement> allOptions =   driver.findElements(By.xpath("//li[@class='active-result']")); 
	
	 for(WebElement s : allOptions) {
		 String str = s.getText();
		 System.out.println(str);
	 }
	 
	 
	fh.propertyType.click();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	//li[@class='active-result']
	driver.findElement(By.cssSelector("[class='col-md-6 ']:nth-of-type(2) .chosen-default")).click();

	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("//button[contains ( text(), 'Search')]")).click();
	Thread.sleep(3000);
	
	GM.assertText("new-launch projects in Bangalore " , "/html//div[@id='titlebar']/div[@class='container']//p[.='new-launch projects in Bangalore ']", "xpath", "Assert passed");
	
	
	
			
			
			
		}
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	} 
	
	
	
	
	
	
}
