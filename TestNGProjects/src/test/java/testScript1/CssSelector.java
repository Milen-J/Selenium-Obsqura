package testScript1;

import org.openqa.selenium.By;

public class CssSelector extends Base {    //combination of two attributes//high speed hh
		public void tagAndID()
		{
			//css=tag#id 
			driver.findElement(By.cssSelector("input#button-two"));
			driver.findElement(By.cssSelector("button#button-two"));
			driver.findElement(By.cssSelector("div#collapsibleNavbar"));
			driver.findElement(By.cssSelector("a#progress-bars"));
			driver.findElement(By.cssSelector("a#others"));
			
			
		}
	public void tagAndClass()//if space is present in class name, cannot take
	{
		
		driver.findElement(By.cssSelector("textarea.form-control"));
		driver.findElement(By.cssSelector("input.form-control"));
		driver.findElement(By.cssSelector("div.my-2"));
		driver.findElement(By.cssSelector("button.navbar-toggler"));
		
		
	}
	public void tagAndAttribute()
	{
		
	//Syntax: css=tag[attribute=value]
	//Eg: driver.findElement(By.cssSelector("button[id=button-one]"));
	driver.findElement(By.cssSelector("div[id=collapsibleNavbar]"));
	driver.findElement(By.cssSelector("button[id=button-one]"));
	driver.findElement(By.cssSelector("div[id=message-one]"));
	driver.findElement(By.cssSelector("input[id=single-input-field]"));
	driver.findElement(By.cssSelector("button[id=button-two]"));

	}
	public void tagClassAttribute()
	{//Syntax: css=tag.classname[attribute=value]
		//Eg: driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
		driver.findElement(By.cssSelector("div.my-2[id=message-one]"));
		driver.findElement(By.cssSelector("input.form-control[id=validationCustom01]"));
		driver.findElement(By.cssSelector("input.form-control[id=validationCustom05]"));
		driver.findElement(By.cssSelector("label.form-check-label[for=invalidCheck]"));
	}
		public static void main(String[] args) {
			
	CssSelector csselector=new CssSelector();
	csselector.initializeBrowser();
	csselector.tagAndID();
	csselector.tagAndClass();
	csselector.tagAndAttribute();
	csselector.tagClassAttribute();
	csselector.driverQuitandClose();


		}

	}
}
