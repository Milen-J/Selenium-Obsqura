package testScript1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment2 extends Base {
	public void textFields()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 List<WebElement> textfieldsList = driver.findElements(By.cssSelector("input#single-input-field"));
	        
	        // Loop through each element and send keys "hello"
	        for (WebElement textfields : textfieldsList) {
	            textfields.sendKeys("hello");
	        }
	}

	public static void main(String[] args) {
		
Assignment2 assignment2=new Assignment2();
assignment2.initializeBrowser();
assignment2.textFields();
//assignment2.driverQuitandClose();
	}

}