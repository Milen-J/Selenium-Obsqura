package testScript2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript1.Base;

public class FileUpload extends Base {
	/*public void sendKeys()
	{
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement pdf=driver.findElement(By.xpath("//input[@id='file-upload']"));
		//pdf.click();
		pdf.sendKeys("C:\\Users\\karthi\\Downloads\\6b199c13-3f1f-4261-ae46-b5a5411fc53b.pdf");
		WebElement upload=driver.findElement(By.xpath("//input[@id='file-submit']"));
		upload.click();
		
	}*/
	
	public void robotClass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement file=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		file.click();
		StringSelection s = new StringSelection("C:\\Users\\karthi\\Downloads\\6b199c13-3f1f-4261-ae46-b5a5411fc53b.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);//toolkit is a class and getdefaulttoolkit is a method
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

	public static void main(String[] args) {
		
		FileUpload fileupload=new FileUpload();
		fileupload.initializeBrowser();
		//fileupload.sendKeys();
		try {
            fileupload.robotClass();
        } catch (AWTException e) {
            e.printStackTrace();
            System.out.println("AWTException");
        }
		//fileupload.driverQuitandClose();

	}

}