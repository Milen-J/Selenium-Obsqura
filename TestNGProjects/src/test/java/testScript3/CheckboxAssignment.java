package testScript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckboxAssignment extends Base {
	@Test
	public void checkBox()
	{
		driver.navigate().to("https://total-qa.com/checkbox-example/");
		WebElement seleniumbox = driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if(!seleniumbox.isSelected())
		{
			js.executeScript("arguments[0].click();",seleniumbox);
			System.out.println("Selected");
			
		}
	}
	
	@Test
	public void deSelectSeleniumBox()
	{
		driver.navigate().to("https://total-qa.com/checkbox-example/");
		WebElement seleniumbox = driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if(seleniumbox.isSelected())
		{
			js.executeScript("arguments[0].click();",seleniumbox);
			System.out.println("Deselected");
			
		}
	}
	
	

}
