package com.qa.person;

public class Runner extends Person {

	public Runner(String name, int age, String jobTitle) {
		super(name, age, jobTitle);

	}

	public static void main(String[] args) {

		Person p1 = new Person("Bobby", 32, "Plumber");
		Person p2 = new Person("John", 23, "Painter");
		Person p3 = new Person("Alice", 25, "Artis");
		Person p4 = new Person("Johnny", 19, "Sales");
		Person p5 = new Person("Erhan", 33, "Developer");

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());

	}

}
