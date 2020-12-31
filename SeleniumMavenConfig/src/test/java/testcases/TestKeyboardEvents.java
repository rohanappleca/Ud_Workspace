package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:gmail.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.name("identifier")).sendKeys("rohanNY");
	
		// driver.findElement(By.name("identifier")).sendKeys(Keys.ENTER);

		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]")).click();
		
		
		
		System.out.println("Outside click");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.chord(Keys.CONTROL,"a")).perform();
		actions.sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();
		
		
		  driver.findElement(By.name("identifier")).click();
		  actions.sendKeys(Keys.chord(Keys.CONTROL,"V")).build().perform();
		 
		

	}

}
