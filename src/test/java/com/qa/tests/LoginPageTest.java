package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase 
{
	@Test(priority=1)
	public void validateTitle()
	{
		String actualtitle = loginpage.getTitleofpage();

		String expTitle="Swag";
		boolean istrue = actualtitle.contains("Swag");
		Assert.assertEquals(istrue, true);
		

	}
	
	@Test(priority=2)
	public void validateUsername()
	{
		String userdata = loginpage.enterUsername();
		System.out.println(userdata);
	}

	@Test(priority=3)
	public void validatePassword()
	{
		loginpage.enterPassword();
		
	}
	
	@Test(priority=4)
	public void validateLoginButton()
	{
		loginpage.ClickOnLoginbutton();
		
	}
}
