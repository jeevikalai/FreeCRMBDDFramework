package StepDefinition;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;

import com.qa.pageobjects.homepageobjects;
import com.qa.pageobjects.loginpageobject;

import TestUtils.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepdefinition extends TestBase {
	public loginpageobject l;
	public homepageobjects h;


public loginstepdefinition() throws IOException {
		 
	}

@Given("^User launches the browser$")
public void user_launches_the_browser() throws Throwable {
     TestBase.initialization();
}

@When("^user enter \"([^\"]*)\" and \"([^\"]*)\" click on login$")
public void user_enter_username_and_password_click_on_login(String username,String password) throws Throwable {
	l  = new loginpageobject();
	System.out.println(password +" " +username); 
    l.clicklogin(username,password);
}

@When("^user enter credentials aand click on login$")
public void user_enter_credentials_aand_click_on_login() throws Throwable {
	l  = new loginpageobject();
    l.clicklogin();
}
@When("^user click on login$")
public void user_click_on_login(DataTable data) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	List<List<String>> datas= data.raw();
	String username = datas.get(0).get(0);
	String password = datas.get(0).get(1);
	l  = new loginpageobject();
	System.out.println(password +" " +username); 
    l.clicklogin(username,password);
	
	
}



@Then("^user is on homepage$")
public void user_is_on_homepage() throws Throwable {
	h = new homepageobjects();
	String title = l.verifytitle();
	System.out.println("title " +title);
	Assert.assertEquals("CRMPRO", title);
	String usertitle = h.verifycorrectusername();
	System.out.println("usertitle " +usertitle);
//	Assert.assertEquals("User: Jeevitha Swamynathan", usertitle);	
	
    
}



}
