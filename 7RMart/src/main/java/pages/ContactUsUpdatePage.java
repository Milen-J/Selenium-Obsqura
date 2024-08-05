package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WebElementUtilities;

public class ContactUsUpdatePage
{
	WebDriver driver;
	WebElementUtilities webelementutility = new WebElementUtilities();
	PageUtility pageutility=new PageUtility();
	
	public ContactUsUpdatePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[10]/div/a/i")private WebElement moreinfoContact;
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[2]/div[2]/table/tbody/tr/td[6]/a/i")private WebElement actioncontact;
	@FindBy(xpath="//input[@name=\"phone\"]")private WebElement actionphone;
	@FindBy(xpath="//input[@name=\"email\"]")private WebElement actionemail;
	@FindBy(xpath="//textarea[@name=\"address\"]")private WebElement actionaddress;
	@FindBy(xpath="//textarea[@name=\"del_time\"]")private WebElement actiondeliverytime;
	@FindBy(xpath="//input[@name=\"del_limit\"]")private WebElement actiondeliverycharge;
	@FindBy(xpath="//button[@name='Update']")private WebElement actionupdate;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement contactusalert;
	@FindBy(xpath="//a[text()='Reset']")private WebElement contactusreset;
	
	public void contactusmoreinfo()
	{
		moreinfoContact.click();
	}
	
	public boolean isContactUsPageDisplayed()
	{
		boolean iscontactuspagedisplayed=WebElementUtilities.isElementDisplayed(actioncontact);
		return iscontactuspagedisplayed;
	}
		
	public void contactactionclick()
	{
		actioncontact.click();
		
	}
	
	public void enterPhoneNumber(String phoneNumber) {
        PageUtility.clearAndSendKeys(actionphone, phoneNumber);

    }

    public void enterEmail(String email) {
        PageUtility.clearAndSendKeys(actionemail, email);

    }
    
    public void enterAddress(String address) {
        PageUtility.clearAndSendKeys(actionaddress, address);

    }
    
    public void enterDeliveryTime(String deliveryTime) {
        PageUtility.clearAndSendKeys(actiondeliverytime, deliveryTime);

    }

    public void enterDeliveryLimit(String deliveryLimit) {
        PageUtility.clearAndSendKeys(actiondeliverycharge, deliveryLimit);

    }

    public void clickOnSubmitButton() {
        PageUtility.clickElementByJS( driver, actionupdate);
    }

	public boolean isContactUpdateAlertDisplayed()
	{
		boolean iscontactupdatealertdisplayed=WebElementUtilities.isElementDisplayed(contactusalert);
		return 	iscontactupdatealertdisplayed;
	}
}
