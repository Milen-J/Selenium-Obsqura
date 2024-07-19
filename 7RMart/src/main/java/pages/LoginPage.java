package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WebElementUtilities;

public class LoginPage {
	
	WebDriver driver;
	
	WebElementUtilities webelementutility = new WebElementUtilities();
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']")private WebElement username;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//button[text()='Sign In']")private WebElement signIn;
	@FindBy(xpath="//p[text()='Dashboard']")private WebElement dashboardvalue;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement redalert;
	
	
	public void enterUserNameOnUserNameField(String usernamevalue)
	{
		username.sendKeys(usernamevalue);
	}

	public void enterPasswordOnPasswordField(String passwordvalue)
	{
		password.sendKeys(passwordvalue);
	}
	public void clickOnSignInButton()
	{
		signIn.click();
	}
	
	
	public boolean isHomePageLoaded()
	{
		boolean ishomepagedisplayed = webelementutility.isElementDisplayed(dashboardvalue);//calling isdisplayed
		return ishomepagedisplayed; 
		
	}
	/*public boolean isRedAlertDisplayed()
	{
		boolean isredalertdisplayed = webelementutility.isElementDisplayed(redalert);
		return redalert.isDisplayed();
	}*/
}

