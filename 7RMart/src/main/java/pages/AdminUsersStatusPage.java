package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WebElementUtilities;

public class AdminUsersStatusPage {
	
	WebDriver driver;
	WebElementUtilities webelementutility = new WebElementUtilities();
	PageUtility pageutility=new PageUtility();
	
	public AdminUsersStatusPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[2]/div/a")private WebElement adminmoreinfo ;
	@FindBy(xpath="//a[@class = 'btn btn-rounded btn-primary']")private WebElement adminsearch ;
	@FindBy(xpath="/html/body/div/div[1]/section/div[2]/div/div[3]/div[2]/table/tbody/tr[3]/td[5]/a[1]")private WebElement status ;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertadminstatus ;
	
	
	public void adminUserStatusMoreinfo()
	{
		adminmoreinfo.click();
	}
	
	public boolean isAdminUsersPageDisplayed()
	{
		boolean isAdminUserPageDisplaayed = WebElementUtilities.isElementDisplayed(adminsearch);
		return isAdminUserPageDisplaayed;
	}
	
	public void statusChange()
	{
		status.click();
	}
	
	public boolean isAlertStatusDisplayed()
	{
		boolean isSuccesssAlertDisplayed=WebElementUtilities.isElementDisplayed(alertadminstatus);
		return isSuccesssAlertDisplayed;
	}
	 
}
	
