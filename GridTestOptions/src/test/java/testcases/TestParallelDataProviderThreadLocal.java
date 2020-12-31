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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParallelDataProviderThreadLocal {
	public DesiredCapabilities cap ;
	public WebDriver driver;
	public ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	public ThreadLocal<DesiredCapabilities> dc = new ThreadLocal<DesiredCapabilities>();

	// ---Setting Threadcopy of Webdriver
	public void setWebDriver(WebDriver driver) {

		dr.set(driver);
	}

	// ---Getting Threadcopy of Webdriver
	public WebDriver getWebDriver() {

		return dr.get();
	}

	// ---Setting Threadcopy of DesiredCapabilities
	public void setDesiredCapabilities(DesiredCapabilities cap) {

		dc.set(cap);
	}

	// ---Getting Threadcopy of DesiredCapbilities
	public DesiredCapabilities getDesiredCapabilities() {

		return dc.get();
	}

	@Test(dataProvider = "getData")
	public void testBrowser(String browser, String userName) throws MalformedURLException {

		Date d = new Date();
		System.out.println(browser + d.toString());
		if (browser.equals("firefox")) {
            cap=new DesiredCapabilities();
            setDesiredCapabilities(cap);
            getDesiredCapabilities().setPlatform(Platform.ANY);
            getDesiredCapabilities().setBrowserName("firefox");

			FirefoxOptions ffOpt = new FirefoxOptions();
			ffOpt.merge(getDesiredCapabilities());

		}

		else if (browser.equals("chrome")) {

			cap=new DesiredCapabilities();
            setDesiredCapabilities(cap);
            getDesiredCapabilities().setPlatform(Platform.ANY);
            getDesiredCapabilities().setBrowserName("chrome");

			ChromeOptions chrOpt = new ChromeOptions();
			chrOpt.merge(getDesiredCapabilities());

		}

		System.out.println("Over here");
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), getDesiredCapabilities());
		setWebDriver(driver);

		getWebDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		getWebDriver().get("http://gmail.com");
		getWebDriver().findElement(By.id("identifierId")).sendKeys(userName);
		getWebDriver().findElement(By.xpath("//div/div/button/div[2]")).click();
		getWebDriver().quit();

	}

	@DataProvider(parallel = true)
	public Object[][] getData() {

		Object[][] data = new Object[2][2];

		data[0][0] = "chrome";
		data[0][1] = "roanprac";

		data[1][0] = "firefox";
		data[1][1] = "roancar";

		return data;
	}
}
