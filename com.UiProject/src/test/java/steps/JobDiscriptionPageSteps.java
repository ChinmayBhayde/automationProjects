package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM.JobDiscriptionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import launchBrowser.driverFactory;

public class JobDiscriptionPageSteps {
	
	WebDriver driver = driverFactory.getDriver();
	JobDiscriptionPage jd = new JobDiscriptionPage(driver);
	
	@SuppressWarnings("deprecation")
	@Given("user is at career discription page")
	public void user_is_at_career_discription_page() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    String s = driverFactory.getDriver().getTitle();
	    boolean s1 = s.contains("Java Full Stack Developer in Indianapolis");
	    Assert.assertEquals(s1, true);
	}

	@When("user confirms if job title is {string}")
	public void user_confirms_if_job_title_is(String string) {
	    Assert.assertEquals(jd.validateJobTitle(), string);
	}

	@When("user confirms if job loacation is {string}")
	public void user_confirms_if_job_loacation_is(String string) {
	    Assert.assertEquals(jd.validateJobLocation(), string);
	}

	@When("user confirms if job id is {string}")
	public void user_confirms_if_job_id_is(String string) {
	    Assert.assertEquals(jd.validateJobId(string), true);
	}

	@When("user confirms if first sentence of third paragraph under Introduction as {string}")
	public void user_confirms_if_first_sentence_of_third_paragraph_under_introduction_as(String string) {
	    Assert.assertEquals(jd.validateSentence(), string);
	}

	@When("user confirms if seventh job responsibility is {string}")
	public void user_confirms_if_seventh_job_responsibility_is(String string) {
		Assert.assertEquals(jd.validateResponsibility(), string);
	}

	@When("user confirms if fourth Experience requirement is {string}")
	public void user_confirms_if_fourth_experience_requirement_is(String string) {
		Assert.assertEquals(jd.validateExperience(), string);
	}

	@Then("user clicks on apply now button")
	public void user_clicks_on_apply_now_button() {
	    jd.clickOnApply();
	}

	@SuppressWarnings("deprecation")
	@Then("redirects to MyWorkDay login page")
	public void redirects_to_my_work_day_login_page() {
		WebDriver driver = driverFactory.getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Assert.assertEquals(driver.getTitle(), "Workday");
	}

}
