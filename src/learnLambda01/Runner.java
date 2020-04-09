package learnLambda01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		List<People> people = new ArrayList<People>();
		people.add(new People("Tom", "Sanks", 35));
		people.add(new People("Jim", "Anderson", 23));
		people.add(new People("Robert", "Loyd", 47));
		people.add(new People("Ben", "Stun", 21));
		people.add(new People("Ruven", "James", 67));

		// Collections.sort(people);
		// Collections.sort(people);
		// for(People p : people) {
		//
		// System.out.println(p);
		// }

		// Comparator<People> com =

		// Collections.sort(people, (People o1, People o2) ->
		// o1.getFirstName().compareTo(o2.getFirstName()));
		// for (People p : people) {
		//
		// System.out.println(p);
		// }

		List<People> l = filterRecords(people);
		for (People p : l) {

			System.out.println(p);
		}
	}

	public static List<People> filterRecords(List<People> people) {

		List<People> desiredList = new ArrayList<People>();
		for (People p : people) {

			if (p.getLastName().startsWith("S"))
				desiredList.add(p);

		}

		return desiredList;
	}

}
