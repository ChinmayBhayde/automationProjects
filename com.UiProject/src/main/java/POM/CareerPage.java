package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {
	
private	WebDriver driver; 
	
	@FindBy(xpath = "//input[@id='typehead']")
	private	WebElement searchBox;
	
	public CareerPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void searchJob(String s) {
		searchBox.click();
		searchBox.sendKeys(s);
	}
	
	public void selectFirstOption() {
		searchBox.sendKeys(Keys.DOWN);
		searchBox.sendKeys(Keys.RETURN);
	}

}
