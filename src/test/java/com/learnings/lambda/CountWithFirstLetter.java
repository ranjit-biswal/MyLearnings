package com.learnings.lambda;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class CountWithFirstLetter {

	@Test
	public void countLetter() {
		// TODO Auto-generated method stub

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Ranjit");
		arr.add("Mnajeet");
		arr.add("Harish");
		arr.add("Rahul");
		arr.add("Sujit");

		int count = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).startsWith("R")) {
				count = count + 1;
			}
		}

		System.out.println(count);

		int count1 = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).charAt(0) == 'H') {
				count1 = count1 + 1;
			}
		}

		System.out.println(count1);
	}

	@Test
	public void countLetterStream() {
		// TODO Auto-generated method stub

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Ranjit");
		arr.add("Mnajeet");
		arr.add("Harish");
		arr.add("Rahul");
		arr.add("Sujit");

		long count = arr.stream().filter(a -> a.startsWith("R")).count();
		System.out.println("Stream Count " + count);

		long count1 = Stream.of("Ranjit", "Rahul", "Sanjit", "Manjit", "Baljit").filter(a -> a.startsWith("R")).count();
		System.out.println(count1);

		long count2 = Stream.of("Ranjit", "Rahul", "Sanjit", "Manjit", "Baljit").filter(a -> {
			a.startsWith("R");
			return true;

		}).count();
		System.out.println(count2);

	}
}
