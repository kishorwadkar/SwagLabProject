package com.qa.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.qa.pages.Loginpage;
import com.qa.utilities.ReadConfig;

public class TestBase 
{
	public Loginpage loginpage;
	ReadConfig read;
	public static WebDriver driver;
	@BeforeSuite
	public void initbrowser() throws IOException
	{
		 read=new ReadConfig();
		String browsername= read.readconfigurator("browser");
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browsername.equals("msedge"))
		{
			driver=new EdgeDriver();
		}

		else
		{
			System.out.println("please enter the correct browser name");

		}
		String urlname=read.readconfigurator("url");

		driver.get(urlname);
		driver.manage().window().maximize();

	}
	@BeforeClass
	public void objectCretion()
	{
		 loginpage=new Loginpage(driver);
	}
	
	@AfterSuite
	public void teardown()
	{
		
		//driver.quit();
	}

}
