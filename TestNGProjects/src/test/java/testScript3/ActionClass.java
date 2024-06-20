package testScript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ActionClass extends Base{
	@Test
	public void link()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement link=driver.findElement(By.xpath("//a[@href='http://www.artoftesting.com/sampleSiteForSelenium.html']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",link);
		
	}
	public void submitButton()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement submitbutton=driver.findElement(By.xpath("//button[@id='idOfButton']"));
		submitbutton.click();
	}
	@Test
	public void buttonDoubleClick()
	{
	driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
	WebElement button=driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
	Actions action=new Actions(driver);
	action.doubleClick(button).build().perform();
	driver.switchTo().alert().accept();
	}
	@Test
	public void radioButton()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement male=driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='female']"));
		if(!male.isSelected())
		{
			male.click();
			System.out.println("Male selected");
		}
		if(male.isSelected())
		{
			female.click();
			System.out.println("Female selected");
		}
		@Test
		public void checkBox()
		{
			driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
			WebElement autoTesting=driver.findElement(By.xpath("//input[@value='Automation']"));
			WebElement performTesting=driver.findElement(By.xpath("//input[@value='Performance']"));
			if(autoTesting.isEnabled())
			{
				if(!autoTesting.isSelected())
				{
					autoTesting.click();
				}
				if(autoTesting.isSelected())
				{
					performTesting.click();
					autoTesting.click();
				}
				
				
			}
			else
			{
				System.out.println("Not enabled");
			}
		}
		
	}
	@Test
	public void dropDown()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		Select select=new Select(dropdown);
		select.selectByIndex(3);
	}
	@Test
	public void alertBox()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement alert=driver.findElement(By.xpath("//button[@onclick='generateAlertBox()']"));
		alert.click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void confirmBox()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement confirm=driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']"));
		confirm.click();
		driver.switchTo().alert().dismiss();
		System.out.println("Cancelled");
	}
	@Test
	public void dragAndDrop()
	{
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement image=driver.findElement(By.xpath("//img[@src='https://artoftesting.com/wp-content/uploads/2019/12/drag-and-drop-demo.jpg']"));
		WebElement targetzone=driver.findElement(By.xpath("//div[@id='targetDiv']"));
		Actions action=new Actions(driver);
		action.moveToElement(image).build().perform();
		action.doubleClick(image).build().perform();
		action.dragAndDrop(image, targetzone).build().perform();
	}

}
