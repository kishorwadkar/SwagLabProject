package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	private WebDriver driver;
	@FindBy(xpath="(//*[@class='inventory_item_description']/child::div[@class='pricebar']/child::button)[3]")
	private WebElement add_to_cart_t_shirt;
	
	@FindBy(xpath="(//*[@class='inventory_item_description']/child::div[@class='pricebar']/child::button)[4]")
	private WebElement add_to_cart_fleece_jacket;
	
	
	@FindBy(xpath="//*[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement t_shirt;
	
	@FindBy(xpath="//*[text()='Sauce Labs Fleece Jacket']")
	private WebElement fleece_jacket;
	
	
	
	@FindBy(xpath="//*[@class='shopping_cart_link']")
	private WebElement shoppingcart;
	
	
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String getTextOnTshirts()
	{
		return t_shirt.getText();
		
	}
	
	public String getTextOnFleeceJacket()
	{
		return fleece_jacket.getText();
		
	}
	
	public void selectTShirt()
	{
		add_to_cart_t_shirt.click();
	}
	
	public void selectFleeceJacket()
	{
		add_to_cart_fleece_jacket.click();
	}
	
	public void clickOnShoppingCart()
	{
		shoppingcart.click();
	}
}
