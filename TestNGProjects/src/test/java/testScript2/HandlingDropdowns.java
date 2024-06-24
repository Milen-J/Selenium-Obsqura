package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testScript1.Base;

public class HandlingDropdowns extends Base{
	public void dropDowns()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement textfields=driver.findElement(By.cssSelector("select#single-input-field"));
		Select select=new Select(textfields);
		select.selectByVisibleText("Red");
		//select.selectByIndex(3);
		//select.selectByValue("Yellow");
		
	}
	
	public static void main(String[] args) {
		
		HandlingDropdowns handlingdropdowns=new HandlingDropdowns();
		handlingdropdowns.initializeBrowser();
		handlingdropdowns.dropDowns();
	}
}