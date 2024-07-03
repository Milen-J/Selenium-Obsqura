package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MgePagesListDelete {
	
	WebDriver driver;
	public MgePagesListDelete(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[1]/div/a")private WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchbutton;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]")private WebElement rowselect;
	@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr[3]/td[5]/a[4]")private WebElement alert;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertdisplay;
	@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[5]/a[2]")private WebElement trash;
	public void moreinfo()
	{
		moreinfo.click();
	}	
	public boolean isListPageDisplayed()
	{
		return searchbutton.isDisplayed();
		
	}
	public void deletePage()
	{
		rowselect.click();
		trash.click();
		driver.switchTo().alert().accept();
	}
	public boolean isAlertForDeletionDisplayed()
	{
		return alertdisplay.isDisplayed();
	}
	
}
