package regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	@BeforeTest
	public void createDBConn() {

		System.out.println("Create DB connection");
	}

	@BeforeMethod
	public void LaunchBrowser() {

		System.out.println("Launching Browser");
	}

	@Test(priority = 1,groups="functional")
	public void doUserReg() {

		System.out.println("Executing User Reg");
	}

	@Test(priority = 2,groups="functional")
	public void doLogin() {

		System.out.println("Executing Login test");
	}

	@AfterMethod
	public void closeBrowser() {

		System.out.println("Closing Browser");
	}

	@AfterTest
	public void closeDBConn() {

		System.out.println("Closing DB connection");
	}

}
