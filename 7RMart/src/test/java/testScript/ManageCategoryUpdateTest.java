package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import automation_core.Base;
import pages.LoginPage;
import pages.ManageCategoryUpdatePage;

public class ManageCategoryUpdateTest extends Base {
	@Test
	public void verifyUserIsAbleToUpdateCategory()
	{
		String usernamevalue ="admin";
		String passwordvalue = "admin";
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		String categoryvalue="Cars100";
				
		ManageCategoryUpdatePage managecategoryupdate = new ManageCategoryUpdatePage(driver);
		managecategoryupdate.mgeCategory();
		managecategoryupdate.clickOnAction();
		managecategoryupdate.enterDetails(categoryvalue);
		managecategoryupdate.dragAndDropGroups();
		managecategoryupdate.imageUpload();
		managecategoryupdate.topMenuRadiobtn();
		managecategoryupdate.leftMenuRadioBtn();
		managecategoryupdate.updateBtn();
		
		boolean iscategorypagedisplayed = managecategoryupdate.isCategoryPageDisplayed();
		assertTrue(iscategorypagedisplayed,"Category page not loaded.");
		
		boolean greenalertdisplayed = managecategoryupdate.greenalertDisplayed();
		assertTrue(greenalertdisplayed,"Updation not successful.");
		}
		
		
		
	}
	

