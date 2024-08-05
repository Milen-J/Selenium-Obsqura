package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility 
{
	public static void selectByValue(WebElement element,String value) 
	{
		Select select =new Select(element);
		select.selectByValue(value);		
	}
	
	 public static void sendKeys(WebElement element, String value)
	 {
	        element.sendKeys(value);
	 }
	
	
	public void selectByIndex(WebElement element,int i) 
	{
		Select select =new Select(element);
		select.selectByIndex(0);		
	}
	
	public void selectByVisibleText(WebElement element,String value) 
	{
		Select select =new Select(element);
		select.selectByVisibleText(value);		
	}
	
	public void actionClick(WebDriver driver,WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.contextClick(element);
		
	}
	
	public void actionDoubleClick(WebDriver driver,WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}
	
	public static void clickElementByJS(WebDriver driver,WebElement element)
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();",element);

	}
	
	public void scrollToElement(WebDriver driver, WebElement element) 
	{
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void acceptAlert(WebDriver driver) 
	{
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	}
	
	public void dismissAlert(WebDriver driver) 
	{
	    Alert alert = driver.switchTo().alert();
	    alert.dismiss();
	}
	
	public static void clearAndSendKeys(WebElement element, String value) 
	{
        element.clear();
        element.sendKeys(value);
    }
	
	public void hoverOverElement(WebDriver driver, WebElement element) 
	{
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element).perform();
	}
	
	public void dragAndDrop(WebDriver driver,WebElement element,WebElement dropzone)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		action.doubleClick(element).build().perform();
		action.contextClick(element).build().perform();
		action.dragAndDrop(element, dropzone).build().perform();
	
	}
}