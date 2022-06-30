package com.qa.person;

import java.util.List;
import java.util.stream.Collectors;

public class PersonStream {

	public static void main(String[] args) {

		List<Person> people = getPeople();

		List<Person> names = people.stream().collect(Collectors.toList());

		names.forEach(System.out::println);

	}

	private static List<Person> getPeople() {
		return List.of(

				new Person("ALi", 23, "Bartender"), new Person("Alisson", 33, "Sales"),
				new Person("John", 26, "Driver"), new Person("Alex", 23, "Developer"),
				new Person("Tony", 23, "Driver"));
	}

}
