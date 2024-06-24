package testScript1;

import org.openqa.selenium.By;

public class XPath extends Base{
	
	public void basicXpath()
	{
	//xpath  //tag[@attribute='value']
	driver.findElement(By.xpath("//button[@type='button']"));
	driver.findElement(By.xpath("//input[@id='validationCustom05']"));
	driver.findElement(By.xpath("//label[@for='invalidCheck']"));
	
	}
	public void contains()
{
	//driver.findElement(By.xpath("//div[contains(@id,'-one')]"));//this line of code will return the first <div> element that has an id attribute 
	//containing the substring "-one".
	//If there are multiple matching elements, it will return the first one encountered in the HTML document
	driver.findElement(By.xpath("//div[contains(@id,'-one')]"));
	driver.findElement(By.xpath("//input[contains(@id,'Custom02')"));
	driver.findElement(By.xpath("//button[contains(@type,'sub')]')"));
	driver.findElement(By.xpath("//label[contains(@for,'Radio21')]"));
	driver.findElement(By.xpath("//select[contains(@id,'single-input')]"));
	
	
}
public void startsWith()
//For example, an element might have an ID attribute like "element-123", where "123" is dynamically generated. 
//You can use starts-with() to locate elements based on the static part of the ID.

//Prefix-based Selection: If elements on a page have similar attributes with varying prefixes, 
//you can use starts-with() to select them based on the common prefix.
/// Example: Find all anchor elements with IDs starting with "nav-"
//example:- driver.findElements(By.xpath("//a[starts-with(@id,'nav-')]"));
{
	//driver.findElement(By.xpath("//button[starts-with(@attribute,'value')]"));
	
	driver.findElement(By.xpath("//a[starts-with(@id,'ot')]"));
	driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
	driver.findElement(By.xpath("//div[starts-with(@id,'message-t')]"));
	driver.findElement(By.xpath("//div[starts-with(@id,'collapsible')]"));
	driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]"));
	
}
public void text()
{
	//driver.findElement(By.xpath("//tag[text()='text']"));
	
	driver.findElement(By.xpath("//button[text()='Submit form']"));
	driver.findElement(By.xpath("//label[text()='Enter Message']"));
	driver.findElement(By.xpath("//div[text()='Your Message : ']"));
	driver.findElement(By.xpath("//button[text()='Get Total']"));
	driver.findElement(By.xpath("//button[text()='Get First Selected']"));
	
	
}
public void and()
{
	// driver.findElement(By.xpath("//tag[@attribute='value' and @attribute='value']"));
	
	driver.findElement(By.xpath("//button[@type='button'and@id='button-all']"));
	driver.findElement(By.xpath("//button[@type='button'and@id='button-first']"));
	driver.findElement(By.xpath("//input[@class='form-control'and@id='single-input-field']"));
	driver.findElement(By.xpath("//div[@class='my-2'and@id='message-one']"));
	driver.findElement(By.xpath("//label[@class='form-check-label'and@for='inlineRadio2']"));
	
}
public void or()
{
	driver.findElement(By.xpath("//button[@class='navbar-toggler'or@data-target='collapsibleNavbar']"));
	driver.findElement(By.xpath("//button[@class='navbar-toggler'or@data-toggle='collapse']"));	
	driver.findElement(By.xpath("//div[@id='message-one'or@class='my-2']"));//will select two elements
	
}
public static void main(String[] args) {
		
XPath xpath=new XPath();
xpath.initializeBrowser();
xpath.basicXpath();
xpath.contains();
xpath.startsWith();
xpath.text();
xpath.and();
xpath.or();
xpath.driverQuitandClose();
	}

}