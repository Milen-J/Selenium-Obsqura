package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersAddPage {
	
	WebDriver driver;
	
	public AdminUsersAddPage(WebDriver driver)
	{
		
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[2]/div/a")private WebElement adminmoreinfo ;
	@FindBy(xpath="//a[@class = 'btn btn-rounded btn-primary']")private WebElement adminsearch ;
	@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")private WebElement newadminbtn;
	@FindBy(xpath="//input[@id='username']")private WebElement username ;
	@FindBy(xpath="//input[@id='password']")private WebElement password ;
	@FindBy(xpath="//select[@id='user_type']")private WebElement usertype;
	@FindBy(xpath="//button[@name='Create']")private WebElement savebtn;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertnewuser;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement redalert;
	@FindBy(xpath="//*[@id=\"adddiv\"]/div/div/div/form/div[2]/a")private WebElement reset;
	
	public void adminMoreInfo()
	{
		adminmoreinfo.click();
	}
	
	public boolean isAdminPageDisplayed()
	{
		return adminsearch.isDisplayed();
	}
	
	public void addNewUser()
	
	{
		newadminbtn.click();
		
	}
	
	public boolean isNewAdminPageDisplayed()
	{
		return newadminbtn.isDisplayed();
	}
	
	public void addUsername(String adminusernamevalue,String adminpasswordvalue)

	{
		username.sendKeys(adminusernamevalue);
		password.sendKeys(adminpasswordvalue);
		Select select = new Select(usertype);
		select.selectByValue("staff");
		
		savebtn.click();
		if(redalert.isDisplayed())
		{
			reset.click();
			newadminbtn.click();
			
		}
	}
	public boolean isAlertForNewAdminSuccessDisplayed()
	{
		return alertnewuser.isDisplayed();
	}

}
