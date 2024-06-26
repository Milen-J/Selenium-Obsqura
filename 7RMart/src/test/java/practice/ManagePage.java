package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManagePage extends BaseGrocery{
	@Test
	public void addpage()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/pages/add");
		WebElement title =driver.findElement(By.xpath("//input[@id='title']"));
		title.sendKeys("Selenium Testing");
		System.out.println("Page successfully added");
		
	
	}
	@Test
	public void assertTitle()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/pages/add");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		String expectedTitle ="Add Pages | 7rmart supermarket";
		Assert.assertEquals(actualtitle,expectedTitle);
		
		System.out.println("Titles are same.");
		
	}
	@Test
	public void description()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/pages/add");
		WebElement description =driver.findElement(By.xpath("//div[@class='note-editable card-block']"));
		WebElement bold = driver.findElement(By.xpath("//i[@class='note-icon-bold']"));
		bold.click();
		description.sendKeys("Testing 001 on 21-6-24");
		//bold.click();
	
	}
	@Test
	public void pageName()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/pages/add");
		WebElement pagename =driver.findElement(By.xpath("//input[@id='page']"));
		pagename.sendKeys("Spices 001");
		System.out.println("Page successfully entered");
		
	
	}
	@Test
	public void imagefile()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/pages/add");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement choosefile = driver.findElement(By.xpath("//input[@id='main_img']"));
		choosefile.sendKeys("C:\\Users\\lenovo\\Pictures\\flower.png)");
		js.executeScript("arguments[0].click();", choosefile);
				
		
	}
	public void save() {
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/pages/add");
		WebElement save = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		save.click();
		
	}
}
	

