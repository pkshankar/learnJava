package streamsJava8;

import java.util.Arrays;
import java.util.List;

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
		;

	}

	public static List<Guest> createGuest() {

		return Arrays.asList(new Guest("Sara", "Female", 20), new Guest("Sara", "Female", 22),
				new Guest("Bob", "Male", 20), new Guest("Paula", "Female", 32), new Guest("Paul", "Male", 32),
				new Guest("Jack", "Male", 2), new Guest("Jack", "Male", 72), new Guest("Jill", "Female", 12));
	}
}
