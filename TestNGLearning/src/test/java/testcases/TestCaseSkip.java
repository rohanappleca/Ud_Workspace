package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCaseSkip {

	@Test
	public void skipTestcase() {
		
		
		throw new SkipException("Skipping the test cases");
		
	}
}
