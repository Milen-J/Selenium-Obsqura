package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.AdminUsersStatusPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersStatusTest extends Base{
	
	@Test(groups={"smoke","regression"})
	public void verifyUserIsAbleToChangeStatus()
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0,Constants.LOGIN_PAGE);
		String passwordvalue=ExcelUtility.getStringData(1, 1,Constants.LOGIN_PAGE);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		
		AdminUsersStatusPage adminuserstatus = new AdminUsersStatusPage(driver);
		adminuserstatus.adminUserStatusMoreinfo();
		adminuserstatus.statusChange();
		adminuserstatus.isAdminUsersPageDisplayed();
		
		boolean isadminuserspagedisplayed = adminuserstatus.isAdminUsersPageDisplayed();
		Assert.assertEquals(isadminuserspagedisplayed, Messages.ADMIN_USER_PAGE_NOT_LOADED);
			
		boolean isalertstatusdisplayed = adminuserstatus.isAlertStatusDisplayed();
		Assert.assertEquals(isalertstatusdisplayed, Messages.ADMIN_USER_SUCCESSFUL_PAGE_NOT_LOADED);
	}
}
