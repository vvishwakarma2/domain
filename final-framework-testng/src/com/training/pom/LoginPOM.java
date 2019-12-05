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
	
	@FindBy(xpath="//div[contains(text(),'Properties')]")
	private WebElement ClickProperties;
	
	@FindBy(xpath="//a[@class=\"page-title-action\"]")
	private WebElement AddNewButton;
	
	@FindBy(xpath="//input[@name=\"post_title\"]")
	private WebElement AddTitle;
	
	@FindBy(xpath="//textarea[@class='wp-editor-area']")
	private WebElement TextArea;
	
	@FindBy(id="_price")
	private WebElement PriceAmount;
	
	@FindBy(id="_price_per")
	private WebElement PricePerSqFt;
	
	@FindBy(id="ui-id-2")
	private WebElement MainDetailsTab;
	
	@FindBy(id="_status")
	private WebElement PropertyStatus;
	
	@FindBy(id="_location")
	private WebElement PropertyLocation;
	
	@FindBy(id="_possession")
	private WebElement PropertyPossession;
	
	@FindBy(id="ui-id-3")
	private WebElement LocationTab;
	
	@FindBy(id="_friendly_address")
	private WebElement FriendlyAddress;
	
	@FindBy(id="_address")
	private WebElement GoogleMapAddress;
	
	@FindBy(id="_geolocation_lat")
	private WebElement AddressLatitude;
	
	@FindBy(id="_geolocation_long")
	private WebElement AddressLongitude;
	
	@FindBy(id="ui-id-4")
	private WebElement DetailsTab;
	
	@FindBy(id="_storage_room")
	private WebElement StorageRequired;
	
	//@FindBy(xpath="//input[@type='checkbox' and @id='in-region-57']")
	@FindBy(xpath="//label[@class='selectit' and text()=' Central Bangalore']")
	private WebElement CheckBoxCentralBanglore;
		
	@FindBy(className="button button-primary button-large")
	private WebElement ClickPublish;
	
	
	
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
	
	public void ClickProperties() {
		this.ClickProperties.click();
	}

	public void AddNewButton() {
		this.AddNewButton.click();
	}
	
	public void AddTitle(String AddTitle) {
		this.AddTitle.sendKeys(AddTitle);
	}
	
	public void TextArea(String TextArea) {
		this.TextArea.sendKeys(TextArea);
	}
	public void PriceAmount(String PriceAmount) {
		this.PriceAmount.sendKeys(PriceAmount);
	}
	
	public void PricePerSqFt(String PricePerSqFt) {
		this.PricePerSqFt.sendKeys(PricePerSqFt);
	}
	
	//Clicking on main tab
	public void MainDetailsTab() {
		this.MainDetailsTab.click();
	}
	
	public void PropertyStatus(String PropertyStatus) {
		this.PropertyStatus.sendKeys(PropertyStatus);
	}
	
	public void PropertyLocation(String PropertyLocation) {
		this.PropertyLocation.sendKeys(PropertyLocation);
	}
	
	public void PropertyPossession(String PropertyPossession) {
		this.PropertyPossession.sendKeys(PropertyPossession);
	}
	
	//Clicking on Location tab
	public void LocationTab() {
		this.LocationTab.click();
	}
	
	public void FriendlyAddress(String FriendlyAddress) {
		this.FriendlyAddress.sendKeys(FriendlyAddress);
	}

	public void GoogleMapAddress(String GoogleMapAddress) {
		this.GoogleMapAddress.sendKeys(GoogleMapAddress);
	}
	
	public void AddressLatitude(String AddressLatitude) {
		this.AddressLatitude.sendKeys(AddressLatitude);
	}

	public void AddressLongitude(String AddressLongitude) {
		this.AddressLongitude.sendKeys(AddressLongitude);
	}

	//Clicking on Location tab
	public void DetailsTab() {
		this.DetailsTab.click();
	}
	
	public void StorageRequired(String StorageRequired) {
		this.StorageRequired.sendKeys(StorageRequired);
	}

	public void CheckBoxCentralBanglore() {
		this.CheckBoxCentralBanglore.click();
	}
	
	public void ClickPublish() {
		this.ClickPublish.click();
	}
	
}
