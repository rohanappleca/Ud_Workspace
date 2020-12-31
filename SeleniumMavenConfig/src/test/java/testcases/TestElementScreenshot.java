package testcases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElementScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		
		
		// -----Capture the screenshot and store in a file 
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// ------Locate the Xpath of the image
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
		
		
		//  -----Get the Location of the Image on the screen
		Point point=ele.getLocation();
		
	    //  -----Get the Dimension of the Image
		Dimension d=ele.getSize();
		
		//  -----Get Buffered image from the screenshot
		BufferedImage bImage=ImageIO.read(screenshot);
		
	   //  -----Get Sub Image from the Buffered Image
		BufferedImage subImage=bImage.getSubimage(point.getX(),point.getY(), d.getWidth(), d.getHeight());
		
		//  -----
		
		
		ImageIO.write(subImage, "jpg", screenshot);
		
		
		
		FileUtils.copyFile(screenshot, new File(".//screenshot//Elementimage.jpg"));
		
		
	}

}
