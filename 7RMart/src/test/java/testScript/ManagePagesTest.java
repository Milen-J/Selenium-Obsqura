package testScript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automation_core.Base;
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
		

		String titlevalue ="Spices1321";
		String descriptionvalue="All types of Spices12";
		String pagenamevalue="Biriyani Spices2121";
		
		ManagePagesPage managepagespage = new ManagePagesPage(driver);
		managepagespage.moreinfonav();
		
		
		managepagespage.newbutton();
		
		managepagespage.enterTitleField(titlevalue);
		managepagespage.enterDescriptionField(descriptionvalue);
		managepagespage.enterPageNameField(pagenamevalue);
		//managepagespage.imageUpload();
	
		managepagespage.clicksaveButton();
		
		boolean islistpagedisplayed = managepagespage.isListPageDisplayed();
		assertTrue(islistpagedisplayed,"Page is not loaded");
		
		
		//boolean isalertboxdisplayed = managepagespage.isAlertBoxDisplayed();
		//assertTrue(isalertboxdisplayed,"Alert box is not displayed.");
		
		
				
	}

}
