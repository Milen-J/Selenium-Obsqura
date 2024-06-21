package testScript3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableTestCases extends Base {
	@Test
	public void webtable1()//FULL TABLE
	{
		driver.navigate().to("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		WebElement webtable1=driver.findElement(By.xpath("//table[@id='customers']"));
		System.out.println(webtable1.getText());
		System.out.println();
	}
	@Test
	public void webtable2()//ROW PRINTING
	{
		driver.navigate().to("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		WebElement webtable2=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[4]"));
		System.out.println(webtable2.getText());
		System.out.println();
	}
	@Test
	public void columnprint()
	{
		driver.navigate().to("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement> webtable2=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[2]"));
		for(WebElement lists:webtable2)
		{
			System.out.println(lists.getText());
			System.out.println();
		}
		System.out.println();
	}

}
