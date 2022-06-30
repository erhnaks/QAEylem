package com.qa.lambda;

import java.util.ArrayList;

public class LambdaRunner {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);

		arrayList.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});
	}
}

// QA community example!