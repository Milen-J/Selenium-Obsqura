package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import basePackage.Base;
import pages.ContactUsUpdatePage;
import pages.LoginPage;

public class ContactUsUpdateTest extends Base{
@Test
public void verifyUserIsAbleToUpdateContacts()
{
	String usernamevalue ="admin";
	String passwordvalue = "admin";
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue); 
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	String phonevalue = "9638527412";
	String emailvalue="abc.12@gmail.com";
	String addressvalue = "123 asdfg Bombay";
	String deliverytimevalue="4 hrs";
	String deliverychargevalue ="100";
	
	
			
	ContactUsUpdatePage contactuspage = new ContactUsUpdatePage(driver);

	contactuspage.contactusmoreinfo();
	contactuspage.contactactionclick();
	contactuspage.contactphone(phonevalue);
	contactuspage.contactemail(emailvalue);
	contactuspage.contactaddress(addressvalue);
	contactuspage.contactdeliverytime(deliverytimevalue);
	contactuspage.contactdeliverycharge(deliverychargevalue);
	contactuspage.contactupdate();
	
	boolean isupdatealertdisplayed = contactuspage.isContactUpdateAlertDisplayed();
	assertTrue(isupdatealertdisplayed,"User unable to update contact us page.");


}

}
