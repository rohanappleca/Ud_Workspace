package testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCase1 {


	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setUp() {
		
		// ---Define the Path of the report (Here "." means root directory )
		htmlReporter=new ExtentHtmlReporter("./reports/extent.html");
		
		// ---Set the encoding to UTF-8
		htmlReporter.config().setEncoding("utf-8");
		
		// --- Set the document title 
		htmlReporter.config().setDocumentTitle("Automation Reports");
		
		// --- Set the Report name
		htmlReporter.config().setReportName("Automationt Test Results");
		
		// --- Set the Theme
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
		extent.setSystemInfo("Automation Tester", "Rohan Rode");
		extent.setSystemInfo("Organization", "Nuance");
		extent.setSystemInfo("Build Number", "3.1");		
		System.out.println("Inside before test");
	}
	
	@AfterTest
	public void endReport() {
		 extent.flush();	
		
	}
	 
	@Test
	public void doLogin() {
		
		test=extent.createTest("Login Test");
		System.out.println("Executing Login Test");
	}
	
	
	@Test
	public void doUserReg() {
		
		test=extent.createTest("User Reg Test");
		Assert.fail("User registration test failed");
	}
	
	
	@Test
	public void isSkip() {
		
		test=extent.createTest("User Reg Test");
		throw new SkipException("Skipping the test case");
	}
	
	// ---ITestResult is an interface .It contains methods which can get the results of the test cases if it is pass or fail
	@AfterMethod
	public void tearDown(ITestResult result) {
		
		if (result.getStatus()==ITestResult.FAILURE) {
			
			String methodName=result.getMethod().getMethodName();
			String logText="<b>"+methodName.toUpperCase()+"Failed"+"</b>";
			Markup m=MarkupHelper.createLabel(logText, ExtentColor.RED);
			test.fail(m);
		}
		
		else if (result.getStatus()==ITestResult.SKIP) {
			String methodName=result.getMethod().getMethodName();	
			String logText="<b>"+methodName.toUpperCase()+"Skipped"+"</b>";
			Markup m=MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
			test.skip(m);
		}
		
		else if (result.getStatus()==ITestResult.SUCCESS) {
			
			String methodName=result.getMethod().getMethodName();	
			String logText="<b>"+methodName.toUpperCase()+"Passed"+"</b>";
			Markup m=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			test.pass(m);
			
		}
		
	}
	
	
}
