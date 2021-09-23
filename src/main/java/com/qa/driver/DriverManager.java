package com.qa.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager 
{
	private DriverManager()
	{
		
	}
	private static final ThreadLocal<WebDriver> tl = new ThreadLocal<>();
	
	public static void setDriver(WebDriver refdriver)
	{
	tl.set(refdriver);
	}
	public static WebDriver getDriver()
	{
	return tl.get();
	}
	public static void unload()
	{
	tl.remove();
	}

}
