package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverViewPage 
{
	private WebDriver driver;
	@FindBy(xpath="(//*[@class='inventory_item_price'])[1]")
	private WebElement price1;
	
	@FindBy(xpath="(//*[@class='inventory_item_price'])[2]")
	private WebElement price2;
	
	@FindBy(xpath="//*[@class='summary_tax_label']")
	private WebElement taxprice;
	
	@FindBy(xpath="//*[@class='summary_info_label summary_total_label']")
	private WebElement totalprice;
	
	@FindBy(xpath="//*[@id='finish']")
	private WebElement finish;
	
	public OverViewPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public String getPrice1Text()
	{
		return price1.getText();
	}
	
	public String getPrice2Text()
	{
		return price2.getText();
	}
	
	public String validateTax()
	{
		return taxprice.getText();
	}
	
	public String getTotalPrice()
	{
		return totalprice.getText();
	}
	
	public void clickOnFinishButton()
	{
		finish.click();
	}

}
