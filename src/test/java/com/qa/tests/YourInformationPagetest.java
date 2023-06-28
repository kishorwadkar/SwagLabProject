package com.qa.tests;

import org.testng.annotations.Test;

public class YourInformationPagetest extends TestBase 
{
	@Test(priority=12)
	public void validateFirstname() 
	{
		
		yourinformationpage.enteruserFirstName("kishor");
		
		
	}

	@Test(priority=13)
	public void validateLastName()
	{
		yourinformationpage.enteruserLastName("wadkar");
		
		
	}

	@Test(priority=14)
	public void validatePostalCode()
	{
		yourinformationpage.enteruserPostalCode("413624");
		
		
	}
	
	@Test(priority=15)
	public void validateContinueButton() throws InterruptedException
	{
		Thread.sleep(2000);
		yourinformationpage.clickOnContinueButton();
	}

}
