package com.qa.enums;

enum Days {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

public class Main {
	public static void main(String[] args) {

		Days lastday = Days.FRIDAY;

		System.out.println(lastday);

	}
}
