package com.learnings.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	
	@Test(dataProvider="dp")
//	@Test(dataProvider="getDataSetMethod")
	public void workWithDataProvider(String Username, String Password)
	{
		System.out.println(Username);
		System.out.println(Password);
	}
	
	
	@DataProvider(name="dp")
//	@DataProvider
	public Object[][] getDataSetMethod()
	{
		
		Object[][] Data = new Object[3][2];
		Data[0][0]="Username1";
		Data[0][1]="Password1";
		Data[1][0]="Username2";
		Data[1][1]="Password2";
		Data[2][0]="Username3";
		Data[2][1]="Password3";
		
		return Data;
	}

}
