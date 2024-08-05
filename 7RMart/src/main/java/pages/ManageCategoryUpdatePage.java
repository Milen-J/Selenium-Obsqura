package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.RandomDataUtility;
import utilities.WaitUtility;
import utilities.WebElementUtilities;

public class ManageCategoryUpdatePage 
{
	
	WebDriver driver;
	WebElementUtilities webelementutility = new WebElementUtilities();
	PageUtility pageutility=new PageUtility();
	WaitUtility waitutility=new WaitUtility();
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	
	public ManageCategoryUpdatePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[5]/div/a/i")private WebElement managecategory ;
	@FindBy(xpath="//h1[@class='m-0 text-dark']")private WebElement headerlistcategories ;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/category/edit?edit=285&page_ad=1']")private WebElement actionclick ;
	@FindBy(xpath="//h1[@class='m-0 text-dark']")private WebElement headereditcategory ;
	@FindBy(xpath="//input[@value='Television']")private WebElement categoryfield ;
	@FindBy(xpath="//li[@id='134-selection']")private WebElement selectgroupsitem ;
	@FindBy(xpath="//input[@type='file']")private WebElement choosefilebutton ;	@FindBy(xpath="//*[@id=\"main_img\"]'")private WebElement image;
	@FindBy(xpath="//*[@id=\"form\"]/div/div[4]/div[1]/label[2]/input")private WebElement topmenuradiobtnyes ;
	@FindBy(xpath="//*[@id=\"form\"]/div/div[4]/div[1]/label[3]/input")private WebElement topmenuradiobtnno;
	@FindBy(xpath="//*[@id=\"form\"]/div/div[4]/div[2]/label[2]/input")private WebElement leftmenuradiobtnyes;
	@FindBy(xpath="//*[@id=\"form\"]/div/div[4]/div[2]/label[3]")private WebElement leftmenuradiobtnno;
	
	@FindBy(xpath="//button[@name='update']")private WebElement updatebtn ;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement greenalert;
	
	
	public void mgeCategory() 
	{
		managecategory.click();
	}
	
	public boolean isHeaderListCategoriesVisible()
	{
		boolean is_header_list_categories_available=webelementutility.isElementDisplayed(headerlistcategories);
		return is_header_list_categories_available;
	}
	
	public void clickOnAction()
	{
		actionclick.click();
	}
	
	public boolean isHeaderEditCategoryVisible()
	{
		boolean is_header_edit_category_available=webelementutility.isElementDisplayed(headereditcategory);
		return is_header_edit_category_available;
	}
	
	public void enterCategoryInformation(String category) 
	{	
		categoryfield.clear();
		String categoryfieldvalue=RandomDataUtility.getProductSubCategory();
		categoryfield.sendKeys(categoryfieldvalue);
		System.out.println("category set");
		
		waitutility.waitForElementToBeClickable(driver, selectgroupsitem);
		pageutility.actionClick(driver,selectgroupsitem);
		System.out.println("selectgroupsitem performed successfully");
		
		waitutility.waitForElementToBeClickable(driver, choosefilebutton);
		pageutility.actionClick(driver, choosefilebutton);
		
		fileuploadutility.fileUploadUsingSendKeys(choosefilebutton, Constants.TESTDATAFILEIMAGEMANAGEPAGEADD);			
		waitutility.waitForElement(driver,image);
		
		if (webelementutility.isElementSelected(topmenuradiobtnyes))
		{
			System.out.println("Show on Top Menu Yes is already selected.");
			pageutility.clickElementByJS(driver, topmenuradiobtnno);
			System.out.println("NO is selected");
		}
		else 
		{
			pageutility.clickElementByJS(driver, topmenuradiobtnyes);
		}
			
		if(webelementutility.isElementSelected(leftmenuradiobtnyes))
		{
			System.out.println("YES is already selected");
			pageutility.clickElementByJS(driver, leftmenuradiobtnno);
		}
		else
		{
			pageutility.clickElementByJS(driver, leftmenuradiobtnyes);
			
		}
		
	}
	
	public void clickOnUpdateButton()
	{
		pageutility.clickElementByJS(driver, leftmenuradiobtnno);
	}
}