package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript1.Base;

public class AlertHandling extends Base {
public void alertHandling()
	{
driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
        
        WebElement simplealert = driver.findElement(By.xpath("//button[contains(@onClick,'jsAlert')]"));
        simplealert.click();
        String alerttext=driver.switchTo().alert().getText();//for getting text in the alert box
        System.out.println(alerttext);
        driver.switchTo().alert().accept();//for clicking 'ok' button
        System.out.println("clicked OK button");
      
       
	}
/*	public void confirmationAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmationalert = driver.findElement(By.xpath("//button[contains(@onClick,'jsConfirm()')]"));
		confirmationalert.click();
		driver.switchTo().alert().dismiss();
		System.out.println("clicked 'cancel' button");
		
	}
	public void promptAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promptalert = driver.findElement(By.xpath("//button[contains(@onClick,'jsPrompt()')]"));
		promptalert.click();
		driver.switchTo().alert().sendKeys("Its a prompt alert");// for giving input text
		 driver.switchTo().alert().accept();
		 System.out.println("Input the text, and clicked 'ok' button");
	}*/

	public static void main(String[] args) {
		
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.initializeBrowser();
		alerthandling.alertHandling();
		//alerthandling.confirmationAlert();
		//alerthandling.promptAlert();
	}

}
