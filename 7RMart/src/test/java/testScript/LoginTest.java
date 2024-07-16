package testScript;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;
public class LoginTest extends Base{
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException
	{
		//String usernamevalue ="admin";
		//String passwordvalue = "admin";
		String usernamevalue=ExcelUtility.getStringData(1, 0, "Login");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		/*boolean ishomepageavailable = loginpage.isHomePageLoaded();
		assertTrue(ishomepageavailable,"Page is not loaded when user gives valid credentials");*/
				
		/*boolean isredalertdisplayed = loginpage.isRedAlertDisplayed();
		assertTrue(isredalertdisplayed,"Invalid credentials.");*/
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingInValidUsernameandValidPassword()
	{
	String usernamevalue ="123";
	String passwordvalue = "admin";
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue); 
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	boolean isredalertdisplayed = loginpage.isRedAlertDisplayed();
	assertTrue(isredalertdisplayed,"Invalid username.");
	
	/*boolean isalertboxavailable=loginpage.isAlertBoxLoaded();
	assertTrue(isalertboxavailable,"Page is loaded when user gives valid username and invalid password");
	
	boolean ishomepageavailable = loginpage.isHomePageLoaded();
	assertTrue(ishomepageavailable,"Page is not loaded when user gives invalid username and valid password");
	*/
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidUsernameInValidPassword()
	{
	String usernamevalue ="admin";
	String passwordvalue = "admin1";
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue); 
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	boolean isredalertdisplayed = loginpage.isRedAlertDisplayed();
	assertTrue(isredalertdisplayed,"Invalid password.");
	
	/*boolean ishomepageavailable = loginpage.isHomePageLoaded();
	assertTrue(ishomepageavailable,"Page is not loaded when user gives valid username and invalid password");
	*/
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingInValidUsernameandInvalidPassword()
	{
	String usernamevalue ="123";
	String passwordvalue = "admin12";
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue); 
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	boolean isredalertdisplayed = loginpage.isRedAlertDisplayed();
	assertTrue(isredalertdisplayed,"Invalid username and password.");
	
	/*boolean ishomepageavailable = loginpage.isHomePageLoaded();
	assertTrue(ishomepageavailable,"Page is not loaded when user gives invalid username and invalid password");
	*/
	}
}
