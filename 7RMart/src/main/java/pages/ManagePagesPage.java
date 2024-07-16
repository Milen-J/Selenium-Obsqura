package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.WaitUtility;

public class ManagePagesPage {
	
	
	WebDriver driver;
	public ManagePagesPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[1]/div/a")private WebElement moreinfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement newbtn;
	@FindBy(xpath="//input[@name='title']")private WebElement title;
	@FindBy(xpath="//div[@class='note-editable card-block']")private WebElement description;
	@FindBy(xpath="//input[@id='page']")private WebElement pagename;
	@FindBy(xpath="//input[@id='main_img']")private WebElement imagebtn;
	@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement savebutton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alertbox;
	//@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement redalertbox;
	
	public void moreinfonav()
	{
		moreinfo.click();
	}	
	public boolean isListPageDisplayed()
	{
		return newbtn.isDisplayed();
		
	}
	public void newbutton()
	{
		newbtn.click();
	}
	public void enterTitleField(String titlevalue)
	{
		
		title.sendKeys(titlevalue);
	}

	public void enterDescriptionField(String descriptionvalue)
	{
		description.sendKeys(descriptionvalue);
	}
	public void enterPageNameField(String pagenamevalue)
	{
		pagename.sendKeys(pagenamevalue);
	}
	public void imageUpload()
	{
		imagebtn.click();
		imagebtn.sendKeys("C:\\Users\\lenovo\\OneDrive\\Desktop\\butterfly.jpeg");
		//FileUploadUtility.fileUploadUsingRobotClass(imagebtn,Constants.TESTDATAFILEIMAGEMANAGEPAGEADD);
	}
	public void clicksaveButton()
	{
		WaitUtility waitutility = new WaitUtility();
		waitutility.waitForElementToBeClickable(driver,savebutton);
		savebutton.click();
		driver.navigate().back();
	}
	
	/*public boolean isAlertBoxDisplayed()
	{
		return alertbox.isDisplayed();			
		
	}*/

}
