package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.driver.DriverManager;
import com.qa.enums.WaitStrategy;
import com.qa.waitfactories.ExplicitWaitFactory;

public class BasePage 
{
	protected void click(By by, WaitStrategy waitStrategy)
    {
        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        element.click();
    }

 

    protected void sendkeys(By by,String value,WaitStrategy waitStrategy)
    {
        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        element.clear();
        element.sendKeys(value);

 

    }
    protected void selectDropDown(By by,String value,WaitStrategy waitStrategy)
    {
        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        Select select = new Select(element);
        select.selectByVisibleText(value);

 

    }
    protected void submit(By by,WaitStrategy waitStrategy)
    {
        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        element.submit();
    }

 

    protected String getPageTitle()
    {
        return DriverManager.getDriver().getTitle();
    }

}
