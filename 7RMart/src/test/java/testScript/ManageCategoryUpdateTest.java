package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.LoginPage;
import pages.ManageCategoryUpdatePage;
import utilities.ExcelUtility;

public class ManageCategoryUpdateTest extends Base {
	@Test(groups={"smoke","regression"})
	public void verifyTheUserIsAbleToUpdateInManageCategory() 
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0,Constants.LOGIN_PAGE);
		String passwordvalue=ExcelUtility.getStringData(1, 1,Constants.LOGIN_PAGE);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		ManageCategoryUpdatePage  manageupdatecategory=new ManageCategoryUpdatePage (driver);
		manageupdatecategory.mgeCategory();
		
		boolean is_header_list_categories_loaded=manageupdatecategory.isHeaderListCategoriesVisible();
		
		manageupdatecategory.clickOnAction();
		boolean is_header_edit_category_loaded=manageupdatecategory.isHeaderEditCategoryVisible();
		
		String category=ExcelUtility.getStringData(1, 0,Constants.UPDATE_IN_MANAGE_CATEGORY_DATA);
		manageupdatecategory.enterCategoryInformation(category);
		
		manageupdatecategory.clickOnUpdateButton();
		
		Assert.assertTrue(is_header_list_categories_loaded,Messages.HEADER_LIST_CATEGORIES_NOT_LOADED);
		Assert.assertTrue(is_header_edit_category_loaded,Messages.HEADER_EDIT_CATEGORY_NOT_LOADED);
		
	}
}
	

