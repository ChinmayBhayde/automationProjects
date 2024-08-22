package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM.CareerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import launchBrowser.driverFactory;

public class CareerPageSteps {
	
	WebDriver driver = driverFactory.getDriver();
	CareerPage cp = new CareerPage(driver);
	
	
	@SuppressWarnings("deprecation")
	@Given("user is at career page")
	public void user_is_at_career_page() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    String s = driverFactory.getDriver().getTitle();
	    Assert.assertEquals(s, "Careers at Labcorp | Embrace Possibilities, Change Lives");
	}

	@When("user enter text {string} in search box")
	public void user_enter_text_in_search_box(String string) {
	    cp.searchJob(string);
	}

	@Then("user click on first option from dropdown")
	public void user_click_on_first_option_from_dropdown() {
	    cp.selectFirstOption();
	}

}
