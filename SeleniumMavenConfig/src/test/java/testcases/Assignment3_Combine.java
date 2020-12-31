package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_Combine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// ----- Navigate to Polling website -----
		driver.get("https://timesofindia.indiatimes.com/poll.cms");

		String numberAddition = driver.findElement(By.id("mathq2")).getText();
		
		String temp="";
		int sum=0;
		for (int i=0;i<numberAddition.length();i++) {
			
			
			if (Character.isDigit(numberAddition.charAt(i))) {
				
				char ch=numberAddition.charAt(i);
				temp+=ch;
			}
			
			else {
				
				sum+=Integer.parseInt(temp);
				temp="0";
				
				
			}
			
			
			
		}
		
		sum=sum+Integer.parseInt(temp);
		System.out.println(sum);
		driver.findElement(By.id("mathuserans2")).sendKeys(Integer.toString(sum));

	}

}
