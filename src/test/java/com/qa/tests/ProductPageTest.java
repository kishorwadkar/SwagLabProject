package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest extends TestBase 
{
	@Test(priority=5)
	public void validateTshirt()
	{
		String tshirtname=productpage.getTextOnTshirts();
		boolean istrue = tshirtname.contains("Sauce Labs Bolt ");
		Assert.assertEquals(istrue, true);
		
	}
	
	@Test(priority=6)
	public void validateAddToCartTShirt()
	{
		productpage.selectTShirt();
	}
	
	
	@Test(priority=7)
	public void validatefleeceJacket()
	{
		String tshirtname=productpage.getTextOnFleeceJacket();
		boolean istrue = tshirtname.contains("Sauce Labs Fleece ");
		Assert.assertEquals(istrue, true);
		
	}
	
	@Test(priority=8)
	public void validateAddToCartfleeceJacket()
	{
		productpage.selectFleeceJacket();
	}
	
	@Test(priority=9)
	public void validatShoppingCartFunctionality()
	{
		productpage.clickOnShoppingCart();
	}


}
