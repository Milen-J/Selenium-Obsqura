package testScript3;

import org.testng.annotations.Test;

public class Annotations extends Base{
	@Test(priority=3)
	public void test1()
	{
		System.out.println("Thank you");
	}
	@Test(priority=1)
	public void test2()
	{
	
		System.out.println("Hi");
	}
	@Test(priority=2)
	public void test3()
	{
		System.out.println("Welcome");
	}
	

}
