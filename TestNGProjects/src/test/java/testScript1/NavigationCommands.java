package testScript1;

public class NavigationCommands extends Base {
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");//navigate from one page to another page//doesnot need load the whole page//from one page to another
		driver.navigate().back();//navigate back to our page
		driver.navigate().forward();//again back to amazon page
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
	
NavigationCommands navigationcommands=new NavigationCommands();
navigationcommands.initializeBrowser();
navigationcommands.navigationCommands();
navigationcommands.driverQuitandClose();
	}

}