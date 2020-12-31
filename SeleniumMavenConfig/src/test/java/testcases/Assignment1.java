package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//----- Navigate to Google search -----
		driver.get("https:google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//----- Type way2Automation-----
		driver.findElement(By.name("q")).sendKeys("Way2Automation");
		
		//----- Click on search-----
		driver.findElement(By.name("btnK")).click();
		
		//----- Click on the 1st link-----
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//------Print count of links  ---------
		System.out.println("Count of links is :" +links.size());
		
		//------Print text of links   ---------
		for (WebElement link:links) {
			
		//System.out.println(link.getAttribute("href"));
		System.out.println(link.getText());
			
		}

	}

}
