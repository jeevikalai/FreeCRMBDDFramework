package cucumberOptions;

import org.junit.runner.RunWith;
 import cucumber.api.CucumberOptions;
 import cucumber.api.junit.Cucumber;

 
@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "C:\\Users\\jeevi\\seleniumproject\\CucumberFramework\\src\\test\\java\\Feature\\login1.feature",
	    glue="StepDefinition",
	   
	    dryRun = false, //to check every feature step has a step definition.
	    monochrome = true, // makes readable console output
	   strict = false, //fails if any pending or missed step definition found
 	format= {"pretty","html:test-output"})
public class TestRunner    {

}
