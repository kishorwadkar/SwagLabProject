package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OverViewPageText extends TestBase 
{
	@Test(priority=16)
	public void validateTotalPrice()
	{
		String price1=overviewpage.getPrice1Text();
		
		String Price1 = price1.replaceAll("[$]", "");
		
		double a = Double.valueOf(Price1);
		System.out.println(a);
		String price2=overviewpage.getPrice2Text();
		
		String Price2 = price2.replaceAll("[$]", "");
		double b = Double.valueOf(Price2);
		System.out.println(b);
		
		String taxprice=overviewpage.validateTax();
		String TaxPrice = taxprice.replaceAll("[Tax : $]", "");
		double c = Double.valueOf(TaxPrice);
		System.out.println(c);
		
		double totalprice1 = a+b+c;
		 System.out.println(totalprice1);
		 
		String totalprice=overviewpage.getTotalPrice();
		String TotalPrice = totalprice.replaceAll("[Total : $]", "");
		double d = Double.valueOf(TotalPrice);
		System.out.println(d);
		Assert.assertEquals(totalprice1, d);
		
	}
	@Test(priority=17)
	public void validateFinishButton()
	{
		overviewpage.clickOnFinishButton();
		System.out.println("this is end of the Project");
	}

}
