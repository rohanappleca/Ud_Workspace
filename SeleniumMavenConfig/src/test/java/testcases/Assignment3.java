package testcases;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static boolean stringContainsNumber(String numberAddition) {
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(numberAddition);

		return m.find();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// ----- Navigate to Polling website -----
		driver.get("https://timesofindia.indiatimes.com/poll.cms");

		String numberAddition = driver.findElement(By.id("mathq2")).getText();

		// numberAddition.
		// System.out.println(Integer.parseInt(numberAddition));
		/*
		 * String[] arr = numberAddition.split("\\+"); System.out.println(arr.length);
		 * for (int i = 0; i < arr.length; i++) {
		 * 
		 * System.out.print(arr[i]); }
		 */

		
		  String[] arr = numberAddition.split("");
		  int sum=0;
		  for (int i = 0; i < arr.length; i++)
		  {
		  
			 if ( stringContainsNumber(arr[i])==true) {
				 
				 String temp=arr[i];
				 sum+=Integer.parseInt(temp);
			 }
			 
			 else if (arr[i].matches("[+-*]")){
				 
				 String operator=arr[i];
				 System.out.println("Operator is "+operator);
				 
			 }
			 
			 else {
				 
				 System.out.println("Other operator :" + arr[i]);
			 }
		    
			
		  
		  }
		  
		  System.out.println("Total Sum is :" +sum);
	}
}
