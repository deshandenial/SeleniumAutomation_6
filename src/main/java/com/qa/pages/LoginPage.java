package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.enums.WaitStrategy;



public final class LoginPage extends BasePage
{
	private final By buttonSignin = By.xpath("//a[@href='/signin']");
	private final By textboxUsername = By.xpath("//input[@name='email']");
	private final By textboxPasword = By.xpath("//input[@placeholder='Enter password']");
	private final By buttonLogin = By.xpath("//button[normalize-space()='LOGIN']");
	


	public LoginPage Signin()
	{
		click(buttonSignin, WaitStrategy.CLICKABLE);
		return this;
	}	

	public LoginPage userName(String UserName)
	{
		sendkeys(textboxUsername, UserName, WaitStrategy.PRESENCE);
		return this;
	}



	public LoginPage passWord(String PassWord)
	{
		sendkeys(textboxPasword, PassWord, WaitStrategy.PRESENCE);
		return this;
	}



	public HomePage submit()
	{
		click(buttonLogin, WaitStrategy.CLICKABLE);
		return new HomePage();
	}
}
