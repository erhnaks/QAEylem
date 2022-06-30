package com.qa.person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFilter {

	public static void main(String[] args) {

		
		   List<String> names = Arrays.asList("Alice", "Bob", "Alisson", "John", "Parker");
		    List<String> result = 
		        names.stream()
		            .filter(str -> str.startsWith("A"))
		            .collect(Collectors.toList());
		
		System.out.println(result);
	}
}
