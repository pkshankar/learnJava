package learnLambda01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ImplementationJava7 {

	public static void main(String[] args) {

		List<People> people = new ArrayList<People>();
		people.add(new People("Tom", "Sanks", 35));
		people.add(new People("Jim", "Anderson", 23));
		people.add(new People("Robert", "Loyd", 47));
		people.add(new People("Ben", "Stun", 21));
		people.add(new People("Ruven", "James", 67));

		Comparator<People> sortLastName = new Comparator<People>() {

			@Override
			public int compare(People o1, People o2) {

				return o1.getLastName().compareTo(o2.getLastName());

			}

		};

		Collections.sort(people, sortLastName);

		// SORT BY LAST NAME

		System.out.println("SORTED LIST BY LAST NAME IN ASCENDING ORDER");
		System.out.println("-------------------------------------------");
		printAll(people);

		Condition condition = new Condition() {

			@Override
			public boolean test(People people) {

				return people.getLastName().startsWith("S");

			}

		};

		System.out.println("LAST NAME BEGINNING WITH S");
		System.out.println("-------------------------------------------");
		printLastNameBeginningWith(people, condition);
	}

	public static void printLastNameBeginningWith(List<People> people, Condition condition) {

		for (People p : people) {

			if (condition.test(p))

				System.out.println(p);
		}

	}

	public static void printAll(List<People> people) {

		for (People p : people) {

			System.out.println(p);
		}
	}
}

@FunctionalInterface
interface Condition {

	boolean test(People people);
}
