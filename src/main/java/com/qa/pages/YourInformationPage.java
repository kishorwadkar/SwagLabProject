package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage 
{
	private WebDriver driver;
	@FindBy(xpath="//*[@id='first-name']")
	private WebElement firstname;
	
	@FindBy(xpath="//*[@id='last-name']")
	private WebElement lastname;
	
	@FindBy(xpath="//*[@id='postal-code']")
	private WebElement postalcode;
	
	
	@FindBy(xpath="//*[@id='continue']")
	private WebElement continuebutton;
	
	public YourInformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enteruserFirstName(String Firstname)
	{
		firstname.sendKeys(Firstname);
	}
	
	public void enteruserLastName(String Lastname)
	{
		lastname.sendKeys(Lastname);
	}
	public void enteruserPostalCode(String PostalCode)
	{
		postalcode.sendKeys(PostalCode);
	}
	public void clickOnContinueButton()
	{
		continuebutton.click();
	}
}
