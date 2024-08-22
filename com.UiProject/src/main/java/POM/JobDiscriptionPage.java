package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobDiscriptionPage {
	
private	WebDriver driver; 
	
	@FindBy(xpath = "//h1[@class='job-title']")
	private	WebElement jobTitle;
	
	@FindBy(className = "au-target job-location")
	private	WebElement jobLocation;
	
	@FindBy(className = "//span[@au-target-id='309']")
	private	WebElement jobId;
	
	@FindBy(xpath = "(//div[@class='jd-info au-target']/p)[5]")
	private	WebElement sentence;
	
	@FindBy(xpath = "(//div[@class='jd-info au-target']/ul)[1]/li[7]")
	private	WebElement responsibility;
	
	@FindBy(xpath = "(//div[@class='jd-info au-target']/ul)[3]/li[4]")
	private	WebElement experience;
	
	@FindBy(linkText = " Apply Now  ")
	private	WebElement applyNow;
	
	public JobDiscriptionPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String validateJobTitle() {
		return jobTitle.getText();
	}
	
	public String validateJobLocation() {
		return jobLocation.getText();
	}
	
	public boolean validateJobId(String s) {
		String s1 = jobId.getText();
		return s1.contains(s);
	}
	
	public String validateSentence() {
		return sentence.getText();
		
	}
	
	public String validateResponsibility() {
		return responsibility.getText();
	}
	
	public String validateExperience() {
		return experience.getText();
	}
	
	public void clickOnApply() {
		applyNow.click();
	}
	
}
