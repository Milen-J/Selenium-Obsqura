package basePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base{
	
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void initializeBrowser(@Optional("chrome")String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			throw new Exception("Browser is not correct.");
		}
		driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		
		
	}
	@AfterMethod
	public void QuitAndClose(ITestResult result) throws IOException
	{
		if(result.getStatus()== ITestResult.FAILURE)
		{
			takeScreenshots(result);
		}
		if(result.getStatus()==ITestResult.SKIP)
		{
			takeScreenshots(result);
		}
		//driver.quit();
	}
	public void takeScreenshots(ITestResult result) throws IOException
	{
		TakesScreenshot takesscreenshot = (TakesScreenshot) driver;
		File screenshots = takesscreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshots, new File("./screenshots/"+result.getName()+".png"));
		
	}
	
}
