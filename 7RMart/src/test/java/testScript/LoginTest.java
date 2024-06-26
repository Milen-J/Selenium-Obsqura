package testScript;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
public class LoginTest extends Base{
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials()
	{
		String usernamevalue ="admin";
		String passwordvalue = "admin";
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		boolean ishomepageavailable = loginpage.isHomePageLoaded();
		assertTrue(ishomepageavailable,"Page is not loaded when user gives valid credentials");
				
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingInValidUsername()
	{
	String usernamevalue ="admin1234";
	String passwordvalue = "admin";
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue); 
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	boolean ishomepageavailable = loginpage.isHomePageLoaded();
	assertTrue(ishomepageavailable,"Page is not loaded when user gives valid credentials");
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingInValidPassword()
	{
	String usernamevalue ="admin";
	String passwordvalue = "admin1";
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue); 
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	boolean ishomepageavailable = loginpage.isHomePageLoaded();
	assertTrue(ishomepageavailable,"Page is not loaded when user gives valid credentials");
	}
	
	
}
