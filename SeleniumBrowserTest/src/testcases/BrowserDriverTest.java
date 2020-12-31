package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		callDriver(chrome);
		
		public FirefoxDriver callDriver(String browser) {
			
			if (browser=="chrome") {
				
				return new ChromeDriver();
			}
			
			
		}
		
		
	}

}
