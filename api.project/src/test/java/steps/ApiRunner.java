package steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src/test/resources/apiFeatures/api.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty", "html:target/report.html"}
		
		)



public class ApiRunner extends AbstractTestNGCucumberTests {
	
	
	

}