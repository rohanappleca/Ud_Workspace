import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

	@Test(priority=1)
	public void doLogin() {

		driver.findElement(By.id("identifierId1")).sendKeys("rohanrode");
		driver.findElement(By.xpath("//div/button/div[2]")).click();

		
	}
	
	@Test(priority=2)
	public void composeEmail() {
		
		Assert.fail("Error sending email");
	}

}
