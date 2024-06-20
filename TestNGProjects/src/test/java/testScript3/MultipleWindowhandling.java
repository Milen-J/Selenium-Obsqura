package testScript3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MultipleWindowhandling extends Base {
	@Test
	public void multiplehandle()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		
		WebElement contactus =driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		
		WebElement login =driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		
		WebElement buttonclicks =driver.findElement(By.xpath("//h1[text()='BUTTON CLICKS']"));
		buttonclicks.click();
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent :" +parent);
		
		Set<String> allWindows =driver.getWindowHandles();
		for(String temp:allWindows)
		{
			if(!temp.equals(parent))
			{
		
			System.out.println("Windows :"+temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("****************");
		}
		}
		}
	
		@Test
		public void getWindowhandle2()
		{
			driver.navigate().to("https://webdriveruniversity.com/");
			
			WebElement contactus =driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
			contactus.click();
			
			WebElement login =driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
			login.click();
			
			String parent=driver.getWindowHandle();
			System.out.println("Parent :" +parent);
			
			Set<String> allWindows =driver.getWindowHandles();
			String title = "";
			
			for(String temp:allWindows)
			{
				if(!temp.equals(parent))
				{
			
				System.out.println("Windows :"+temp);
				driver.switchTo().window(temp);
				title = driver.getTitle();
				System.out.println(driver.getCurrentUrl());
				System.out.println("****************");
				}
				if(title.equals("WebDriver | Login Portal"))
				{
					WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
					username.sendKeys("Milen@gmail.com");
				}
				if(title.equals("WebDriver | Contact Us"))
				{
					WebElement fname=driver.findElement(By.xpath("//input[@name='first_name']"));
					fname.sendKeys("Milen");
				}
			}
			driver.switchTo().window(parent);
			System.out.println("Parent"+driver.getCurrentUrl());
		}
	

	}


		

