package testScript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutor extends Base {
@Test
public void enterMessage()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	JavascriptExecutor js =(JavascriptExecutor) driver;
	WebElement entermessage =driver.findElement(By.xpath("//input[@id='single-input-field']"));
	entermessage.sendKeys("Hi");
	WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
	js.executeScript("arguments[0].click();",showmessage);
}
@Test
public void getTotal()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	JavascriptExecutor js =(JavascriptExecutor) driver;
	WebElement ValueA =driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement ValueB = driver.findElement(By.xpath("//input[@id='value-b']"));
	ValueA.sendKeys("100");
	ValueB.sendKeys("150");
	WebElement GetTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
	js.executeScript("arguments[0].click();",GetTotal);

	
}

}
