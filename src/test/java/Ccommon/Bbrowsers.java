package Ccommon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Bbrowsers {
	
 public static WebDriver driver;
 
  @BeforeClass
  @Parameters({"url","browser"})
  
	  public void BeforeClass(String wbsite,String brw) {
		  
			if(brw.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kafle\\Desktop\\PNT\\AllTime\\Ddriver\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.navigate().to(wbsite);
			  driver.manage().window().maximize();
			}
			else if(brw.equalsIgnoreCase("firefox")) {
			  
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\kafle\\Desktop\\PNT\\AllTime\\Ddriver\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.navigate().to("https://www.capitalone.com/");
			  driver.manage().window().maximize();
			  
			  } 
			else {
				System.out.println("please check name");
			}
			 }
  
  @AfterClass
  public void afterClass() {
	  
	  
	   }
  public void screenshots(String sourse) throws IOException {
  	
  	File shots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  	FileUtils.copyFile(shots,new File(sourse+timestamp()+"Screenshots.png"));	
  
  }
  
	public String timestamp() {
		
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
			
	}
	  
  }
  
  
  
  
  
  
  
  
  
  
  


