package com.learnings.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WindowsValidations {

	@Test
	public void showWeb() {

		System.out.println("Web Show");

	}
	
	
	@Parameters({"name"})
	@Test
	public void showWeb1(String anno) {

		System.out.println("Web Show");
		System.out.println(anno);

	}

	@Test
	public void showMob() {

		System.out.println("Web Show");

	}
	
	@Test
	public void showMob1() {

		System.out.println("Web Show");

	}



}
