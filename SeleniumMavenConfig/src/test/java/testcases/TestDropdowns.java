package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	
		// driver.findElement(By.id("searchLanguage")).sendKeys("Deutsch");

		// ------------- Using Select class ---- Dropdown value selection

		/*
		 * WebElement dropdown=driver.findElement(By.id("searchLanguage")); Select
		 * select=new Select(dropdown); select.selectByVisibleText("Euskara");
		 */

		// --------------------Print all values in the
		// dropdown---------------------------

		/*
		 * List<WebElement> values = driver.findElements(By.tagName("option"));
		 * System.out.println(values.size());
		 * 
		 * for (int i = 0; i < values.size(); i++) {
		 * 
		 * System.out.println(values.get(i).getAttribute("value")); }
		 */

		// -------------Assignnment to print all links on the page --------------------

		/*
		 * List<WebElement> links = driver.findElements(By.tagName("a"));
		 * 
		 * for (int i = 0; i < links.size(); i++) {
		 * 
		 * System.out.println(links.get(i).getAttribute("href")); }
		 */
		

		//------------Print links only for a particular section --------
		
		
		WebElement section=driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]"));
		List<WebElement> listSection=section.findElements(By.tagName("a"));
		
		for (WebElement ls:listSection) {
			
			System.out.println(ls.getAttribute("href"));
			
			
			
			
		}
		
		
		
	}

}
