package cucumberOptions;

  import cucumber.api.CucumberOptions;
 
 
//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "C:\\Users\\jeevi\\seleniumproject\\CucumberFramework\\src\\test\\java\\Feature\\login1.feature",
	    glue="StepDefinition",
	   
	    dryRun = false, //to check every feature step has a step definition.
	    monochrome = true, // makes readable console output
	   strict = false, //fails if any pending or missed step definition found
 	format= {"pretty","html:test-output"})
public class TestRunner    {

}
