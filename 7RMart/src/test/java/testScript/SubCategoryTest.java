package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;



import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;
public class SubCategoryTest extends Base {
	@Test(groups= {"sanity","regression"})
	
	public void verifyUserIsAbleToAddSubcategory(String categoryselectvalue, String subcategoryvalue)
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0,Constants.LOGIN_PAGE);
		String passwordvalue=ExcelUtility.getStringData(1, 1,Constants.LOGIN_PAGE);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		SubCategoryPage subcategorypage = new  SubCategoryPage(driver);
		boolean issubcategorylistdisplayed= subcategorypage.isHeaderListSubCategoriesVisible();
		
		subcategorypage.clickOnNewInListSubCategory();
		boolean istitleaddsubcategorydisplayed=subcategorypage.isHeaderAddSubCategoryVisible();
		
	
		String categorydropdownvalue=ExcelUtility.getIntegerData(0, 1,Constants.SUB_CATEGORY_DATA_PAGE);
		String subcategoryname=RandomDataUtility.getProductSubCategory();
		String subcategorytextfieldvalue=subcategoryname;
		
		
		subcategorypage.enterDataInAddSubcategoryWindow(categorydropdownvalue,subcategorytextfieldvalue);
		subcategorypage.clickOnSaveButton();
		
		
		Assert.assertTrue(issubcategorylistdisplayed,Messages.HEADER_LIST_SUBCATEGORIES_NOT_LOADED);
		Assert.assertTrue(istitleaddsubcategorydisplayed,Messages.HEADER_ADD_SUBCATEGORIES_NOT_LOADED);
		
		
	}
}
