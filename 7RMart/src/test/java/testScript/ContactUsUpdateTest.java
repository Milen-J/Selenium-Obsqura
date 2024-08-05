package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.ContactUsUpdatePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class ContactUsUpdateTest extends Base
{
	@Test(groups={"smoke","regression"})
	public void verifyUserIsAbleToUpdateContacts()
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0,Constants.LOGIN_PAGE);
		String passwordvalue=ExcelUtility.getStringData(1, 1,Constants.LOGIN_PAGE);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue); 
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		ContactUsUpdatePage contactuspage = new ContactUsUpdatePage(driver);
	
		contactuspage.contactusmoreinfo();
		
		boolean is_contact_us_header_available=contactuspage.isContactUsPageDisplayed();
		contactuspage.contactactionclick();
		String newPhoneNumber = ExcelUtility.getIntegerData(1, 0,Constants.MANAGE_CONTACTS_DATA);
	    String newEmail = ExcelUtility.getStringData(1, 1,Constants.MANAGE_CONTACTS_DATA);
	    String newAddress= ExcelUtility.getStringData(1, 2,Constants.MANAGE_CONTACTS_DATA);
	    String newDeliveryTime= ExcelUtility.getIntegerData(1, 3,Constants.MANAGE_CONTACTS_DATA);
	    String newDeliveryLimit = ExcelUtility.getIntegerData(1, 4,Constants.MANAGE_CONTACTS_DATA);
		
	    contactuspage.enterPhoneNumber(newPhoneNumber);
		contactuspage.enterEmail(newEmail);
		contactuspage.enterAddress(newAddress);
		contactuspage.enterDeliveryTime(newDeliveryTime);
		contactuspage.enterDeliveryLimit(newDeliveryLimit);
		contactuspage.clickOnSubmitButton();
		
		boolean isupdatealertdisplayed = contactuspage.isContactUpdateAlertDisplayed();
		
		Assert.assertEquals(is_contact_us_header_available, Messages.HEADER_CONTACTUS_INFORMATION_IS_NOT_LOADED);
		Assert.assertEquals(isupdatealertdisplayed, Messages.CONTACTUS_ALERT_NOT_DISPLAYED);
		
	}

}
