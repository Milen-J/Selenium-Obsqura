package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WebElementUtilities;

public class ManageCategoryUpdatePage {
	
	WebDriver driver;
	WebElementUtilities webelementutility = new WebElementUtilities();
	public ManageCategoryUpdatePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[5]/div/a")private WebElement categorymoreinfo ;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newbtn;
	@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr[2]/td[4]/a[1]/i")private WebElement actionclick ;
	@FindBy(xpath="//input[@value='Cars100']")private WebElement categoryinput;
	@FindBy(xpath="//*[@id=\"ms-grp_id\"]/div[1]/ul")private WebElement select1 ;
	@FindBy(xpath="//li[@id='134-selectable']")private WebElement discount2;
	@FindBy(xpath="//*[@id=\"ms-grp_id\"]/div[2]/ul")private WebElement select2;
	@FindBy(xpath="//*[@id=\"main_img\"]'")private WebElement image;
	@FindBy(xpath="//*[@id=\"form\"]/div/div[4]/div[1]/label[2]/input")private WebElement topmenuradiobtnyes ;
	@FindBy(xpath="//*[@id=\"form\"]/div/div[4]/div[1]/label[3]/input")private WebElement topmenuradiobtnno;
	@FindBy(xpath="//*[@id=\"form\"]/div/div[4]/div[2]/label[2]/input")private WebElement leftmenuradiobtnyes;
	@FindBy(xpath="//*[@id=\"form\"]/div/div[4]/div[2]/label[3]")private WebElement leftmenuradiobtnno;
	
	@FindBy(xpath="//button[@name='update']")private WebElement updatebtn ;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement greenalert;
	
	
	public void mgeCategory() 
	{
		categorymoreinfo.click();
	}
	public boolean isCategoryPageDisplayed()
	{
		return newbtn.isDisplayed();
	}
	public void clickOnAction()
	{
		actionclick.click();
	}
	public void enterDetails(String categoryvalue)
	{
		categoryinput.click();
		categoryinput.clear();
		categoryinput.sendKeys(categoryvalue);
	}
	public void dragAndDropGroups()
	{
		Actions action=new Actions(driver);
		action.moveToElement(select1).build().perform();
		String s = select1.getText();

		if(select1.equals(s))
		{
			
		discount2.click();
		}
		if(select2.equals(s))
		{
			discount2.click();
		}
				
	}
	public void imageUpload()
	{
		image.sendKeys("//input[@name='main_img']");
	}
	public void topMenuRadiobtn()
	{
		if(topmenuradiobtnyes.isSelected())
		{
			topmenuradiobtnno.click();
		}
	}
	public void leftMenuRadioBtn()
	{
		if(leftmenuradiobtnyes.isSelected())
		{
			leftmenuradiobtnno.click();
		}
		else
		{
			leftmenuradiobtnyes.click();
		}
	}
	public void updateBtn()
	{
		
		updatebtn.click();
	}
	public boolean greenalertDisplayed()
	{
		return greenalert.isDisplayed();
	}
}

