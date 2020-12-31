package parameterization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	
	@DataProvider(name="dp1")
	public Object[][] getData(Method m){
		
		Object[][] data=null;
		
		if (m.getName().equals("testUserReg")) {
			
			 data=new Object[2][2];
			data[0][0]="rohanmethod1";
			data[0][1]="rodemethod1";
			data[1][0]="carmethod1";
			data[1][1]="buttamethod1";
			
		}
		else if(m.getName().equals("testUserLogin")){
			
			 data=new Object[2][3];
			data[0][0]="rohanmethod2";
			data[0][1]="rodemethod2";
			data[0][2]="rr@gmail.com";
			
			data[1][0]="carmethod2";
			data[1][1]="buttamethod2";
			data[1][2]="car@gmail.com";
			
		}
		
		
		
		return data;
	}
}
