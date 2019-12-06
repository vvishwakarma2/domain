package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.training.generics.ScreenShot;
import com.training.pom.LoanPOM;
//import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoanCalculate {
	
	private WebDriver driver;
	private String baseUrl;
	//private LoginPOM loginPOM;
	private LoanPOM loanPOM;
	private static Properties properties;
	//private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//loginPOM = new LoginPOM(driver); 
		loanPOM = new LoanPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void Loancalculate() throws InterruptedException {
		
		loanPOM.NewLaunchHover();
		loanPOM.Nullam_hendrerit_Apartments();
		loanPOM.NextButton();
		loanPOM.NextButton();
		loanPOM.NextButton();
		loanPOM.NextButton();
		
		loanPOM.YourName("Selenium");
		loanPOM.YourEmail("selenium@gmail.com");
		loanPOM.YourSubject("apartment");
		loanPOM.YourMessage("Looking for apartment");
		loanPOM.SendButton();
		Thread.sleep(2000);
		
		loanPOM.SalePrice("40000");
		loanPOM.Downpayment("2000");
		loanPOM.NoOfYears("10");
		loanPOM.InterestRate("2");
		loanPOM.CalculateButton();
		
		Thread.sleep(2000);
	}

}
