package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
	WebDriver driver;
	public void launch(String browser,String url) {

		String path=System.getProperty("user.directory");
		System.out.println("this is local path"+ path);
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\advja\\OneDrive\\Desktop\\anu documents\\seleniumproject\\drivers\\chromedriver2.exe");
		driver=new ChromeDriver();
		
	}else if(browser.equalsIgnoreCase("edge")){
		System.setProperty("webdriver.edge.driver","C:\\Users\\advja\\OneDrive\\Desktop\\anu documents\\seleniumproject\\drivers\\edgedriver.exe");
		driver=new EdgeDriver();
		
	}
	else if(browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\advja\\OneDrive\\Desktop\\anu documents\\seleniumproject\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
	else {
		System.out.println("this browser is not correct");
		System.out.println(0);
	}
	
if (url!="") {
	driver.get(url);}
	else {
		driver.get("about:blank");
	}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
	}


public void teardown() {

	driver.quit();

}
public WebDriver getdriver() {
	return driver;
	
}
 
}






