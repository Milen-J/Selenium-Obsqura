package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminUserSearchPage;
import pages.LoginPage;

public class AdminUserSearchTest extends Base{
	@Test
	public void verifyUserIsAbleToSearchAdminUser()
	{
		String usernamevalue ="admin";
		String passwordvalue = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		String searchusernamevalue = "varun12";
		AdminUserSearchPage adminsearch =new AdminUserSearchPage(driver);
		adminsearch.adminUserMoreInfo();
		adminsearch.searchClick(searchusernamevalue);
		
		boolean isadminpagedisplayed = adminsearch.isadminUsersPageDisplayed();
		assertTrue(isadminpagedisplayed,"Admin user page not displayed.");
	}

}
