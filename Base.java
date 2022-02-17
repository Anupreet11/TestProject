package test;



import utils.CommonMethods;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class Base {
	WebDriver driver;
	CommonMethods common =new CommonMethods();
	String browser="chrome";
	String url="https://www.amazon.ca";
	
	
  
  @BeforeSuite
  public void beforeSuite() {
	  common.launch(browser,url);
	  driver=common.getdriver();
  }

  @AfterSuite
  public void afterSuite() {
	  common.teardown();
  }

}
