package testcases;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHandlingCalendars {

	static int currentDay, currentMonth, currentYear;

	static int targetDay, targetMonth, targetYear;

	static int jumpMonthsby;

	static String targetDate = "20/03/2020";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames" + frames.size());
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		System.out.println("Date picker found");

		getCurrentDate();

		System.out.println("Current Date  " + currentDay + "  " + currentMonth + "   " + currentYear);

		getTargetDate(targetDate);

		System.out.println("Target Date  " + targetDay + "  " + targetMonth + "   " + targetYear);

		// ------------Jump months by ---------
		jumpMonthsby = targetMonth - currentMonth;
		System.out.println("Jump months " + jumpMonthsby);

		// -----------Month Click -----------
		if (jumpMonthsby > 0) {

			while (jumpMonthsby < 0) {

				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();

				jumpMonthsby--;
			}

		}

		else {

			while (jumpMonthsby < 0) {

				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();

				jumpMonthsby++;
			}
			

		}

		// -----------Day Click -----------
		driver.findElement(By.linkText("20")).click();
	}

	public static void getCurrentDate() {

		Calendar cal = Calendar.getInstance();
		currentDay = cal.get(Calendar.DAY_OF_MONTH);

		currentMonth = cal.get(Calendar.MONTH) + 1;

		currentYear = cal.get(Calendar.YEAR);

	}

	public static void getTargetDate(String targetDate) {

		int firstIndex = targetDate.indexOf('/');
		int lastIndex = targetDate.lastIndexOf('/');
		int lengthOfString = targetDate.length();
		System.out.println("Length" + lengthOfString);
		targetDay = Integer.parseInt(targetDate.substring(0, firstIndex));

		targetMonth = Integer.parseInt(targetDate.substring(firstIndex + 1, lastIndex));
		targetYear = Integer.parseInt(targetDate.substring(lastIndex + 1, lengthOfString));

	}

}
