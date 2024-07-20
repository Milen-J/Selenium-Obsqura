package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WebElementUtilities;

public class AdminUsersAddNewUserPage {
	
	WebDriver driver;
	
	WebElementUtilities webelementutility = new WebElementUtilities();
	PageUtility pageutility=new PageUtility();
	
	public AdminUsersAddNewUserPage(WebDriver driver)
	{
		
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[2]/div/a/i")private WebElement adminmoreinfo ;
	@FindBy(xpath="//a[@class = 'btn btn-rounded btn-primary']")private WebElement adminsearch ;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")private WebElement newadminbtn;
	@FindBy(xpath="//input[@id='username']")private WebElement username ;
	@FindBy(xpath="//input[@id='password']")private WebElement password ;
	@FindBy(xpath="//select[@id='user_type']")private WebElement usertype;
	@FindBy(xpath="//button[@name='Create']")private WebElement savebtn;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertnewuser;
	
	@FindBy(xpath="//*[@id=\"adddiv\"]/div/div/div/form/div[2]/a")private WebElement reset;
	
	public void adminMoreInfo()
	{
		adminmoreinfo.click();
		webelementutility.isElementDisplayed(newadminbtn);
		newadminbtn.click();
		webelementutility.isElementDisplayed(adminsearch);
	}
	
	public void addUsername(String adminusernamevalue,String adminpasswordvalue,String usertype1)

	{
		username.sendKeys(adminusernamevalue);
		password.sendKeys(adminpasswordvalue);
		pageutility.selectByValue(usertype, usertype1);
		savebtn.click();
	}
	public void isAlertForNewAdminSuccessDisplayed()
	{
		boolean isgreenalertdisplayed = webelementutility.isElementDisplayed(alertnewuser);
	}
}
