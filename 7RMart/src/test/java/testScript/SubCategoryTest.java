package testScript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation_core.Base;
import pages.LoginPage;
import pages.SubCategoryPage;

public class SubCategoryTest extends Base {
	@Test
	public void verifyUserIsAbleToAddSubcategory()
	{
		 String usernamevalue ="admin";
		 String passwordvalue = "admin";
		
		 LoginPage loginpage = new LoginPage(driver);
		 loginpage.enterUserNameOnUserNameField(usernamevalue); 
		 loginpage.enterPasswordOnPasswordField(passwordvalue);
		 loginpage.clickOnSignInButton();
		
		 String subcategoryvalue ="Rice";
		 SubCategoryPage subcategorypage = new  SubCategoryPage(driver);
		 subcategorypage.moreinfo();
		 subcategorypage.addSubCategory(subcategoryvalue);
		
		 boolean islistpagesdisplayed = subcategorypage.isListPageDisplayed();
		 assertTrue(islistpagesdisplayed,"List Page not loaded.");
		 
		 boolean isalertboxdisplayed = subcategorypage.isSubCategoryAletDisplayed();
		 assertTrue(isalertboxdisplayed,"Alert not displayed");
	}

}
