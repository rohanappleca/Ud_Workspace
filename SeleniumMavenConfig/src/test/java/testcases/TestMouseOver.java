package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("way2automation");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).click();
		
		/*
		 * WebDriverWait wait=new WebDriverWait(driver,10);
		 * 
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(
		 * "Resources")));
		 */
		// ---- Locate the 'Resources tab--'  ----
		//WebElement menu=driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[8]/a"));
		
		//WebElement menu=driver.findElement(By.xpath("//a[text()='Resources']"));
		WebElement menu=driver.findElement(By.partialLinkText("Resources"));
		System.out.println("at resources");
		
		// ----- Create object of Actions class
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();
		

	}

}
