package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;
import utilities.WebElementUtilities;

public class ManagePagesPage
{
	
	WebDriver driver;
		
	public ManagePagesPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	 @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and @class='small-box-footer']")private WebElement managePageBtn;
		@FindBy(xpath="//a[@class='btn btn-rounded btn-danger' and text()=' New']")private WebElement newButtonOnMangePage;
		@FindBy(xpath = "//a[@onclick='click_button(1)']")private WebElement createNewBtn;
	    @FindBy(xpath = "//h1[text()='Add Pages']")private WebElement enterPageInformationsText;
	    @FindBy(xpath = "//input[@id='title']")private WebElement titleField;
	    @FindBy(xpath = "//div[@role='textbox']")private WebElement descField;
	    @FindBy(xpath = "//input[@id='page']")private WebElement page;
	    @FindBy(xpath = "//input[@id='main_img']")private WebElement chooseImage;
		@FindBy(xpath="//div[@id='imagePreview']")private WebElement imagePreview ;
	    @FindBy(xpath = "//button[@type='submit']")private WebElement submitBtn;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")WebElement successMessage;

	    public void clickOnManagePageBtn() 
	    {
	    	managePageBtn.click();
	    }
	    
	    public boolean isNewButtonVisible()
		{
			boolean isNewButtonAvailable=WebElementUtilities.isElementDisplayed(newButtonOnMangePage);
			return isNewButtonAvailable;
		}

	    public void clickOnCreateNewBtn() {
	    	createNewBtn.click();
	    }
	    
	    public boolean isEnterPageInformationsHeaderDisplayed()
		{
			boolean isEnterPageInformationsHeaderAvailable=WebElementUtilities.isElementDisplayed(enterPageInformationsText);
			return isEnterPageInformationsHeaderAvailable;
		}

	    public void enterTitle(String title) {
	        PageUtility.sendKeys(titleField, title);
	    }

	    public void enterDescription(String description) {
	        PageUtility.sendKeys(descField, description);
	    }

	    public void enterPage(String pageName) {
	        PageUtility.sendKeys(page, pageName);
	    }
	    
	    public void clickOnAddImage() throws AWTException
		{
				
	    	FileUploadUtility.fileUploadUsingSendKeys(chooseImage,Constants.TESTDATA_IMAGE_FOR_MANAGE_PAGE);
	    	WaitUtility.waitForElement(driver, imagePreview);
			System.out.println("Image added successfully");
		}

	    public void clickOnSubmitBtn() {
	        PageUtility.clickElementByJS(driver, submitBtn);
	    }
	    
	    public boolean isManagePageLoaded() {
	    	boolean isManagePageSuccessAlertDisplayed=WebElementUtilities.isElementDisplayed(successMessage);
	    	return isManagePageSuccessAlertDisplayed;
	    }
}