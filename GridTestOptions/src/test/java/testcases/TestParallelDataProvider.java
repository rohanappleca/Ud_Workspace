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

public class TestParallelDataProvider {
	public DesiredCapabilities cap = new DesiredCapabilities();
	public WebDriver driver;

	@Test(dataProvider="getData")
	public void testBrowser(String browser,String userName) throws MalformedURLException {
	
	Date d = new Date();
	System.out.println(browser + d.toString());
	if (browser.equals("firefox")) {

		cap.setPlatform(Platform.ANY);
		cap.setBrowserName("firefox");
		

		FirefoxOptions ffOpt = new FirefoxOptions();
		ffOpt.merge(cap);
		

	}

	else if (browser.equals("chrome")) {

		cap.setPlatform(Platform.ANY);
		cap.setBrowserName("chrome");
		

		ChromeOptions chrOpt = new ChromeOptions();
		chrOpt.merge(cap);

	}
	
	System.out.println("Over here");
	driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("http://gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys(userName	);
	driver.findElement(By.xpath("//div/div/button/div[2]")).click();
	//driver.quit();

}
	@DataProvider(parallel=true)
	public Object[][] getData() {
		
		Object[][] data=new Object[2][2];
		
		data[0][0]="chrome";
		data[0][1]="roanprac";
		
		data[1][0]="firefox";
		data[1][1]="roancar";
		
		return data;
	}
}
