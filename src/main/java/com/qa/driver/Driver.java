package com.qa.driver;

import java.net.URL;
import java.util.Objects;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.qa.constant.FrameworkConstant;
import com.qa.enums.ConfigProperties;
import com.qa.utils.PropertiesUtils;



public final class Driver 
{
	private Driver()
	{

	}
	public static void initDriver() throws Exception
	{
		if(Objects.isNull(DriverManager.getDriver()))
		{
			
			System.setProperty("webdriver.chrome.driver",FrameworkConstant.getChromeDriverPath());
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			
			DriverManager.setDriver(new ChromeDriver(options));
			
			/*
			 * DesiredCapabilities capabilities = new DesiredCapabilities();
			 * capabilities.setBrowserName("chrome");
			 * capabilities.setPlatform(Platform.LINUX); 
			 * URL url = new URL("http://localhost:4444/wd/hub"); DriverManager.setDriver(new
			 * RemoteWebDriver(url,capabilities));
			 */
			DriverManager.getDriver().get(PropertiesUtils.get(ConfigProperties.URL));
			DriverManager.getDriver().manage().window().maximize();
		}
	}
	public static void tearDown()
	{
		if(Objects.nonNull(DriverManager.getDriver()))
		{
			DriverManager.getDriver().close();
			DriverManager.unload();
		}
	}
}
