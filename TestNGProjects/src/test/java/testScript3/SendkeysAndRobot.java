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
	browsebutton.sendKeys("D:\\PCC.pdf)");
	js.executeScript("arguments[0].click();",browsebutton);	
	}
	@Test
	
	public void fileUpload2() throws AWTException
	{
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		
		WebElement doc1=driver.findElement(By.xpath("//input[@name='input4[]']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		StringSelection s = new StringSelection("C:\\Users\\lenovo\\Desktop\\PCC.pdf");
		js.executeScript("arguments[0].click();",doc1);
		
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		System.out.println("File");
		
	
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot r = new Robot();
		
		r.delay(250);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}
}
