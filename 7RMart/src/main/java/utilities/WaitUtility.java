package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility 
{
	
		public static final long EXPLICIT_WAIT = 10;
		public static final long IMPLICIT_WAIT = 10;
		public static final long FLUENT_WAIT =20;
		
		public static void waitForElement(WebDriver driver, WebElement target)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.visibilityOf(target));
		}
		
		public void waitForElementToBeClickable(WebDriver driver,WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
		public void waitForAlertToBeVisible(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.alertIsPresent());
		}

		public void waitForWebElementToBeVisible(WebDriver driver,WebElement element)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(FLUENT_WAIT));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public void waitForElementToBeSelected(WebDriver driver,WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementToBeSelected(element));
		}
		
		public void waitFor(WebDriver driver,WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			wait.until(ExpectedConditions.numberOfElementsToBe(null, null));
		}
		


}
