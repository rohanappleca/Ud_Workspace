package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//----- Navigate to QA Automation website -----
		driver.get("http://qa.way2automation.com/");
		
		
		//----- Enter Name -----
		driver.findElement(By.name("name")).sendKeys("Ron");
		//----- Enter Phone number -----
		driver.findElement(By.name("phone")).sendKeys("+1-64656498243");
		//----- Enter EmailID -----
		driver.findElement(By.name("email")).sendKeys("rrss@gmail.com");
		
		//----- Select Country -----
		WebElement dropdown= driver.findElement(By.name("country"));
		
		Select selectCountry=new Select(dropdown);
		selectCountry.selectByValue("United States");
		
		//----- Enter City -----
		driver.findElement(By.name("city")).sendKeys("New york");
		
		
		//----- Enter UserName -----
         driver.findElement(By.xpath("//fieldset[6]/input")).sendKeys("rohansid87");
         
       //----- Enter Password -----
         driver.findElement(By.xpath("//fieldset[7]/input")).sendKeys("sidroan");
         
         // ---------Click on Submit button -----
         driver.findElement(By.xpath("//div/div/form/div/div[2]/input")).click();
		
	}

}
