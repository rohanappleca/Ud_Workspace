package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTable {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> rowNum=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Number of rows are :"+rowNum.size());
		
		List<WebElement> colNum=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Number of Columns are :"+colNum.size());
		
		int rows;
		int cols=1;
		
		for (rows=1;rows<=rowNum.size();rows++) {
			
			System.out.print("Row :"+rows+" ");
			for (cols=1;cols<=colNum.size();cols++) {
				//System.out.print("Row :"+rows +" "+"Column:"+cols+ " ");
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+cols+"]")).getText()+ " ");
				
			}
			
			System.out.println();
			
		}
		
		
		
		
	}

}
