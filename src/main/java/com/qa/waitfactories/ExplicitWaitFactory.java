package com.qa.waitfactories;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.constant.FrameworkConstant;
import com.qa.driver.DriverManager;
import com.qa.enums.WaitStrategy;
public class ExplicitWaitFactory 
{
	
	private ExplicitWaitFactory()
	{
		
	}
	public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by)
	{
		WebElement element = null;
		if(waitStrategy==WaitStrategy.CLICKABLE)
		{
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstant.getExplicitWait())
			.until(ExpectedConditions.elementToBeClickable(by));  // old way before java 1.8
		}
		else if(waitStrategy==WaitStrategy.PRESENCE)
		{
			element =new WebDriverWait(DriverManager.getDriver(), FrameworkConstant.getExplicitWait())
			.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(waitStrategy==WaitStrategy.VISIBLE)
		{
			element =new WebDriverWait(DriverManager.getDriver(), FrameworkConstant.getExplicitWait())
			.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if(waitStrategy==WaitStrategy.NONE)
		{
			element = DriverManager.getDriver().findElement(by);
		}
		
		return element;
	}
	
}
