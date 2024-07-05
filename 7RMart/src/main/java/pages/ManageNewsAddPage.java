package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsAddPage {
	
	WebDriver driver;
	
	public ManageNewsAddPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[11]/div/a")private WebElement moreinfonews;
	//@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[2]")private WebElement newssearch ;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newnewsbtn;
	@FindBy(xpath="//textarea[@id='news']")private WebElement newstext;
	@FindBy(xpath="//button[@name='create']")private WebElement savenews;
	@FindBy(xpath="//a[@class='btn btn-default btn-fix']")private WebElement cancelnews ;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertnewssuccess ;
	@FindBy(xpath="/html/body/div/nav/ul[1]/li/a")private WebElement dashboardmenu;
	@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[4]/ul[4]/li/a/p")private WebElement mgenewsback;
	
	public void newsMoreInfo()
	{
		moreinfonews.click();
	}

	public boolean isNewsPageDisplayed()
	{
		return newnewsbtn.isDisplayed();
	}
	public void addNews()
	{
		newnewsbtn.click();
		newstext.click();
		newstext.sendKeys("Project finally started");
		savenews.click();
	}
	/*public void backToNews()
	{
		
		dashboardmenu.click();
		mgenewsback.click();
		
		
	}*/
	public boolean newsAlertSuccess()
	{
		return alertnewssuccess.isDisplayed();
	}
	
	
	
	
	
	
}
