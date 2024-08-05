package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WebElementUtilities;

public class MgePagesSearchAndDeletePage {
	
	WebDriver driver;
	WebElementUtilities webelementutility = new WebElementUtilities();
	public  MgePagesSearchAndDeletePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[9]/div/a")private WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement searchbutton;
	@FindBy(xpath="//input[@class='form-control']")private WebElement titlesearch;
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")private WebElement searchbutton2;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[4]")private WebElement row4;
	@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[5]/a[2]/i") private WebElement  deletebutton;
	@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr/td[5]/a[2]")private WebElement resulttablealert;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement alertdisplay;
	public void moreinfonav()
	{
		moreinfo.click();
	}	
	public boolean isListPageDisplayed()
	{
		boolean is_list_page_displayed = WebElementUtilities.isElementDisplayed(searchbutton);
		return is_list_page_displayed;
		
	}
	public void searchTitle(String titlesearchvalue)
	{
		searchbutton.click();
		titlesearch.sendKeys(titlesearchvalue);
		searchbutton2.click();
		
	}
	public void deleteTitlePage()
	{
		resulttablealert.click();
		
		driver.switchTo().alert().accept();		
	}
	public boolean isalertPageDisplayed()
	{
		boolean is_alert_page_displayed = WebElementUtilities.isElementDisplayed(alertdisplay);
		return is_alert_page_displayed;
		
		
	}
}

