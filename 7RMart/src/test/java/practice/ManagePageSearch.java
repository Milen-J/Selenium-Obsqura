package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ManagePageSearch extends BaseGrocery {
	@Test
	public void searchTitle()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-page");
		WebElement searchmain= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		searchmain.click();
		WebElement title = driver.findElement(By.xpath("//input[@name='un']"));
		WebElement searchbutton =driver.findElement(By.xpath("//button[@class='btn btn-danger btn-fix']"));
		title.sendKeys("testing1.");
		searchbutton.click();
		//System.out.println("Title found");
		
	}
	

}
