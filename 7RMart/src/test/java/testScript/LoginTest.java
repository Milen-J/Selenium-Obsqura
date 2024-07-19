package testScript;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import basePackage.Base;
import dataProviders.DataProviders;
import pages.LoginPage;
import utilities.ExcelUtility;
public class LoginTest extends Base{
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException
	{
		
		String usernamevalue=ExcelUtility.getStringData(1, 0, "Login");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingInValidUsernameandValidPassword() throws IOException
	{
	
	String usernamevalue=ExcelUtility.getStringData(2, 0, "Login");
	String passwordvalue=ExcelUtility.getStringData(2, 1, "Login");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue); 
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	/*boolean isredalertdisplayed = loginpage.isRedAlertDisplayed();
	assertTrue(isredalertdisplayed,"Invalid username.");*/
	
	/*boolean isalertboxavailable=loginpage.isAlertBoxLoaded();
	assertTrue(isalertboxavailable,"Page is loaded when user gives valid username and invalid password");
	
	boolean ishomepageavailable = loginpage.isHomePageLoaded();
	assertTrue(ishomepageavailable,"Page is not loaded when user gives invalid username and valid password");
	*/
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidUsernameInValidPassword() throws IOException
	{
	//String usernamevalue ="admin";
	//String passwordvalue = "admin1";
		String usernamevalue=ExcelUtility.getStringData(3, 0, "Login");
		String passwordvalue=ExcelUtility.getStringData(3, 1, "Login");

	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue); 
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	/*boolean isredalertdisplayed = loginpage.isRedAlertDisplayed();
	assertTrue(isredalertdisplayed,"Invalid password.");*/
	
	/*boolean ishomepageavailable = loginpage.isHomePageLoaded();
	assertTrue(ishomepageavailable,"Page is not loaded when user gives valid username and invalid password");
	*/
	}
	@Test
	public void verifyTheUserIsAbleToLoginUsingInValidUsernameandInvalidPassword() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(4, 0, "Login");
		String passwordvalue=ExcelUtility.getStringData(4, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
	}
	
	//USING DATA PROVIDERS - where we can give multiple values for one test case to execute different data inputs.
	
	@Test(dataProvider="Invalid User Credentials",dataProviderClass=DataProviders.class)
	public void verifyUserLoginWithInvalidCredentials(String username,String password)
	{
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username); 
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		
		boolean actualresultlogin = loginpage.isHomePageLoaded();
	
		
	}
	

	
}
