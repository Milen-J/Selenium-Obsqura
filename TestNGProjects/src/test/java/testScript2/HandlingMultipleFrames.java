package testScript2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript1.Base;

public class HandlingMultipleFrames extends Base {
	public void MultipleFrames()
	{
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement likeusbutton=driver.findElement(By.xpath("//a[@href='https://www.facebook.com/obsqurazone/']"));
		likeusbutton.click();
		String mainwindow=driver.getWindowHandle();//parent window
		Set<String> windows=driver.getWindowHandles();//both parent and child windows
		Iterator<String> itr=windows.iterator();
		while(itr.hasNext())
		{
			String childwindow=itr.next();
			if(!mainwindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
			}
		}
	}

	public static void main(String[] args) {
		HandlingMultipleFrames handlingmultipleframes=new HandlingMultipleFrames();
		handlingmultipleframes.initializeBrowser();
		handlingmultipleframes.MultipleFrames();
		

	}

}