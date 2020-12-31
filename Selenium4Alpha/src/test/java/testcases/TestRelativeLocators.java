package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//--import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.findElement(By.name("email")).sendKeys("rohanprag@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"load_form\"]/div/div[2]/input")).click();
        driver.findElement(RelativeLocator.withTagName("input").below(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input"))).click();
        System.out.println("Sign on clicked");
		
	

	}

}
