package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddNewProperty {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	/*
	 * @Test (priority=1) public void validLoginTest() { loginPOM.ClickLoginURL();
	 * loginPOM.Username("admin"); loginPOM.Password("admin@123");
	 * loginPOM.SubmitButton(); }
	 */

	@Test 
	public void AddPropertyNew() throws InterruptedException {
		
		loginPOM.ClickLoginURL();
		loginPOM.Username("admin");
		loginPOM.Password("admin@123");
		loginPOM.SubmitButton();
		
		loginPOM.ClickProperties();
		loginPOM.AddNewButton();
		loginPOM.AddTitle("New Launch by Vikas");
		loginPOM.TextArea("New Launch Project ~ Vikas");
		Thread.sleep(2000);
		loginPOM.PriceAmount("50000");
		Thread.sleep(2000);
		loginPOM.PricePerSqFt("200");
		Thread.sleep(2000);
		
		loginPOM.MainDetailsTab();  //Clicking on Main tab
		loginPOM.PropertyStatus("New");
		loginPOM.PropertyLocation("Electronic City");
		loginPOM.PropertyPossession("Immediate");
				
		loginPOM.LocationTab();  //Clicking on Location sub tab
		Thread.sleep(2000);
		loginPOM.FriendlyAddress("yeshwanthapur");
		loginPOM.GoogleMapAddress("yeshwanthapur");
		loginPOM.AddressLatitude("120");
		loginPOM.AddressLongitude("56");
		
		loginPOM.DetailsTab();   //Click on details tab
		Thread.sleep(2000);
		loginPOM.StorageRequired("2");
		
		Thread.sleep(2000);
		
		loginPOM.CheckBoxCentralBanglore(); //Click on checkbox

		Thread.sleep(200);

		loginPOM.ClickPublish();
		Thread.sleep(200);
	}
	 
}
