package com.qa.pageobjects;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestUtils.TestBase;

public class contactspageobject extends TestBase{

	public contactspageobject() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[4]/a")
	WebElement contacts;

	@FindBy(xpath="//*[@id='navmenu']/ul/li[4]/ul/li[1]/a")
	WebElement newcontact;
	
	@FindBy(xpath="//*[@id='contactForm']/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/select")
	WebElement titlename;
	
	@FindBy(xpath="//*[@id='first_name']")
	WebElement firstname;

	@FindBy(xpath="//*[@id='surname']")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id='department']")
	WebElement dept;
	 
	@FindBy(xpath="//*[@id='phone']")
	WebElement phone;
	
	@FindBy(xpath="//*[@id='contactForm']/table/tbody/tr[1]/td/input[3]")
	WebElement saveandcreate;
	
	
	
	public void clickonnewcontacts()
	{
		Actions actions = new Actions(driver);
		
		 actions.moveToElement(contacts).moveToElement(newcontact).click().build().perform();
		 
		 Select s = new Select(titlename);
		 s.selectByVisibleText("Mrs.");
		 
		 
	}
	public void addcontactdetails( Map<String, String> cdata ) throws InterruptedException {
		 
		//    System.out.println("first name  " +cdata.get("FirstName"));

			firstname.sendKeys(cdata.get("FirstName"));
			lastname.sendKeys(cdata.get("LastName"));
			dept.sendKeys(cdata.get("Department"));
			phone.sendKeys(cdata.get("Phone"));
			Thread.sleep(5000);
			saveandcreate.click();
		 
		
	}
	public void deletecontact()
	{
		System.out.println(driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a")).getText());
		//*[@id="vContactsForm"]/table/tbody/tr[4]/td[1]/input
	}
	
}
