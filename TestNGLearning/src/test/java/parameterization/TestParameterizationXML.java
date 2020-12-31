package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterizationXML {

	
	@Parameters({"browser","env"})
	@Test
	
	public void testLogin(String browser,String env) {
		
		System.out.println(browser+"--" + env);
		
	}
}
