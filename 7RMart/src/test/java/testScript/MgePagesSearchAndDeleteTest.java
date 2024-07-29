package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import automation_core.Base;
import pages.LoginPage;
import pages.MgePagesSearchAndDeletePage;

public class MgePagesSearchAndDeleteTest extends Base {
	@Test
	public void verifyUserIsAbleTosearchAndDeletePage()
	{
		 
		 String usernamevalue ="admin";
		 String passwordvalue = "admin";
		
		 LoginPage loginpage = new LoginPage(driver);
		 loginpage.enterUserNameOnUserNameField(usernamevalue); 
		 loginpage.enterPasswordOnPasswordField(passwordvalue);
		 loginpage.clickOnSignInButton();
		
		 String titlesearchvalue ="abcd";
		 MgePagesSearchAndDeletePage mgepagessearchvalue = new  MgePagesSearchAndDeletePage(driver);
		 mgepagessearchvalue.moreinfonav();
		 mgepagessearchvalue.searchTitle(titlesearchvalue);
		 mgepagessearchvalue.deleteTitlePage();
		 
		 
		 boolean islistpagedisplayed = mgepagessearchvalue.isListPageDisplayed();
		 assertTrue(islistpagedisplayed,"Page is not loaded");
		 
		 boolean isalertdisplayed = mgepagessearchvalue.isalertPageDisplayed();
		 assertTrue(isalertdisplayed,"Alert page not displayed after user deletes the page");
		
		
		
	}

}
