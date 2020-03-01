package dailypractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassTwo { 
	
	WebDriver driver;
	
	@FindBy(id = "ods-input-0")
	WebElement username;
	
	@FindBy(xpath = "//*[@aria-required='true']")
	WebElement password;
	
	@FindBy(xpath = "//*[@name='signInForm']/p/button")
	WebElement sgninn;
	
	public ClassTwo(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	public void kafle(String email) {
		username.sendKeys(email);
		
	}
	public void shanti(String passwordd) {
		password.sendKeys(passwordd);
	}
	
	public void sachhem() {
		sgninn.click();
	}
	public void emty() {
		username.clear();
		}

}
