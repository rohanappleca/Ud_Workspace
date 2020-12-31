package regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {

	// -- Assertions (Hard Assert)
	/*
	 * @Test public void validateTitles() {
	 * 
	 * String expectedTitle="gmail.com"; String actualTitle="yahoo.com";
	 * 
	 * if (expectedTitle.equals(actualTitle)) {
	 * 
	 * System.out.println("String is equal"); }
	 * 
	 * else {
	 * 
	 * System.out.println("String is not equal"); }
	 * 
	 * //Assert.assertEquals(actualTitle, expectedTitle);
	 * Assert.fail("String match failed - Assertion message");;
	 * 
	 * }
	 */
	
	
	// -- Soft assertions
		@Test(groups="smoke")
		public void validateTitles() {
			
			String expectedTitle="gmail.com";
			String actualTitle="yahoo.com";
			
		/*
		 * if (expectedTitle.equals(actualTitle)) {
		 * 
		 * System.out.println("String is equal"); }
		 * 
		 * else {
		 * 
		 * System.out.println("String is not equal"); }
		 */
			SoftAssert softassert=new SoftAssert();
			softassert.assertEquals(actualTitle, expectedTitle, "Title does not match");
			
			softassert.assertEquals(true, false, "Text does not match");
			softassert.assertEquals(true, true, "Image matches");
			softassert.assertAll(); // This will assert everything.
			
		}
}
