package com.qa.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestUtils.TestBase;

public class homepageobjects extends TestBase {

	@FindBy(xpath="/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
	WebElement utitle;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[4]/a")
	WebElement contacts;
	
	public homepageobjects() throws IOException {
		PageFactory.initElements(driver, this);
 	}
	public String verifycorrectusername()
	{
		driver.switchTo().frame("mainpanel");
		String usertitle = utitle.getText();
		//String usertitle = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")).getText();
		System.out.println("user title " +usertitle );
		return usertitle ;
	}
	public void clickcontacts()
	{
		contacts.click();
		
	}
	
 
}
