package testScript1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;//global access //WebDriver is an interface that provides methods for controlling web browsers
	public void initializeBrowser()
	{
		driver=new ChromeDriver();//loading the chrome driver (or) browser initialization(ctrl+space)//initializes the WebDriver instance by creating a new ChromeDriver object
		driver.get("https://selenium.qabible.in/");//launch the URL//wait till the whole page loads
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15) );
		
				}
public void driverQuitandClose()//Quit-closing both parent and associated windows, close-closing only parent window
{
	//driver.close();-If there is only one browser window open, it will close that window and end the WebDriver session.
	//If there are multiple windows or tabs open, it will close the currently active window or tab without terminating the entire WebDriver session
	driver.quit();//closes all browser windows and terminates the WebDriver session completely.
}

	public static void main(String[] args) {
	
		Base base=new Base();
		base.initializeBrowser();
		base.driverQuitandClose();
	}

}