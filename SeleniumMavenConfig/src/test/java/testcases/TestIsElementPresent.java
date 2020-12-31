package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {

	static WebDriver driver;

	public void add() {

		System.out.println("adding");
	}

	public static boolean isElementPresent(By by) {

		// -------1st Method to check if an element exists -----------
		  System.out.println(by);
		  try { driver.findElement(by); 
		  return true;
		  
		  }
		  
		  catch (Throwable t) {
		  
		  return false;
		  
		  }
		 

		// -----2nd method to check if an element exists ------------

		/*
		 * int size = driver.findElements(By.xpath(locator)).size();
		 * 
		 * if (size == 0) {
		 * 
		 * return false; }
		 * 
		 * else {
		 * 
		 * return true; }
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// -----Check if element is displayed ----------
		System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed());

		// ---- Check if element is present ---------

		System.out.println(isElementPresent(By.xpath("//*[@id=\"searchLanguage\"]")));

	}

}
