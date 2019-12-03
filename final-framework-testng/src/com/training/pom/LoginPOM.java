package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	//****************   Identifying elements   ***********************//
	
	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement ClickLoginURL; 
	
	@FindBy(id="user_login")
	private WebElement Username; 
	
	@FindBy(id="user_pass")
	private WebElement Password;
	
	@FindBy(xpath="//input[@value='Sign In']")
	private WebElement SubmitButton;
	
	@FindBy(xpath="//a[contains(text(),'Lost Your')]")
	private WebElement ForgotPasswordLink;
	
	@FindBy(id="user_login")
	private WebElement ConfirmEmail;
	
	@FindBy(xpath="//input[@class='lostpassword-button']")
	private WebElement ResetPwdButton;
	
	//*****************     Declaring Methods   ***********************//
	
	public void ClickLoginURL() {
		this.ClickLoginURL.click();
	}

	public void Username(String Username) {
		this.Username.sendKeys(Username);
	}
	
	public void Password(String Password) {
		this.Password.sendKeys(Password);
	}
	
	public void SubmitButton() {
		this.SubmitButton.click();
	}
	
	//Lost your password URL method
	public void ForgotPasswordLink() {
		this.ForgotPasswordLink.click();
	}
	
	//Email confirmation
	public void ConfirmEmail(String ConfirmEmail) {
		this.ConfirmEmail.sendKeys(ConfirmEmail);
	}
	
	public void ResetPwdButton() {
		this.ResetPwdButton.click();
	}
}
