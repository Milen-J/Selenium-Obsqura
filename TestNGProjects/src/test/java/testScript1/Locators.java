package testScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locatorId()
	{
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		WebElement showmessage=driver.findElement(By.id("button-one"));
		WebElement entermessage=driver.findElement(By.id("single-input-field"));
		WebElement yourmessage=driver.findElement(By.id("message-one"));
		WebElement entervalueA=driver.findElement(By.id("value-a"));
		WebElement entervalueB=driver.findElement(By.id("value-b"));
		WebElement gettotal=driver.findElement(By.id("button-two"));
		WebElement totalab=driver.findElement(By.id("message-two"));
		
	}
	public void className()
	{
		WebElement singlecheckbox=driver.findElement(By.className("form-check-input"));
		WebElement messageone=driver.findElement(By.className("my-2"));
		WebElement selectallbutton=driver.findElement(By.className("btn btn-primary"));
		WebElement togglericonhome=driver.findElement(By.className("navbar-toggler-icon"));
		
	}
	public void name()
	{	WebElement metadescription=driver.findElement(By.name("description"));
		WebElement metakeywords=driver.findElement(By.name("keywords"));
		WebElement metaauthor=driver.findElement(By.name("author"));
		
	}
	public void linkText()
	{
		WebElement simpleformdemo=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement checkboxdemo=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement radiobuttonsdemo=driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement navbarhome=driver.findElement(By.linkText("Home"));
		WebElement navbarinputform=driver.findElement(By.linkText("Input Form"));
		
	}
	public void partialLinkText()
	{
		WebElement formsubmit=driver.findElement(By.partialLinkText("Submit"));
		WebElement simpleform=driver.findElement(By.partialLinkText("Simple Form"));
		WebElement checkbox=driver.findElement(By.partialLinkText("Checkbox"));
		WebElement radiobutton=driver.findElement(By.partialLinkText("Radio buttons"));
		WebElement navigationlinkalert=driver.findElement(By.partialLinkText("Alert"));
		WebElement navigationlinklistbox=driver.findElement(By.partialLinkText("list"));
		
		
	}

	public static void main(String[] args) {
		
 Locators locators=new Locators();
 locators.initializeBrowser();
 locators.locatorId();
 locators.className();
 locators.name();
 locators.linkText();
 locators.partialLinkText();
 locators.driverQuitandClose();
	}

}
