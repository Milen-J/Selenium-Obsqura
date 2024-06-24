package testScript1;

public class BrowserCommands extends Base {
	public void browserCommands()
	{
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		String pagesource=driver.getPageSource();//html source code of the current webpage
		//System.out.println(pagesource);
		
	}

	public static void main(String[] args) {
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initializeBrowser();//calling the driver loading and url launching function from base class
		browsercommands.browserCommands();
		browsercommands.driverQuitandClose();//calling the browser quit and close function from base class
	}

}