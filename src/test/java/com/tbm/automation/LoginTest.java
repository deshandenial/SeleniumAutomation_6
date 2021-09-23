package com.tbm.automation;


import org.testng.annotations.Test;

import com.qa.pages.LoginPage;



public class LoginTest extends BaseClass
{

	@Test
	public void test1()
	{
		new LoginPage().Signin().userName("deshancse@gmail.com").passWord("deshan@123").submit();
	}
	
	@Test
	public void test2()
	{
		new LoginPage().Signin().userName("desha@gmail.com").passWord("deshan@123").submit();
	}
	

}
