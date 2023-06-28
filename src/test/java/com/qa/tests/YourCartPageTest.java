package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class YourCartPageTest extends TestBase
{
	
	
	@Test(priority=10)
	public void validateTitle()
	{
		String title=yourcartpage.getTitleofPage();
		boolean istrue = title.contains("Swag Labs");
		Assert.assertEquals(istrue, true);
		
	}
	@Test(priority=11)
     public void validateYourCartPage()
     {
		yourcartpage.clickOnCheckOut(); 
     }
}
