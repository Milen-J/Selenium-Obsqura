package testScript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagePagesPage;

public class ManagePagesTest extends Base{
	@Test
	public void verifyUserIsableToEnterTitle()
	{
		String usernamevalue ="admin";
		String passwordvalue = "admin";
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		

		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/pages/add");
		
		
		String titlevalue ="Spices132";
		String descriptionvalue="All types of Spices12";
		String pagenamevalue="Biriyani Spices212";
		
		ManagePagesPage managepagespage = new ManagePagesPage(driver);
		managepagespage.moreinfonav();
		boolean islistpagedisplayed = managepagespage.isListPageDisplayed();
		assertTrue(islistpagedisplayed,"Page is not loaded");
		
		
		managepagespage.newbutton();
		
		managepagespage.enterTitleField(titlevalue);
		managepagespage.enterDescriptionField(descriptionvalue);
		managepagespage.enterPageNameField(pagenamevalue);
		managepagespage.clicksaveButton();
		
		
		
		boolean isalertboxdisplayed = managepagespage.isAlertBoxDisplayed();
		assertTrue(isalertboxdisplayed,"Alert box is not displayed");
		
	}

}
