package com.qa.constant;

public final class FrameworkConstant 
{
	private FrameworkConstant()
	{
	}
	
	  private static final String RESOURCESPATH =
	  System.getProperty("user.dir")+"/src/test/resources"; private static final
	  String CHROMEDRIVER_PATH = RESOURCESPATH+"/driver/chromedriver.exe";
	 

	private static final String CONFIG_FILE = RESOURCESPATH+"/config/config.properties";
	private static final int EXPLICITWAIT = 20;

	public static String getChromeDriverPath()
	{
		return CHROMEDRIVER_PATH;
	}

	public static String getConfigFilePath()
	{
		return CONFIG_FILE;
	}


	public static int getExplicitWait()
	{
		return EXPLICITWAIT;
	}








}
