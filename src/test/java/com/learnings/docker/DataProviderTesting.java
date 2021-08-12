package com.learnings.docker;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTesting {

	@Test(dataProvider = "TestData")
	public void getTest(String name, String surname, String state) {
		System.out.println(name + " " + surname + " " + state);

	}

	@DataProvider(name = "TestData")
	public Object[][] getData() {

		Object[][] data = { { "Ranjit", "Biswal", "Odisha" }, { "Alok", "Mehra", "UP" }, { "Mohan", "Singh", "MP" } };
		return data;

	}

}
