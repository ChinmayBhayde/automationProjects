package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src/test/resources/uifeature"},
		glue =  {"steps"},
		plugin = {"pretty","html:target/cucumber-reports"}
		)

public class campaignRunner extends AbstractTestNGCucumberTests {
	
	

}
