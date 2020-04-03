package learnStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

				List<Person> personList = Arrays.asList(new Person("Tina","Female",25),
				new Person("Anand","Male",27),
				new Person("Saumya","Female",23),
				new Person("Raunak","Male",26),
				new Person("Riti","Female",15),
				new Person("Anand","Male",34),
				new Person("Saumya","Female",16));
//				List<String> list = getPeople(personList,"Female",50);
			//	System.out.println(personList.get(0).get);
		
				//List<String> maleList = personList.stream().filter()
				
		
		
	}
	
	public static List<String> getPeople(List<Person> person, String personGender, int personAge) {
		
		List<String> personNameList = new ArrayList<String>();
		
		for(Person p : person) {
			
			if(p.getGender().equalsIgnoreCase(personGender) && p.getAge() > personAge) {
				
				personNameList.add(p.getName().toUpperCase());
			}
		}
		
		return personNameList;
	}

}
