package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import basePackage.Base;
import pages.AdminUsersAddPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersAddTest extends Base {
	@Test
	public void verifyUserIsAbleToAddNewAdminUser() throws IOException
	{
		
			//String usernamevalue ="admin";
			//String passwordvalue = "admin";
		String usernamevalue=ExcelUtility.getStringData(1, 0, "Login");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		
		String adminusernamevalue = ExcelUtility.getStringData(1, 0,"AdminUsersAdd" );
		String adminpasswordvalue = ExcelUtility.getStringData(1, 1,"AdminUsersAdd");
			
			//String adminusernamevalue = "Varun12";
			//String adminpasswordvalue = "Varun1";
			
			AdminUsersAddPage adminuseraddpage = new AdminUsersAddPage(driver);
			adminuseraddpage.adminMoreInfo();
			adminuseraddpage.addNewUser();
			adminuseraddpage.addUsername(adminusernamevalue, adminpasswordvalue);
			
			
			
			
			boolean isadminpagedisplayed = adminuseraddpage.isAdminPageDisplayed();
			assertTrue(isadminpagedisplayed,"Admin page is not displayed.");
			
			boolean isalertforadmindisplayed = adminuseraddpage.isAlertForNewAdminSuccessDisplayed();
			assertTrue(isalertforadmindisplayed,"Alert box for new admin user not displayed");
			
					
			
		}
	}


