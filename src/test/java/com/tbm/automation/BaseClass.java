package com.tbm.automation;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.driver.Driver;



public class BaseClass 
{
	protected BaseClass()
	{
		
	}
	

	
	@BeforeMethod
	public void beforeMethod() throws Exception
	{
		
		Driver.initDriver();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Driver.tearDown();
		
	}
	

}
