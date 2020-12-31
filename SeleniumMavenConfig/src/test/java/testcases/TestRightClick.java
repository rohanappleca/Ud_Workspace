package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		
		WebElement img=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		
		
		Actions actions=new Actions(driver);
		actions.contextClick(img).perform();;
		WebElement productInfo=driver.findElement(By.xpath("//*[@id=\"dm2m1i1tdT\"]"));
		actions.moveToElement(productInfo).perform();
		WebElement installation=driver.findElement(By.xpath("//*[@id=\"dm2m2i1tdT\"]"));
		actions.moveToElement(installation).perform();
		WebElement setUp=driver.findElement(By.xpath("//*[@id=\"dm2m3i1tdT\"]"));
		actions.moveToElement(setUp).click().perform();

	}

}
