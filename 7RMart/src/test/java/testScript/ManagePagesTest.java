package testScript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.LoginPage;
import pages.ManagePagesPage;
import utilities.ExcelUtility;

public class ManagePagesTest extends Base
{
	
	@Test(groups={"regression","smoke"})
	public void verifyUserIsAbleToCreateNewPage() throws AWTException
	{
			String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGIN_PAGE);
		    String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGIN_PAGE);
		       
		    LoginPage loginPage = new LoginPage(driver);
		    loginPage.enterUserNameOnUserNameField(usernameVal);
		    loginPage.enterPasswordOnPasswordField(passwordVal);
		    loginPage.clickOnSignInButton();	    

		    ManagePagesPage managePage = new ManagePagesPage(driver);
		    managePage.clickOnManagePageBtn();
			boolean is_new_button_available=managePage.isNewButtonVisible();
			managePage.clickOnCreateNewBtn();
			boolean is_enter_page_informations_header_available=managePage.isEnterPageInformationsHeaderDisplayed();
						    
		    String titledata=ExcelUtility.getStringData(0, 1, Constants.MANAGE_PAGES_NEW_DATA);
			String descriptiondata=ExcelUtility.getStringData(1, 1,Constants.MANAGE_PAGES_NEW_DATA);
			String pagedata=ExcelUtility.getStringData(2, 1,Constants.MANAGE_PAGES_NEW_DATA);
		        
		    managePage.enterTitle(titledata);
		    managePage.enterDescription(descriptiondata);
		    managePage.enterPage(pagedata);
		    managePage.clickOnAddImage();
		    managePage.clickOnSubmitBtn();	        
		    boolean isManagePageAvailable = managePage.isManagePageLoaded();
		      
			Assert.assertTrue(is_new_button_available,Messages.MANAGE_PAGES_NEW_BUTTON_IS_NOT_LOADED);	
			Assert.assertTrue(is_enter_page_informations_header_available,Messages.ENTER_PAGE_INFORMATION_HEADER_NOT_FOUND);	
			Assert.assertTrue(isManagePageAvailable,Messages.SUCCESS_ALERT_FOR_PAGE_NOT_FOUND);

		    }
	}