package com.qa.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//*[@id='user-name']") 
	private WebElement usernametext;
	
	@FindBy(xpath="//*[@id='password']") 
	private WebElement passwordtext;
	
	@FindBy(xpath="//*[@id='login-button']") 
	private WebElement lginbutton;
	
	
	@FindBy(xpath="//*[@id='login_credentials']")
	private WebElement usernameCredential;
	
	@FindBy(xpath="//*[@class='login_password']")
	private WebElement passwordCredential;
	
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	
	public String getTitleofpage()
	{
		return driver.getTitle();
	}
	public String  enterUsername()
	{
		usernametext.sendKeys(Loginpage.getCredential(getTextUsername()));
		return Loginpage.getCredential(getTextUsername());
	}
	
	public void enterPassword()
	{
		passwordtext.sendKeys(Loginpage.getCredential(getTextPassword()));
		
	}
	public void ClickOnLoginbutton()
	{
		lginbutton.click();
		
	}
	
	public String getTextUsername()
	{
		 return usernameCredential.getText();
	}
	
	public String getTextPassword()
	{
		return passwordCredential.getText();
	}
	
	
	public static String getCredential(String data)
	{

		int randomindex;
		Random random=new Random();
		
		
		String dataArray[]=data.split("\n");
		if(dataArray.length==2)
		{
			return dataArray[1];
		}
		else if(dataArray.length>2)
		{
			randomindex = random.nextInt(dataArray.length-1)+1;
			return dataArray[randomindex];
			
		}
		else
		{
		  return "something went wrong!! check the credentials";
		}
	}
	

}
