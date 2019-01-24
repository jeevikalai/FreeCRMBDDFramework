package com.qa.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestUtils.TestBase;

public class loginpageobject extends TestBase {

	@FindBy(name="username")
	WebElement username;

	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	public loginpageobject() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogin()
	{
		String usrname = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		System.out.println("username " + usrname + "   " + pwd);
		 
		username.sendKeys(usrname);
		password.sendKeys(pwd);
		login.click();
	}
	
	public void clicklogin(String user,String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		login.click();
	}
	public String verifytitle()
	{
		return driver.getTitle();
	}
	
	
	
}
