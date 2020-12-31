package paralleltest;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProviderParallel {

	
	@Test(dataProvider="getData")
	public void doLogin(String browser) {
		
		Date d =new Date();
		
		
		System.out.println(browser+"--"+d);
	}
	
	@DataProvider(parallel=true)
	public Object[][] getData() {
		
		Object[][] data=new Object[2][1];
		
		data[0][0]="Chrome";
		data[1][0]="IE";
		return data;
		
	}
}
