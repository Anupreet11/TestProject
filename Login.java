package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	
	@CacheLookup
	@FindBy(id="ap_email")
	WebElement email;
	
	
	@CacheLookup
	@FindBy(id="ap_password")
	WebElement password;
	
	
	@CacheLookup
	@FindBy(id="signInSubmit")
	WebElement Loginbtn;
	
	
	public void passemailandPassword(String em,String pass) {
		waits(email);
		email.clear();
		email.sendKeys(em);
		
		waits(password);
		password.clear();
		password.sendKeys(pass);
		
		
		Loginbtn.click();
	}
	public void waits(WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	

}
