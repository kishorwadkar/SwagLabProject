package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{
	
	public String readconfigurator(String value) throws IOException
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		System.out.println(path);
		
		FileInputStream fis=new FileInputStream(path);
		
		Properties pro=new Properties();
		pro.load(fis);
		
		String value1=pro.getProperty(value);
		System.out.println(value1);
		return value1;
				
	}
//	public static void main(String[] args) throws IOException 
//	{
//		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
//		System.out.println(path);
//		
//		FileInputStream fis=new FileInputStream(path);
//		
//		Properties pro=new Properties();
//		pro.load(fis);
//		
//		String value=pro.getProperty("browser");
//		System.out.println(value);
//		
//		String urlname=pro.getProperty("url");
//		System.out.println(urlname);
//		
//		
//	}

}
