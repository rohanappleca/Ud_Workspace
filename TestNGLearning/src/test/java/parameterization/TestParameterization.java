package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {

	
	
	
	@Test(dataProvider = "getData")
	public void doLogin(String username, String password) {

		System.out.println("Username is  " + username);
		System.out.println("Password is  " + password);
		System.out.println("Out from loop");
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[3][2];
		data[0][0] = "rohanr@gmail.com";
		data[0][1] = "anechka@11";
		data[1][0] = "sid166@gmail.com";
		data[1][1] = "anechka@12";
		data[2][0] = "arc@gmail.com";
		data[2][1] = "anechka@16";
		return data;
	}
}
