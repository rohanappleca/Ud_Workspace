package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https:google.com");
		Dimension d=new Dimension(100,100);
		driver.manage().window().setSize(d);
		
		
		
		Actions actions = new Actions(driver);
		actions.clickAndHold().pause(5000).perform();
		
		Dimension d1=new Dimension(400,400);
		driver.manage().window().setSize(d1);
		actions.clickAndHold().release().perform();
		
		
		
		
		
	
		
		/*
		 * Dimension d1=new Dimension(700,700); driver.manage().window().setSize(d1);
		 */
	}

}
