package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.AdminUsersAddNewUserPage;
import pages.AdminUsersStatusPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class AdminUsersAddNewUserTest extends Base {
	@Test(groups={"smoke","regression"})
	public void verifyUserIsAbleToAddNewAdminUser() throws IOException
	{
		
		String usernamevalue=ExcelUtility.getStringData(1, 0,Constants.LOGIN_PAGE);
		String passwordvalue=ExcelUtility.getStringData(1, 1,Constants.LOGIN_PAGE);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		
		AdminUsersAddNewUserPage adminuseraddpage = new AdminUsersAddNewUserPage(driver);
		adminuseraddpage.adminMoreInfo();
		
		boolean is_admin_user_page_loaded =adminuseraddpage.isAdminUserPageDisplayed();
		
		adminuseraddpage.newAdminButtonClick();
		
		boolean is_search_button_visible =adminuseraddpage.isSearchButtonDisplayed();
		
		String firstname=RandomDataUtility.getFirstName();
		String lastname=RandomDataUtility.getLastName();
		String username11=firstname;
		String password11=firstname+"."+lastname;
		
		String usertype=ExcelUtility.getStringData(1, 2,Constants.ADD_USER_IN_ADMIN_USER_DATA);
		
		
		
		boolean is_green_alert_visible=adminuseraddpage.isAlertForNewAdminSuccessDisplayed();
		
		
		assertTrue(is_admin_user_page_loaded,Messages.ADMIN_USER_PAGE_NOT_LOADED);
		assertTrue(is_search_button_visible,Messages.ADMIN_USER_NEW_PAGE_NOT_LOADED);
		assertTrue(is_green_alert_visible,Messages.ADMIN_USER_SUCCESSFUL_PAGE_NOT_LOADED);
	}

	
	}	
			
			
	


