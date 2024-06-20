package testScript3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SendkeysAndRobot extends Base
{
	@Test
	public void fileupload()
	{
	driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement browsebutton=driver.findElement(By.xpath("//input[@id='input-4']"));
	browsebutton.sendKeys("D:\\Milen-2023.pdf");
	js.executeScript("arguments[0].click();",browsebutton);	
	}
	@Test
	public void fileupload2() throws AWTException
	{
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		
		WebElement browsebutton=driver.findElement(By.xpath("//*[@id=\"input-4\"]"));
		
		StringSelection s = new StringSelection("D:\\Milen-2023.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		
		Robot r = new Robot();
		r.delay(250);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
	  	r.keyPress(KeyEvent.VK_V);
	  	r.keyRelease(KeyEvent.VK_V);

	  	r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	   
		System.out.println("button is clicked");
	}
}
