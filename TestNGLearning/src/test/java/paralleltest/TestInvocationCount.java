package paralleltest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestInvocationCount extends BaseTest{

	@Test(invocationCount=5)
	public void executeTest() {
		
		driver=getDriver("Chrome");
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.getTitle();
		driver.quit();
		
		
		
	}
	
	
}
