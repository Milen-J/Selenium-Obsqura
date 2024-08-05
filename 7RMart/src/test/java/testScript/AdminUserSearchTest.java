package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.AdminUserSearchPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserSearchTest extends Base{
	@Test(groups={"smoke","regression"})
    public void verifyAdminUserSearch(){
		String usernameVal = ExcelUtility.getStringData(1, 0, Constants. LOGIN_PAGE);
	    String passwordVal = ExcelUtility.getStringData(1, 1, Constants. LOGIN_PAGE);
	            
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUserNameOnUserNameField(usernameVal);
        loginPage.enterPasswordOnPasswordField(passwordVal);
        loginPage.clickOnSignInButton();

        AdminUserSearchPage adminUserSearchPage = new AdminUserSearchPage(driver);
        String searchUserName = ExcelUtility.getStringData(1, 0,Constants.ADMIN_USER_SEARCH_DATA);
        String searchUserType = ExcelUtility.getStringData(1, 1,Constants.ADMIN_USER_SEARCH_DATA);
        adminUserSearchPage.clickOnAdminUsersBtn();
        
        adminUserSearchPage.clickOnSearchBtn();
		boolean is_admin_users_header_available=adminUserSearchPage.isAdminUserHeaderDisplayed();
        
        adminUserSearchPage.enterUserName(searchUserName);
        adminUserSearchPage.selectUserType(searchUserType);
        adminUserSearchPage.clickOnFindUserBtn();

		Assert.assertTrue(is_admin_users_header_available,Messages.ADMIN_USER_PAGE_NOT_LOADED);
    }
}
