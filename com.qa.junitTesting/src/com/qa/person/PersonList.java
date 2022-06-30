package com.qa.person;

import java.util.LinkedList;

public class PersonList extends Person {

	public PersonList(String name, int age, String jobTitle) {
		super(name, age, jobTitle);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		LinkedList<Person> person = new LinkedList<Person>();

		person.add(new Person("ALi", 23, "Bartender"));
		person.add(new Person("Veli", 33, "Sales"));
		person.add(new Person("John", 26, "Driver"));
		person.add(new Person("Marc", 23, "Bartender"));
		person.add(new Person("Tony", 23, "Bartender"));

		for (Person p : person) {

			System.out.println(p.getName());

		}

	}

}
