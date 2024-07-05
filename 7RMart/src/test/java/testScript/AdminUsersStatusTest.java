package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminUsersStatusPage;
import pages.LoginPage;

public class AdminUsersStatusTest extends Base{
	
	@Test
	public void verifyUserIsAbleToChangeStatus()
	{
		String usernamevalue ="admin";
		String passwordvalue = "admin";
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		AdminUsersStatusPage adminuserstatus = new AdminUsersStatusPage(driver);
		adminuserstatus.adminUserStatusMoreinfo();
		adminuserstatus.statusChange();
		adminuserstatus.isAdminUsersPageDisplayed();
		
		boolean isadminuserspagedisplayed = adminuserstatus.isAdminUsersPageDisplayed();
		assertTrue(isadminuserspagedisplayed,"Admin users page is not displayed.");
		
		boolean isaertstatusdisplayed = adminuserstatus.isAlertStatusDisplayed();
		assertTrue(isaertstatusdisplayed,"Alert for status change not displayed.");
	}

}
