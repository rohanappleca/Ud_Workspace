package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckboxes {

	static WebDriver driver;

	static boolean isElementPresent(By by) {

		try {

			driver.findElement(by);
			return true;
		}

		catch (Throwable t) {

			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
// --------------By writing XPath of each checkbox --------------
		/*
		 * driver.findElement(By.xpath("//div[4]/input[1]")).click();
		 * driver.findElement(By.xpath("//div[4]/input[2]")).click();
		 * driver.findElement(By.xpath("//div[4]/input[3]")).click();
		 * driver.findElement(By.xpath("//div[4]/input[4]")).click();
		 */
// --------------By using while loop and checking if WebElement of checkbox is present by passing it to a method -----
		/*
		 * int i = 1; int count=0;
		 * 
		 * while (isElementPresent(By.xpath("//div[4]/input[" + i + "]"))) {
		 * 
		 * driver.findElement(By.xpath("//div[4]/input[" + i + "]")).click(); i++;
		 * count++; }
		 * 
		 * System.out.println("Number of checkboxes are :"+count);
		 */
// ---------------By using optmized method --------------
		
		WebElement block=driver.findElement(By.xpath("//div[4]"));
		
		List<WebElement> checkboxes=block.findElements(By.name("sports"));
		
		for (WebElement checkbox:checkboxes) {
			
			checkbox.click();
		}

	}

}
