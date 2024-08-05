package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.LoginPage;
import pages.MgePagesSearchAndDeletePage;
import utilities.ExcelUtility;

public class MgePagesSearchAndDeleteTest extends Base {
	@Test(groups={"smoke","regression"})
	public void verifyUserIsAbleTosearchAndDeletePage()
	{
		 

		String usernamevalue=ExcelUtility.getStringData(1, 0,Constants.LOGIN_PAGE);
		String passwordvalue=ExcelUtility.getStringData(1, 1,Constants.LOGIN_PAGE);
		
		 LoginPage loginpage = new LoginPage(driver);
		 loginpage.enterUserNameOnUserNameField(usernamevalue); 
		 loginpage.enterPasswordOnPasswordField(passwordvalue);
		 loginpage.clickOnSignInButton();
		
		 String search=ExcelUtility.getStringData(0, 1,Constants.MANAGE_PAGES_SEARCH_AND_DELETE_DATA);
		
		 MgePagesSearchAndDeletePage mgepagessearchvalue = new  MgePagesSearchAndDeletePage(driver);
		 mgepagessearchvalue.moreinfonav();
		 boolean islistpagedisplayed=mgepagessearchvalue.isListPageDisplayed();
		 mgepagessearchvalue.deleteTitlePage();
		 mgepagessearchvalue.searchTitle(search);
		 boolean isalertpagedisplayed = mgepagessearchvalue.isalertPageDisplayed();
		 
		 Assert.assertEquals(islistpagedisplayed,Messages.HEADER_LIST_PAGES_IS_NOT_LOADED);
		 Assert.assertEquals(isalertpagedisplayed, Messages.ALERT_FOR_DELETING_PAGE_SEARCH_NOT_LISTED);
		 
	}

}
