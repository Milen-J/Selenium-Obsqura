package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WebElementUtilities;


	public class AdminUserSearchPage
	{
		  WebDriver driver;
		  WebElementUtilities webelementutility = new WebElementUtilities();
		  PageUtility pageutility=new PageUtility();

		  public AdminUserSearchPage(WebDriver driver) {
		  this.driver = driver;
		  PageFactory.initElements(driver, this);
	}
		  

		@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")private WebElement adminUsersBtn;
		@FindBy(xpath="//h4[text()='Search Admin Users']")private WebElement adminUsersHeader ;
		@FindBy(xpath = "//a[@onclick='click_button(2)']")private WebElement searchBtn;
		@FindBy(xpath = "//input[@id='un']")private WebElement userNameField;
		@FindBy(xpath = "//select[@id='ut']")private WebElement userTypeDropdown;
		@FindBy(xpath = "//button[@value='sr']")private WebElement findUserBtn;

		public void clickOnAdminUsersBtn() 
		{
			adminUsersBtn.click();	
		}
		    
		public boolean isAdminUserHeaderDisplayed()
		{
			boolean isAdminUserHeaderAvailable=WebElementUtilities.isElementDisplayed(adminUsersHeader);
			return isAdminUserHeaderAvailable;
		}

		public void clickOnSearchBtn()
		{
		   	searchBtn.click();	   
		}

		public void enterUserName(String userName) 
		{
		    PageUtility.clearAndSendKeys(userNameField, userName);
		}

		public void selectUserType(String userType)
		{
		    PageUtility.selectByValue(userTypeDropdown, userType);

		}

		public void clickOnFindUserBtn()
		{
		    	findUserBtn.click();	
		}
		  
		
			
	}
	
	
	
	

