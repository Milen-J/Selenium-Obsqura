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
	@FindBy(xpath="//input[@id='username']")private WebElement usernamefield ;
	@FindBy(xpath="//input[@id='password']")private WebElement passwordfield;
	@FindBy(xpath="//select[@id='user_type']")private WebElement dropdownforusertype;
	@FindBy(xpath="//button[@name='Create']")private WebElement savebtn;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertnewuser;
	
	@FindBy(xpath="//*[@id=\"adddiv\"]/div/div/div/form/div[2]/a")private WebElement reset;
	
	public void adminMoreInfo()
	{
		adminmoreinfo.click();
	}
	
	public boolean isAdminUserPageDisplayed()
	{
		boolean is_admin_page_displayed=webelementutility.isElementDisplayed(newadminbtn);
		return is_admin_page_displayed;
		
	}
	public void newAdminButtonClick()
	{
	
		newadminbtn.click();
	}
	public boolean isSearchButtonDisplayed()
	{
		boolean is_search_button_displayed=webelementutility.isElementDisplayed(adminsearch);;
		return is_search_button_displayed;
		
	}
		
	
	public void addUsername(String username1,String password1,String usertype)

	{
		usernamefield.sendKeys(username1);
		passwordfield.sendKeys(password1);
		pageutility.selectByValue(dropdownforusertype, usertype);//new
		savebtn.click();
	}
	
	public boolean isAlertForNewAdminSuccessDisplayed()
	{
		boolean is_green_alert_displayed=webelementutility.isElementDisplayed(adminsearch);
		return is_green_alert_displayed;
	}
}
