package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WebElementUtilities;

public class SubCategoryPage {
	
	WebDriver driver;
	WebElementUtilities webelementutility = new WebElementUtilities();
	public SubCategoryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[7]/div/a")private WebElement subcatmoreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement subnewbtn;
	@FindBy(xpath="//select[@class='form-control selectpicker']") private WebElement categoryselect;
	@FindBy(xpath="//input[@id='subcategory']")private WebElement subcategory;
	@FindBy(xpath="//input[@id='main_img']")private WebElement subcatimage;
	@FindBy(xpath="//button[@name='create']")private WebElement subcatsave;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement subcatalert;
	
	
	
	public void moreinfo()
	{
		subcatmoreinfo.click();
	}
	public boolean isListPageDisplayed()
	{
		return subnewbtn.isDisplayed();
	}
	public void addSubCategory(String subcategoryvalue)
	{
		subnewbtn.click();
		Select select = new Select(categoryselect);
		select.selectByVisibleText("Grocery");
		subcategory.sendKeys(subcategoryvalue);
		subcatsave.click();
		
		if(subcategory.isDisplayed())
		{
			System.out.println("Item already exists.");
		}
		
	}
	public boolean isSubCategoryAletDisplayed()
	{
		return subcatalert.isDisplayed();
	}
}
