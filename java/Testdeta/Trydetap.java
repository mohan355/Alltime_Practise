package Testdeta;

import org.testng.annotations.Test;

import Ccommon.Bbrowsers;
import dailypractise.ClassOne;
import dailypractise.ClassTwo;

import org.testng.annotations.DataProvider;

public class Trydetap extends Bbrowsers {
	 @Test(priority = 1)
	  public void cal() {
		  ClassOne obj1=new ClassOne(driver);
		  obj1.mohan();
		  
		   }
	
	
	
	
  @Test(dataProvider = "detap")
  public void f(String n, String s) {
	  ClassTwo obj2=new ClassTwo(driver);
		 obj2.kafle(n);
		 obj2.shanti(s);
		 obj2.sachhem();
		 driver.navigate().back();
		 obj2.emty();
	  
	  
  }

  @DataProvider
  public Object[][] detap() {
    return new Object[][] {
      new Object[] {" mkgh@gmail.com", "ghyn" },
      new Object[] { "kfg@gmail.com", "bcjsjk" },
    };
  }
}
