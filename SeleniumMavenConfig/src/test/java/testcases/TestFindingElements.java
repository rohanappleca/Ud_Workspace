package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFindingElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https:gmail.com");

		// --Enter Username (Using Explicit wait)

//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"identifierId\"]"))).sendKeys("rohandevika");// Presence of Element
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identifierId\"]"))).sendKeys("rohanprac"); // Visibility of Element

		// Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(20))
			.pollingEvery(Duration.ofSeconds(5))
			.withMessage("User time out after 30 seconds")
			.ignoring(NoSuchElementException.class);
		
		
				
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"identifierIdklk\"]"))).sendKeys("rohandevika");
		
	
		

		// --Enter Username
		// driver.findElement(By.name("identifier")).sendKeys("rohan");
		// Thread.sleep(1000);

		// --Next Button click
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();

		// --Implicit wait
		// driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		System.out.println("Before entering password");
		// -- Enter Password
		driver.findElement(By.name("password")).sendKeys("devika");

	}

}
