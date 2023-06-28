package com.qa.extentListener;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporGenerator 
{
	static ExtentReports extent;
	public static ExtentReports extentReportGen()
	{
		String path=System.getProperty("user.dir")+"//reports//LivingLiquids.html";
		ExtentHtmlReporter extentreport=new ExtentHtmlReporter(path);
		extentreport.config().setTheme(Theme.DARK);
		extentreport.config().setReportName("livingLiquidreport");
		
	    extent=new ExtentReports();
		extent.attachReporter(extentreport);
		extent.setSystemInfo("Browser used", "chrome");
		extent.setSystemInfo("executed by", "automation team");
		extent.setSystemInfo("environment", "SIT");
		
		return extent;
		
		
		
	}

}
