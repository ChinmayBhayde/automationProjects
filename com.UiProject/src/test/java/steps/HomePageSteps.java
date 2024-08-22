package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import POM.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import launchBrowser.driverFactory;

public class HomePageSteps {
	
	WebDriver driver = driverFactory.getDriver();
	HomePage hp = new HomePage(driver);
	
	
	@SuppressWarnings("deprecation")
	@Given("user is at landing page")
	public void user_is_at_landing_page() {
		
		driver.get("www.labcorp.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("user clicks on Career option")
	public void user_clicks_on_career_option() {
	    hp.clickOnCareer();
	}

}
