package dailyhome;

import org.testng.annotations.Test;

import Ccommon.Bbrowsers;
import dailypractise.ClassOne;
import dailypractise.ClassTwo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Summary extends Bbrowsers {
	
	
  @Test(priority = 1)
  public void cal() {
	  ClassOne obj1=new ClassOne(driver);
	  obj1.mohan();
	  
	   }
  
	 @Test(priority = 2)
	 public void call() {
		 ClassTwo obj2=new ClassTwo(driver);
		 obj2.kafle("mkf@gmail.com");
		 obj2.shanti("dfkgndf");
		 obj2.sachhem();
		 
		 
		 
  }
	
}







