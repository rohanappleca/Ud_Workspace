import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMaven {

	public WebDriver driver;
	@BeforeSuite
	public void setUp() {
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
	}
	
	@Test
	public void login() {
		
		driver.get("http://gmail.com");
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
	
}
