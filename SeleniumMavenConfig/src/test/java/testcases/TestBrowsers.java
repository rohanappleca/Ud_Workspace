package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static String browser = "firefox";
	public static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (browser == "chrome") {

			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 
			

		}

		else if (browser == "firefox") {

			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver driver = new FirefoxDriver();
			System.out.println(driver);

		}

		else if (browser == "ie") {

			WebDriverManager.iedriver().setup();
			InternetExplorerDriver driver = new InternetExplorerDriver();

		}
         
	
		//System.out.println(driver.);
		driver.get("https://www.google.com/");

	}

}
