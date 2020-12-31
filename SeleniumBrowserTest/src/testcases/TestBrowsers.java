package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\UD\\Automation\\Browser_Executables\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

	}

}
