package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility 
{
	public void selectByValue(WebElement element,String value)
	{
	Select select =new Select(element);//no need to create object each time for eachtestcases-for action class,alert and all
	select.selectByIndex(1);
		
	}
//(int index) ,call in page
	public void actionClick(WebDriver driver,WebElement element)
	{
		Actions action = new Actions(driver);
		//actions.contextClick(element);
	}
}
