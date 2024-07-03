package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsUpdatePage {
	WebDriver driver;
	
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
	public boolean iscontactuspagedisplayed()
	{
		return actioncontact.isDisplayed();
	}
	public void contactactionclick()
	{
		actioncontact.click();
		
	}
	public void contactphone(String phonevalue)
	{
		 actionphone.click();
		 actionphone.clear();
		 actionphone.sendKeys(phonevalue);
	}
	public void contactemail(String phonevalue)
	{
		 actionemail.click();
		 actionemail.clear();
		 actionemail.sendKeys(phonevalue);
	}
	public void contactaddress(String addressvalue)
	{
		actionaddress.click();
		actionaddress.clear();
		actionaddress.sendKeys(addressvalue);
	}
	public void contactdeliverytime(String deliveryvalue)
	{
		actiondeliverytime.click();
		actiondeliverytime.clear();
		actiondeliverytime.sendKeys(deliveryvalue);
	}
	public void contactdeliverycharge(String deliverychargevalue)
	{
		actiondeliverycharge.click();
		actiondeliverycharge.clear();
		actiondeliverycharge.sendKeys(deliverychargevalue);
	}
	public void contactupdate()
	{
		actionupdate.click();
	}
	public boolean isContactUpdateAlertDisplayed()
	{
		return contactusalert.isDisplayed();
	}
}
