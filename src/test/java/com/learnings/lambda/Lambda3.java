package com.learnings.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Lambda3 {
	
	@Test
	public void match() {
		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Ranjit");
		arr.add("Mnajeet");
		arr.add("Harish");
		arr.add("Rahu");
		arr.add("Sujit");

		List<String> arr1 = (List) Arrays.asList("Boy", "Man", "Women", "Days", "left");

		Stream<String> newStream = Stream.concat(arr.stream(), arr1.stream());
		boolean a=newStream.anyMatch(s->s.equalsIgnoreCase("Sujit"));
		Assert.assertTrue(a);

	}
	
	@Test
	public void streamCollect()
	{
		List<String> arr1 =  Stream.of("Ranjit", "Rahul", "Sanjit", "Manjit", "Baljit").filter(a -> 
			a.startsWith("R")).map(a->a.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(arr1.get(0));
	}
	
	@Test
	public void streamDistinct()
	{
		List<Integer> arr1 = (List) Arrays.asList(6, 5, 3, 4, 3);
		arr1.stream().distinct().forEach(a->System.out.println(a));
		List<Integer> arr2=arr1.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(arr2.get(3));
	}

}
