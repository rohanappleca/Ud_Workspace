package parameterization;

import org.testng.annotations.Test;

public class NewLoginTest {
	
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="dp1")
	public void testUserReg(String username,String password) {
		
		System.out.println(username+"-----"+password);
		
	}

	
	@Test(dataProviderClass=DataProviders.class,dataProvider="dp1")
	public void testUserLogin(String fName,String lName,String email) {
		
		System.out.println(fName+"-----"+lName+"----"+email);
		
	}
}
