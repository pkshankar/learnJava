package streamsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {

		List<Guest> guestList = createGuest();

		// GET IN UPPERCASE THE NAMES OF ALL FEMALE OLDER THAN 18

		// 1. LAMBDA APPROACH

		System.out.println("LAMBDA APPROACH");
		guestList.forEach(guest -> {

			if (guest.getGuestGender().equals("Female") && guest.getGuestAge() > 18) {

				System.out.println(guest.getGuestName().toUpperCase());
			}
		});

		System.out.println("*********************************");
		// 2. STREAMS APPROACH - FILTER

		System.out.println("STREAMS APPROACH - FILTER");
		guestList.stream().filter(guest -> guest.getGuestGender().equals("Female") && guest.getGuestAge() > 18)
				.forEach(p -> System.out.println(p.getGuestName().toUpperCase()));

		// 3. STREAMS APPROACH - FILTER AND MAP

		System.out.println("*********************************");
		System.out.println("STREAMS APPROACH - FILTER AND MAP");
		guestList.stream().filter(guest -> guest.getGuestGender().equals("Female") && guest.getGuestAge() > 18)
				.map(filteredGuest -> filteredGuest.getGuestName().toUpperCase())
				.forEach(output -> System.out.println(output));

		// 4. PRINT ALL MALES IN UPPERCASE

		System.out.println("*********************************");
		System.out.println("ALL MALES IN UPPERCASE");
		guestList.stream().filter(guest -> guest.getGuestGender().equals("Male"))
				.map(guest -> guest.getGuestName().toUpperCase()).forEach(guest -> System.out.println(guest));

		// 5. SUM OF ALL AGES - APPROACH 1

		System.out.println("*********************************");
		System.out.println("SUM OF ALL AGES USING MAP TO INT");
		System.out.println(guestList.stream().mapToInt(guest -> guest.getGuestAge()).sum());

		// 6. SUM OF ALL AGES - APPROACH 2

		System.out.println("*********************************");
		System.out.println("SUM OF ALL AGES USING REDUCE");
		System.out.println(guestList.stream().map(guest -> guest.getGuestAge()).reduce(0,
				(previousPersonAge, currentPersonAge) -> previousPersonAge + currentPersonAge));

		// 7. SUM OF AGES OF ALL FEMALES
		System.out.println("*********************************");
		System.out.println("SUM OF ALL AGES OF FEMALES");
		System.out.println(guestList.stream().filter(guest -> guest.getGuestGender().equals("Female"))
				.mapToInt(guest -> guest.getGuestAge()).sum());

		// 8. OLDEST PERSON

		System.out.println("*********************************");
		System.out.println("OLDEST PERSON");

		Optional<Guest> oldestPerson = guestList.stream().max((a, b) -> {

			if (a.getGuestAge() > b.getGuestAge())
				return 1;
			else if (a.getGuestAge() < b.getGuestAge())
				return -1;
			else
				return 0;

		});

		System.out.println(oldestPerson.get());

		// 9. YOUNGEST PERSON

		System.out.println("*********************************");
		System.out.println("YOUNGEST PERSON");

		System.out.println(guestList.stream().min((a, b) -> a.getGuestAge() > b.getGuestAge() ? 1 : -1));

		// 10. COUNT NON ADULTS

		System.out.println("*********************************");
		System.out.println("COUNT NON ADULTS");
		System.out.println(guestList.stream().filter(guest -> guest.getGuestAge() < 18).count());

		// 11. COLLECT - TO LIST

		System.out.println("*********************************");
		System.out.println("COLLECT - TO LIST");

		System.out.println(guestList.stream().collect(Collectors.toList()));

		// 12. COLLECTORS - GROUPING BY

		System.out.println("*********************************");
		System.out.println("COLLECTORS - GROUPING BY");

		Map<Integer, List<Guest>> map = guestList.stream().collect(Collectors.groupingBy(p -> p.getGuestAge()));
		map.forEach((k, v) -> System.out.println(k + " : " + v));

		// 13. FIND FIRST PERSON WHOSE NAME IS 4 LETTERS BUT IS OLDER THAN 25

		System.out.println("*********************************");
		System.out.println("FIND FIRST PERSON WHOSE NAME IS 4 LETTERS BUT IS OLDER THAN 25");

		System.out.println(guestList.stream()
				.filter(guest -> guest.getGuestName().length() == 4 && guest.getGuestAge() > 25).findFirst());
		


	}

	public static List<Guest> createGuest() {

		return Arrays.asList(new Guest("Sara", "Female", 20), new Guest("Sara", "Female", 22),
				new Guest("Bob", "Male", 20), new Guest("Paula", "Female", 32), new Guest("Paul", "Male", 32),
				new Guest("Jack", "Male", 2), new Guest("Jack", "Male", 72), new Guest("Jill", "Female", 12));
		
		
	}
}
