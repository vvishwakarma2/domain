package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanPOM {
	private WebDriver driver; 
	
	public LoanPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	//****************   Identifying elements   ***********************//
	
	@FindBy(xpath="//a[contains(text(),'New Launch ')]")
	private WebElement NewLaunch; 
	
	@FindBy(xpath="//img[starts-with(@class,'attachment') and contains(@src,'http://realestatem1.upskills.in/wp-content/uploads/2017/08/apartment01-345x250.jpg')]")
	private WebElement Nullam_hendrerit_Apartments;
		
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[4]/div/div/div[1]/button[2]")
	private WebElement NextButton; 
	
	@FindBy(xpath="//input[@name='your-name']")
	private WebElement YourName;
	
	@FindBy(xpath="//input[@name='your-email']")
	private WebElement YourEmail;
	
	@FindBy(xpath="//input[@name='your-subject']")
	private WebElement YourSubject;
	
	@FindBy(xpath="//textarea[@name='your-message']")
	private WebElement YourMessage;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement SendButton;
	
	@FindBy(xpath="//input[@placeholder='Sale Price']")
	private WebElement SalePrice;
	
	@FindBy(xpath="//input[@placeholder='Down Payment']")
	private WebElement Downpayment;
	
	@FindBy(xpath="//input[@placeholder='Loan Term (Years)']")
	private WebElement NoOfYears;
	
	@FindBy(xpath="//input[@placeholder='Interest Rate']")
	private WebElement InterestRate;
	
	@FindBy(xpath="//button[@class='button calc-button']")
	private WebElement CalculateButton;
	
	
	//*****************     Declaring Methods   ***********************//
	
	
	//Method to Hover over New launch option
	public void NewLaunchHover() throws InterruptedException {
		//Create object 'action' of an Actions class
		Actions action = new Actions(driver);
		//Mouseover on an element
		action.moveToElement(NewLaunch).perform();
		Thread.sleep(2000);
	}

	
	  public void Nullam_hendrerit_Apartments() 	{ this.Nullam_hendrerit_Apartments.click(); }
	 	
	  public void NextButton() 						{ this.NextButton.click();	}
		
	  public void YourName(String YourName) 		{ this.YourName.sendKeys(YourName); }
	 
	  public void YourEmail(String YourEmail) 		{ this.YourEmail.sendKeys(YourEmail); }
	  
	  public void YourSubject(String YourSubject) 	{ this.YourSubject.sendKeys(YourSubject); }
	  
	  public void YourMessage(String YourMessage) 	{ this.YourMessage.sendKeys(YourMessage); }
	  
	  public void SendButton() 						{ this.SendButton.click();	}
		 
	  public void SalePrice(String SalePrice) 		{ this.SalePrice.sendKeys(SalePrice); }
	  
	  public void Downpayment(String Downpayment) 	{ this.Downpayment.sendKeys(Downpayment); }
	  
	  public void NoOfYears(String NoOfYears) 		{ this.NoOfYears.sendKeys(NoOfYears); }
	  
	  public void InterestRate(String InterestRate) { this.InterestRate.sendKeys(InterestRate); }
	  
	  public void CalculateButton() 				{ this.CalculateButton.click(); }
}
