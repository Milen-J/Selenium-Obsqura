package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WebElementUtilities;

public class SubCategoryPage 
{
	
	WebDriver driver;
	WebElementUtilities webelementutility = new WebElementUtilities();
	PageUtility pageutility = new PageUtility();
	
	public SubCategoryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[7]/div/a")private WebElement subcategory;
	@FindBy(xpath="//h1[text()='List Sub Categories']")private WebElement subcategoryheading;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbutton;
	@FindBy(xpath="//h1[text()='Add Sub Category']")private WebElement titleaddsubcategory;
	@FindBy(xpath="//select[@class='form-control selectpicker']")private WebElement categorydropdown;
	@FindBy(xpath="//input[@name='subcategory']")private WebElement subcategorytextfield;
	@FindBy(xpath="//button[@name='create']")private WebElement savebutton;
		
	public void clickOnManageCategory()
	{
		subcategory.click();
		
	}
	
	public boolean isHeaderListSubCategoriesVisible()
	{
		boolean isheaderlistsubcategoriesavailable=webelementutility.isElementDisplayed(subcategoryheading);
		return isheaderlistsubcategoriesavailable;
	}
	
	public void clickOnNewInListSubCategory()
	{
		newbutton.click();
	}

	public boolean isHeaderAddSubCategoryVisible()
	{
		boolean isheaderaddsubcategoryavailable=webelementutility.isElementDisplayed(titleaddsubcategory);
		return isheaderaddsubcategoryavailable;
	}
	
	public void enterDataInAddSubcategoryWindow(String categorydropdownvalue,String subcategorytextfieldvalue)
	{
		pageutility.selectByValue(categorydropdown, categorydropdownvalue);
		subcategorytextfield.sendKeys(subcategorytextfieldvalue);
	}
	
	public void clickOnSaveButton()
	{
		savebutton.click();
	
	}


	}