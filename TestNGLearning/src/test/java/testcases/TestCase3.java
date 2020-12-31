package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest {
	
	@Test(priority = 1,groups={"functional","smoke"})
	public void doUserReg() {

		System.out.println("Executing User Reg");
		Assert.fail("User reg failed");
	}

	@Test(priority = 2,dependsOnMethods="doUserReg",groups={"functional","smoke"}) // Hard dependency
	public void doLogin() {

		System.out.println("Executing Login test");
	}

	@Test(priority = 3,dependsOnMethods="doUserReg",alwaysRun=true,groups={"functional","smoke"})
	public void thirdTest() {

		System.out.println("Executing Third test");
	}
	
	@Test(priority = 4,groups="bvt") // Soft dependency
	public void fourthTest() {

		System.out.println("Executing fourth test");
	}
}
