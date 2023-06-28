package com.qa.extentListener;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.tests.TestBase;
import com.qa.utilities.ScreenShots;




public class ListenerSetUp extends TestBase implements ITestListener
{
	ExtentReports extent=ExtentReporGenerator.extentReportGen();
    public static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("test execution started"+System.currentTimeMillis()+" "+result.getName());
		  test = extent.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test execution complited"+System.currentTimeMillis()+" "+result.getName());
		test.log(Status.PASS, "test Got Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("test execution failed"+System.currentTimeMillis()+" "+result.getName());
		
		
		test.fail(result.getThrowable());
		ScreenShots src=new ScreenShots();
		try
		{
			test.addScreenCaptureFromPath(src.captureScreenshot(driver,result.getName()));
			
			//src.captureScreenshot(driver,result.getName());
		}
		catch(Exception e)
		{
			System.out.println("write correct Screenshot Path");
			e.printStackTrace();
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("test execution skipped"+System.currentTimeMillis()+" "+result.getName());
		test.log(Status.SKIP, "Test Case Got Skipped");
	}

	

	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("test tag started"+System.currentTimeMillis()+" "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("test tag finished"+System.currentTimeMillis()+" "+context.getName());
		extent.flush();
		
	}
	

}
