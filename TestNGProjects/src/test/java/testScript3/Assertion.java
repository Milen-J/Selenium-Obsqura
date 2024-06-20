package testScript3;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertion extends Base {
	@Test
	public void assertEqualsTest()//when two strings are same,validating
	{
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring = driver.getTitle();
		System.out.println(actualstring);
		String expectedstring="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(actualstring, expectedstring);
	}
	@Test
	public void assertNotEqualsTest()//when two strings are different
	{
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring = driver.getTitle();
		System.out.println(actualstring);
		String expectedstring="Most Reliable App & Cross Browser Testing Platform | BrowserStack..";
		Assert.assertNotEquals(actualstring, expectedstring, "Not same Title.");
	}
	@Test
	public void assertTrueTest() //verifies that a condition is true.
	{
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifytitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertTrue(verifytitle);
	}
	@Test
	public void assertFalse()
	{
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifytitle = driver.getTitle().equalsIgnoreCase("Most reliable App & Cross Browser Testing Platform\\BrowserStack..");
		Assert.assertFalse(verifytitle);
	}
	@Test
	public void assertNullTest()
	{
		driver.navigate().to("https://www.browserstack.com/");
		String verifyassertnull= null;
		Assert.assertNull(verifyassertnull);
		
	}
	@Test
	public void assertNotNullTest() 
	{
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifyassernottnull= driver.getTitle().equalsIgnoreCase("Most reliable App & Cross Browser Testing Platform\\BrowserStack");;
		Assert.assertNotNull(verifyassernottnull);
	}
	
}
	