package testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFrames {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		
		
		
		// --------Switch to frame by ID or Name ----
		//driver.switchTo().frame("iframeResult");
		
		// ---- Switch to frame by ID ----
		//driver.switchTo().frame(0);
		
		//  ------Switch by WebElement ---
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
		//*[@id="iframeResult"]
		
		// -------Using JavascriptExecutor Method 1 ------------
		//((JavascriptExecutor)driver).executeScript("myFunction()");
       
		// -------Using JavascriptExecutor Method 2 ------------
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("myFunction()");
		//driver.findElement(By.xpath("/html/body/button")).click();
		System.out.println("Clicked ");
		driver.switchTo().defaultContent();
		
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		
		System.out.println("Count of frames :"+frames.size());
		
		for (WebElement frame:frames) {
			
			System.out.println(frame.getAttribute("id"));
			
			
		}
		
		
		

	}

}
