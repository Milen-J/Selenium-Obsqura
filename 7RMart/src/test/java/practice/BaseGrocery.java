package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseGrocery {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void baseGrocery()
	{
		driver = new ChromeDriver();
		//driver.get("https://groceryapp.uniqassosiates.com/admin/home");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://groceryapp.uniqassosiates.com/admin/home");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement signIn = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		username.sendKeys("admin");
		password.sendKeys("admin");
		signIn.click();
		
	}
	@AfterMethod
	public void quit()
	{
		//driver.quit();
	}
	
}
