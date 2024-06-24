package testScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment1 extends Base{
	
public void singleInputField()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement inputfield1=driver.findElement(By.id("single-input-field"));
	inputfield1.sendKeys("hello everyone");
	WebElement button1=driver.findElement(By.id("button-one"));
	button1.click();
	
}
public void twoInputFields()
{
	WebElement inputfield2=driver.findElement(By.id("value-a"));
	inputfield2.sendKeys("15");
	WebElement inputfield3=driver.findElement(By.id("value-b"));
	inputfield3.sendKeys("25");
    WebElement button2=driver.findElement(By.id("button-two"));
	button2.click();
  
}
public static void main(String[] args) {

Assignment1 assign1=new Assignment1();
assign1.initializeBrowser();
assign1.singleInputField();
assign1.twoInputFields();
//assign1.driverQuitandClose();

	}

}