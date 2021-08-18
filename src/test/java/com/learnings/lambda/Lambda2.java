package com.learnings.lambda;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Lambda2 {

	@Test
	public void printStream() {
		// TODO Auto-generated method stub

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Ranjit");
		arr.add("Mnajeet");
		arr.add("Harish");
		arr.add("Rahu");
		arr.add("Sujit");

//		arr.stream().filter(a -> a.length() > 5).forEach(a -> System.out.println(a));
		arr.stream().filter(a -> a.length() > 5).limit(1).forEach(a -> System.out.println(a));

	}

}
