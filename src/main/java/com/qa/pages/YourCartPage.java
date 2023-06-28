package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage 
{
	private WebDriver driver;
	@FindBy(xpath="//*[@id='checkout']")
	private WebElement checkout;
	
	public YourCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	public String getTitleofPage()
	{
		return driver.getTitle();
	}
	
	public void clickOnCheckOut()
	{
		checkout.click();
		
	}
	

}
