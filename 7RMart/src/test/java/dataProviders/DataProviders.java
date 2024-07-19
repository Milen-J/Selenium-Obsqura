package dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="Invalid User Credentials")
	public Object[][] verifyUserCredentialsData()//multidimensional array
	{
		Object data[][]= new Object[3][2];
		data[0][0]="DDDD";
		data[0][1]="admin";
		
		data[1][0]="admin";
		data[1][1]="aaaaa";
		
		data[2][0]="asddd";
		data[2][1]="35555";
		
		return data;
	}
}
