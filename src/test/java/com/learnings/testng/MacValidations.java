package com.learnings.testng;

import org.testng.annotations.Test;

public class MacValidations {

	@Test
	public void showWeb() {

		System.out.println("Web Show");

	}
	
	
	
	@Test(groups={"Sanity"})
	public void showWeb1() {

		System.out.println("Web Show");

	}

	@Test
	public void showMob() {

		System.out.println("Web Show");

	}
	
	@Test(groups={"Sanity"})
	public void showMob1() {

		System.out.println("Web Show");

	}



}
