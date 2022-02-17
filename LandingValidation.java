package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingValidation extends Base {
	
	
	
	
	
	
	
  @Test
  public void validateurl() {
	  String expected="https://www.amazon.ca";
	  String actual=driver.getCurrentUrl();
	  Assert.assertTrue(expected.contains(actual),"this is not correct url"    +actual);
		  
	  
	  
  }
  
  @Test
  public void validatetitle() {
	  String expected="Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
	  String actual=driver.getTitle();
	  Assert.assertTrue(expected.contains(actual),"this is not correct title"    +actual);
		  
	  
	  
  } 
  
  
  
  
  
  
  
}
