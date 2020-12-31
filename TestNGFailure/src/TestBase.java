import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {

		System.setProperty("webdriver.gecko.driver", "C:\\UD\\Automation\\Browser_Executables\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://gmail.com");

	}

	@AfterSuite
	public void tearDown() {

		
		driver.quit();

	}
}
