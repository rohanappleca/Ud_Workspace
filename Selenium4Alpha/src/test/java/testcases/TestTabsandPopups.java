package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTabsandPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		//--WebDriverManager.firefoxdriver().setup();
		//--WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Hi Prag");
		driver.get("http://google.com");
		
		System.out.println("First Tab "+ driver.getTitle());
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://gmail.com");
		System.out.println("Second Tab "+ driver.getTitle());
		
		// -- Clicking on Sign In link
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		
		Set<String> winIDs=driver.getWindowHandles();
		Iterator<String> iterator=winIDs.iterator();
		
		
		iterator.next();
		String third_Window=iterator.next();
		
		driver.switchTo().window(third_Window);
		
		System.out.println("Third Tab" + driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.way2automation.com/");
		
		System.out.println("New Window" +driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(third_Window);
		driver.close();
		
		
		
		
		

	}

}
