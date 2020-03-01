package dailypractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassOne {
	WebDriver driver;
	
	@FindBy(xpath ="//*[text()='Sign In']")
	WebElement signin;
	
	public ClassOne(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	public void mohan() {
		signin.click();
	}

}
