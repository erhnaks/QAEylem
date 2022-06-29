package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

public class app {

	public static void main(String[] args) {

		ArrayList<String> teams = new ArrayList<String>();

		teams.add("Arsenal");
		teams.add("Manchester ");
		teams.add("Galatasaray");
		teams.add("Celtic");

		System.out.println(teams);

		var staff = new LinkedList<String>();

		staff.add("Amy");
		staff.add("Bob");
		staff.add("Carl");

		System.out.println(staff);

		Iterator<String> iter = staff.iterator();

		String first = iter.next();
		String second = iter.next();
		iter.remove();

		// System.out.println(first);
		// System.out.println(second);

		HashSet<String> set = new HashSet<String>();

		set.add("bmw");
		set.add("ford");
		set.add("mercedes");

		Iterator<String> itr1 = set.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("Turkey", "Ankara");
		capitalCities.put("England", "London");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");

		for (String i : capitalCities.values()) {
			System.out.println(i);
		}
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}

		for (Entry<String, String> i : capitalCities.entrySet()) {
			System.out.println(i);
		}

	}

}
