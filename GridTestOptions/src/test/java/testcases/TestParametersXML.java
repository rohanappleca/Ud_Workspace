package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersXML {

	public DesiredCapabilities cap = new DesiredCapabilities();
	public WebDriver driver;

	@Parameters({ "browser" })
	@Test
	public void testBrowser(String browser) throws MalformedURLException {

		Date d = new Date();
		System.out.println(browser + d.toString());
		if (browser.equals("firefox")) {
			System.out.println("In Firefox Prag");
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName("firefox");
			

			FirefoxOptions ffOpt = new FirefoxOptions();
			ffOpt.merge(cap);
			System.out.println("In Firefox Roannnnnn"+cap);
			

		}

		else if (browser.equals("chrome")) {

			cap.setPlatform(Platform.ANY);
			cap.setBrowserName("chrome");
			

			ChromeOptions chrOpt = new ChromeOptions();
			chrOpt.merge(cap);

		}
		
		System.out.println("Before launching remote webdriver");
		System.out.println("Cap value"+cap);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("pracrohan");
		driver.findElement(By.xpath("//div/div/button/div[2]")).click();
		//driver.quit();

	}
}
