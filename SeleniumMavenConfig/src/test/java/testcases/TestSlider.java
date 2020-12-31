package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");

	//  ---- Get the XPath of  Slider -----
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));

		
		//  ---- Get the XPath of main Slider -----
		WebElement mainSlider=driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		//  ---- Get the width size and divide it into half
		int width=mainSlider.getSize().width/2;
		
	
	    
		
		
		  Actions actions = new Actions(driver);
		  //------ Drag the slider to the center of the page ----------
		  actions.dragAndDropBy(slider,width, 0).perform();
		  System.out.println("Done");
		 
		
	}

}
