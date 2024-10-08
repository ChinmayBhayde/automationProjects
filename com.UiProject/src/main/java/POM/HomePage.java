package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
private	WebDriver driver; 
	
	@FindBy(id = "text-a63751913f")
	private	WebElement career;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCareer() {
		career.click();
	}

}
