package automation;

import org.testng.annotations.Test;

import com.pom.Demoqa;
import com.util.Generic;
import com.util.OR;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;


public class BasicDemoSite extends Generic{
	static WebDriver driver;

@BeforeMethod
  public void beforeMethod() {
		 driver=openBrowser(driver);
	  }  
@Test
  public void f() throws InterruptedException {
	  driver.get(OR.home_url);	
  }

@AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
