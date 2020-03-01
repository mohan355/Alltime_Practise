package Testdeta;

import org.testng.annotations.Test;

import Ccommon.Bbrowsers;
import dailypractise.ClassOne;
import dailypractise.ClassTwo;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class TestdetaProvider extends Bbrowsers{
	 @Test(priority = 1)
	  public void cal() {
		  ClassOne obj1=new ClassOne(driver);
		  obj1.mohan();
		  
		   }
	  
		
	
  @Test(priority=2,dataProvider = "signinn")
  
  public void f(String n, String s) throws InterruptedException {
	  ClassTwo obj2=new ClassTwo(driver);
		 obj2.kafle(n);
		 obj2.shanti(s);
		 obj2.sachhem();
		 driver.navigate().back();
		 
		 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 driver.navigate().back();
		 
		 obj2.emty();
		 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 Reporter.log("Ececuted successfully");

		 
		 
		 
		 
	  
  }

  @DataProvider
  public Object[][] signinn() {
    return new Object[][] {
      new Object[] { "namk@gmail.com", "mkldlfwei" },
     
      new Object[] { "mjjh@gmail.com", "mkjcoa" },
    };
  }
}
//