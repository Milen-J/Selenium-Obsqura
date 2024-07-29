package automation_core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import constants.Constants;

public class Base{
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream file;
	
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	public void initializeBrowser(String browser) throws Exception
	{
		prop = new Properties();
		file = new FileInputStream(Constants.CONFIGFILE);
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
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
		//driver.close();
		driver.quit();
	}
	public void takeScreenshots(ITestResult result) throws IOException
	{
		TakesScreenshot takesscreenshot = (TakesScreenshot) driver;
		File screenshots = takesscreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshots, new File("./screenshots/"+result.getName()+".png"));
		
	}
	
}
