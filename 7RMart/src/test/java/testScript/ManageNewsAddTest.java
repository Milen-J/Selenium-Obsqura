package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsAddPage;

public class ManageNewsAddTest extends Base {
	@Test
	public void verifyUserIsAblToAddNews()
	{
		String usernamevalue ="admin";
		String passwordvalue = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		String news = "Project Successful";
		
		ManageNewsAddPage addnews = new ManageNewsAddPage(driver);
		addnews.newsMoreInfo();
		addnews.addNews();
		//addnews.backToNews();
		
		
		
		boolean isnewspagedisplayed = addnews.isNewsPageDisplayed();
		assertTrue(isnewspagedisplayed,"News page is not loaded.");
		
		boolean isgreenalertdisplayed = addnews.newsAlertSuccess();
		assertTrue(isgreenalertdisplayed,"News not added.");
	}

}
