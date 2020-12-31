package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_TabsandPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Set<String> winIds=driver.getWindowHandles();
		System.out.println(winIds.size());
		
		Iterator<String> iterator =winIds.iterator();
		
		int count=1;
		while(iterator.hasNext()) {
			
			System.out.println("In  "+count+" window");
			driver.switchTo().window(iterator.next());
			if (count>1) {
				
				System.out.println(driver.getTitle());
				driver.close();
				
			}
			
			count++;
		}
		
		
	}

}
