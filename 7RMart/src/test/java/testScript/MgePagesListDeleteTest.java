package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.LoginPage;
import pages.ManagePagesPage;
import pages.MgePagesListDelete;
import utilities.ExcelUtility;

public class MgePagesListDeleteTest extends Base
{
	@Test(groups={"smoke","regression","sanity"})
	public void verifyTheUserIsAbleToEnterAndDeleteListProducts() throws IOException
	{
		
		String usernamevalue=ExcelUtility.getStringData(1, 0,Constants.LOGIN_PAGE);
		String passwordvalue=ExcelUtility.getStringData(1, 1,Constants.LOGIN_PAGE);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		ManagePagesPage managepagenew=new ManagePagesPage(driver);
		managepagenew.clickOnManagePageBtn();
		
		MgePagesListDelete managelistpages=new MgePagesListDelete(driver);
		
		boolean is_header_list_pages_loaded=managelistpages.isHeaderListPagesVisible();
		managelistpages.clickOnDeleteInListPages();
		
		Assert.assertTrue(is_header_list_pages_loaded,Messages.HEADER_LIST_PAGES_IS_NOT_LOADED);
	}
}