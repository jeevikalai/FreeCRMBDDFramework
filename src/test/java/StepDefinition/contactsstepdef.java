package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.qa.pageobjects.contactspageobject;
import com.qa.pageobjects.homepageobjects;

import TestUtils.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contactsstepdef extends TestBase {

	public contactsstepdef() throws IOException {
		 
	}
	homepageobjects h;
	contactspageobject c =new contactspageobject();

	
@When("^User clicks on contacts tab on Homepage$")
public void user_clicks_on_contacts_tab_on_Homepage() throws Throwable {
	c.clickonnewcontacts();
     
}

@Then("^user enters new contact details$")
public void user_enters_new_contact_details(DataTable Contactdetails) throws Throwable {
	for (Map<String, String> cdata : Contactdetails.asMaps(String.class, String.class))
	{
		System.out.println("first name  " +cdata.get("FirstName"));
	//	firstname.sendKeys(cdata.get("FirstName"));
		c.addcontactdetails(cdata );
	}
    
}

@Then("^user clicks save$")
public void user_clicks_save() throws Throwable {
    
}


@Then("^Click on Contacts Tab and delete the contacts$")
public void click_on_Contacts_Tab_and_delete_the_contacts() throws Throwable {
	h= new homepageobjects();
   h.clickcontacts();
   c.deletecontact();
   //*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
}

}
