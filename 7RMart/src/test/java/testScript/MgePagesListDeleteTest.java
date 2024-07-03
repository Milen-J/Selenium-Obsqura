package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MgePagesListDelete;

public class MgePagesListDeleteTest extends Base {
	@Test
	public void isUserAbleToDeletePageDirectly()
	{
		String usernamevalue ="admin";
		String passwordvalue = "admin";
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		MgePagesListDelete mgepageslistdelete = new MgePagesListDelete(driver);
		mgepageslistdelete.moreinfo();
		mgepageslistdelete.isListPageDisplayed();
		mgepageslistdelete.deletePage();
		
		boolean isalertboxdisplayed = mgepageslistdelete.isAlertForDeletionDisplayed();
		assertTrue(isalertboxdisplayed,"Alert box not displayed");
	}

}
