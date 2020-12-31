import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testSample {

	@Parameters({"browser"})
	@Test
	public void testLogin(String browser) throws MalformedURLException {
		
		DesiredCapabilities cap=null;

        if (browser.equals("firefox")) {
        	
        	cap=DesiredCapabilities.firefox();
        	cap.setBrowserName("firefox");
        	cap.setPlatform(Platform.ANY);
        }
		
        else if(browser.equals("chrome")) {
        	
        	cap=DesiredCapabilities.chrome();
        	cap.setBrowserName("chrome");
        	cap.setPlatform(Platform.ANY);
        	
        }
        
        else if (browser.equals("iexplorer")) {
        	cap=DesiredCapabilities.internetExplorer();
        	cap.setBrowserName("iexplorer");
        	cap.setPlatform(Platform.WINDOWS);
        	
        }
	
	
		System.out.println(cap);
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		System.out.println("Over here now");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("pracrohan");
		driver.findElement(By.xpath("//div/div/button/div[2]")).click();
		driver.quit();
		
	}
		
}
