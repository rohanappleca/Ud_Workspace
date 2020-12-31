import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {

		//System.setProperty("webdriver.gecko.driver", "C:\\UD\\Automation\\Browser_Executables\\geckodriver.exe");
        WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void tearDown() {

		driver.quit();
	}
}
