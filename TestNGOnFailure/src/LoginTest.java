import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class LoginTest extends TestBase{

	public void doLogin() {
		
		driver.findElement(By.id("identifierId")).sendKeys("rohanrode");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")).click();
	}
}
