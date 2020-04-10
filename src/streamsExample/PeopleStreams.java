package streamsExample;

import java.util.Arrays;
import java.util.List;

import learnStreams.Person;

public class PeopleStreams {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(new Person("Tina", "Female", 25), new Person("Anand", "Male", 27),
				new Person("Saumya", "Female", 23), new Person("Raunak", "Male", 26), new Person("Riti", "Female", 15),
				new Person("Anand", "Male", 34), new Person("Saumya", "Female", 16));

		personList.stream().filter(p -> p.getGender().equalsIgnoreCase("Female"))
				.forEach(p -> System.out.println(p.getName()));

	}

}
