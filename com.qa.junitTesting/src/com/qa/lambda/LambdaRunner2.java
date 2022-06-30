package com.qa.lambda;

import java.util.ArrayList;

public class LambdaRunner2 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("E");
		arrayList.add("R");
		arrayList.add("H");
		arrayList.add("A");
		arrayList.add("N");

		arrayList.forEach(n -> System.out.println(n));
	}

}
