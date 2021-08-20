package com.learnings.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import java.util.List;

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

		// arr.stream().filter(a -> a.length() > 5).forEach(a ->
		// System.out.println(a));
		arr.stream().filter(a -> a.length() > 5).limit(1).forEach(a -> System.out.println(a));

	}

	@Test
	public void stremMap() {
		Stream.of("Ranjit", "Rahul", "Sanjit", "Manjit", "Baljit").filter(a -> a.endsWith("t"))
				.map(a -> a.toUpperCase()).forEach(a -> System.out.println(a));

		Stream.of("Ranjit", "Rahul", "Sanjit", "Manjit", "Baljit").filter(a -> a.startsWith("t")).sorted()
				.map(a -> a.toUpperCase()).forEach(a -> System.out.println(a));
	}

	@Test
	public void stremMapSorted() {

		List<String> arr = (List) Arrays.asList("Ranjit", "Rahul", "Sanjit", "Manjit", "Baljit");

		arr.stream().filter(a -> a.startsWith("R")).sorted().map(a -> a.toUpperCase())
				.forEach(a -> System.out.println(a));
	}

	@Test
	public void concant() {
		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Ranjit");
		arr.add("Mnajeet");
		arr.add("Harish");
		arr.add("Rahu");
		arr.add("Sujit");

		List<String> arr1 = (List) Arrays.asList("Boy", "Man", "Women", "Days", "left");

		Stream<String> newStream = Stream.concat(arr.stream(), arr1.stream());
		newStream.forEach(a -> System.out.println(a));

	}
}
