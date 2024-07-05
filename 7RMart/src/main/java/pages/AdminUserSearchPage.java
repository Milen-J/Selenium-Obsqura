package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserSearchPage {
	
	WebDriver driver;
	public AdminUserSearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[2]/div/a")private WebElement adminmoreinfo ;
	@FindBy(xpath="//a[@class = 'btn btn-rounded btn-primary']")private WebElement adminsearch ;
	@FindBy(xpath="//*[@id=\"un\"]")private WebElement searchusername;
	@FindBy(xpath="//select[@name='ut']")private WebElement usertype;
	@FindBy(xpath="//button[@name='Search']")private WebElement searchbtn ;
	@FindBy(xpath="//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[3]/a")private WebElement resetsearch;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[1]")private WebElement result ;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[2]") private WebElement resultusertype;
	
	
	public void adminUserMoreInfo()
	{
		adminmoreinfo.click();
	}
	
	public boolean isadminUsersPageDisplayed()
	{
		return adminsearch.isDisplayed();
	}
	
	public void searchClick(String searchusernamevalue) 
	{
		adminsearch.click();
		searchusername.click();
		searchusername.sendKeys(searchusernamevalue);
		
		Select select = new Select(usertype);
		select.selectByIndex(1);
		
		searchbtn.click();
		
		if(!searchusername.equals(result) && usertype.equals(resultusertype))
		{
			System.out.println("Not found");
		
			//resetsearch.click();
		}
		
	}
	
	
	
	
}
