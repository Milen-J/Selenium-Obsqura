package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript1.Base;

public class Frame extends Base {
	
public void frameHandling()
{
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	WebElement frame1=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
	driver.switchTo().frame(frame1);
	WebElement image=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	image.click();
}
	public static void main(String[] args) {
		
Frame frame=new Frame();
frame.initializeBrowser();
frame.frameHandling();
	}

}