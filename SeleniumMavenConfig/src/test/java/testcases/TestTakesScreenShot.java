package testcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTakesScreenShot {

	public static WebDriver driver;
	
	
	public static void getScreenShot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);

		Date d =new Date();
		String fileName=d.toString().replace(':', '_').replace(' ', '_');
		
		
		
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+fileName+".jpg"));
		

	}

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
        
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");

		
		
		getScreenShot();

	}

}
