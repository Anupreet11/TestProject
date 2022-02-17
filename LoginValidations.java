package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import pom.Login;

public class LoginValidations extends Base {
	Login login;
	@BeforeClass
	public void beforeclass() {
	login=new Login(driver);
	}
	
	
	
	 @Parameters({"validemail","validpassword"})
	@Test
	public void validemailvalidpassword(String em,String pass) {
		login.passemailandPassword(em, pass);
		
	}
	@Parameters({"invalidemail","validpassword"})
	@Test
	
	public void invalidemailvalidpassword(String em,String pass) {
		login.passemailandPassword(em,pass);
		}
	@Parameters({"validemail","invalidpassword"})
	
@Test
	
	public void validemailinvalidpassword(String em,String pass) {
		login.passemailandPassword(em,pass);
}
	@Parameters({"invalidemail","invalidpassword"})
			
@Test

public void invalidemailinvalidpassword(String em,String pass) {
	login.passemailandPassword(em,pass);
}	
	@Parameters({"invalidpassword"})
	
	@Test

	public void invalidemailinvalidpassword1(String em,String pass) {
		login.passemailandPassword("", "invalid-12345");
	}
	

}
