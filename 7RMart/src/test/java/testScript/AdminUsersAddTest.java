package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminUsersAddPage;
import pages.LoginPage;

public class AdminUsersAddTest extends Base {
	@Test
	public void verifyUserIsAbleToAddNewAdminUser()
	{
		
			String usernamevalue ="admin";
			String passwordvalue = "admin";
			
			LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUserNameOnUserNameField(usernamevalue); 
			loginpage.enterPasswordOnPasswordField(passwordvalue);
			loginpage.clickOnSignInButton();
			
			String adminusernamevalue = "Varun12";
			String adminpasswordvalue = "Varun1";
			
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


