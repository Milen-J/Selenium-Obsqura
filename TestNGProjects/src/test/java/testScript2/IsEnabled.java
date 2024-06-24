package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript1.Base;

public class IsEnabled extends Base{
	
	public void isEnabled()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiomale=driver.findElement(By.xpath("//input[contains(@value,'Male')]"));
		if(radiomale.isEnabled())
		{
			System.out.println("its enable");
		}
		else
		{
			System.out.println("not enabled");
		}
	}
	public static void main(String[] args)
	{
		IsEnabled isenabled=new IsEnabled();
		isenabled.initializeBrowser();
		isenabled.isEnabled();
	}
}

