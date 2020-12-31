package soap;
import java.io.IOException;
import org.apache.xmlbeans.XmlException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;



public class TestRunner {

	
	//public static void main(String[] args)
	@Test
	public void SoapTest() throws XmlException, IOException, SoapUIException
	
	{
		
		
		
		  WsdlProject project=new WsdlProject("C:\\UD\\Rest_API\\Employee.xml");
		  WsdlTestSuite testSuite=project.getTestSuiteByName("Testing");
		  
		  for (int i=0;i<testSuite.getTestCaseCount();i++) {
		  
		  
		  WsdlTestCase testCase=testSuite.getTestCaseAt(i);
		  System.out.println("Value of i" + " " + i); WsdlTestCaseRunner
		  testRunner=testCase.run(new PropertiesMap(), false);
		  //System.out.println(testRunner.getStatus());
		  Assert.assertEquals(Status.FINISHED, testRunner.getStatus());
		  
		  }
		 

	}	

}
