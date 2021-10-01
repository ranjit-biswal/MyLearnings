package com.learnings.testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MacValidations {

	@Test
	public void showWeb() {

		System.out.println("Web Show");
		Assert.assertTrue(false);

	}
	
	
	@Parameters({"URL"})
	@Test(groups={"Sanity"})
	public void showWeb1(String urls) {

		System.out.println("Web Show");
		System.out.println(urls);

	}

	@Test(dependsOnMethods={"showWeb1"}, timeOut=1)
	public void showMob() {

		System.out.println("Web Show");

	}
	
	@Parameters({"name"})
	@Test(groups={"Sanity"})
	public void showMob1(String firstname) {

		System.out.println("Web Show");
		System.out.println(firstname);
		

	}



}
