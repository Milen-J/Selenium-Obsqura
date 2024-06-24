package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testScript1.Base;

public class ActionClass extends Base{
	public void actionClass()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dropzone=driver.findElement(By.id("mydropzone"));
		Actions action=new Actions(driver);
		action.moveToElement(drag1).build().perform();
		action.doubleClick(drag1).build().perform();
		action.contextClick(drag1).build().perform();//right click
		action.dragAndDrop(drag1, dropzone).build().perform();
	}

	public static void main(String[] args) {
		ActionClass actionclass=new ActionClass();
		actionclass.initializeBrowser();
		actionclass.actionClass();
		//actionclass.driverQuitandClose();
	}

}