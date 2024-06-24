package testScript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript1.Base;

public class TableHandling extends Base {
	public void fullTablePrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
		System.out.println();
	}
public void rowPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		System.out.println("Row Printing");
		
		WebElement table1=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		System.out.println(table1.getText());
		System.out.println();
	}
	public void rowCell()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		System.out.println("column printing by giving both row and cell index");
		
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[3]"));
		System.out.println(table.getText());
		System.out.println();
		
	}
	public void columnPrinting()
	{	
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		System.out.println("Column Printing");
		
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement lists:table)
		{
			System.out.println(lists.getText());
		}
		System.out.println();
	}
	public void fourthRowPrint()
	{
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		System.out.println("4th row printing");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(table.getText());
	}
	public void sixthRowSecondCell()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		System.out.println("6th row 2nd cell");
		WebElement table5=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[6]/td[2]"));
		System.out.println(table5.getText());
		
		System.out.println();
	}
	public void thirdColumn()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		System.out.println("3rd column printing");
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement lists:table)
		{
			System.out.println(lists.getText());
		}
		System.out.println();
		
	}
	public void checkingAvalue()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	    System.out.println("1st column printing");
	    List<WebElement> table = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
	   
	    for (WebElement cell : table) {
	        String cellText = cell.getText();
	        System.out.println(cellText);
	        if (cellText.equals("Ashton Cox")) {
	        	int index=table.indexOf(cell)+1;
	        	
	            System.out.println("Exact match 'Ashton Cox' found on:"+index+"column");
	        }
	        else continue;
	    
	  
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
		TableHandling tablehandling=new TableHandling();
		tablehandling.initializeBrowser();
		tablehandling.fullTablePrinting();
		tablehandling.rowPrinting();
		tablehandling.rowCell();
		tablehandling.columnPrinting();
		tablehandling.fourthRowPrint();
		tablehandling.sixthRowSecondCell();
		tablehandling.thirdColumn();
		tablehandling.checkingAvalue();
		
	}

}