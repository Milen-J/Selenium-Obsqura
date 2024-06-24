package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript1.Base;

public class CheckBox extends Base {
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox1=driver.findElement(By.cssSelector("input#gridCheck"));
		checkbox1.click();
		
	
//	public void deselect()
	//{driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		//WebElement checkbox1=driver.findElement(By.cssSelector("input#gridCheck"));
		if(!checkbox1.isSelected()) {
			checkbox1.click();
		System.out.println("check box is selected");
		}
		else
		{
			checkbox1.click();
		System.out.println("check box is deselected");
	
		}
	}

	public static void main(String[] args) {
		
		CheckBox checkbox=new CheckBox();
		checkbox.initializeBrowser();
		checkbox.checkBox();
		//checkbox.deselect();
		//checkbox.driverQuitandClose();
	

	}

}