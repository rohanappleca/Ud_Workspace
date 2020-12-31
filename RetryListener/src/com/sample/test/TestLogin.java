package com.sample.test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {

	@Test(priority=1)
	public void doLogin() {
		
		System.out.println("Login passed");
		
	}
	
	static int count=0;
	@Test(priority=2)
	public void registeredUsers() {
		count++;
		System.out.println(count);
		Assert.fail("Execution failed while registering a user");
		Assert.assertEquals(count, 2);
		
	}
}
