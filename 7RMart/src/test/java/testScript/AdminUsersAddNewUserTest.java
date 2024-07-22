package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import basePackage.Base;
import pages.AdminUsersAddNewUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersAddTest extends Base {
	@Test
	public void verifyUserIsAbleToAddNewAdminUser() throws IOException
	{
		
		String usernamevalue=ExcelUtility.getStringData(1, 0, "Login");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Login");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		
		String adminusernamevalue = ExcelUtility.getStringData(1, 0,"AdminUsersAdd" );
		String adminpasswordvalue = ExcelUtility.getStringData(1, 1,"AdminUsersAdd");
		String usertype1 =	ExcelUtility.getStringData(1, 2,"AdminUsersAdd");
		
			
		AdminUsersAddNewUserPage adminuseraddpage = new AdminUsersAddNewUserPage(driver);
		adminuseraddpage.adminMoreInfo();
		adminuseraddpage.addUsername(adminusernamevalue, adminpasswordvalue, usertype1);
			
	}	
			
			
	}


