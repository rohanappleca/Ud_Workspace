import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

	@Test
	public void doLogin() {
		
		driver.findElement(By.id("identifierId")).sendKeys("rohanrode16");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")).click();
		
	}
	
	/*
	 * @Test public void composeEmail() {
	 * 
	 * Assert.fail("Error in Composing email");
	 * 
	 * }
	 */
}
