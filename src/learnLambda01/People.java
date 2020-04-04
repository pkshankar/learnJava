package learnLambda01;

import java.util.Comparator;

//public class People implements Comparable<People> {

public class People {

	private String firstName;
	private String lastName;
	private int age;

	public People(String firstName, String lastName, int age) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "People [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	// public int compareTo(People o) {
	//
	// return this.getLastName().compareTo(o.getLastName());
	// }

	//LAMBDAS
	
	//Comparable<People> com = (People people) -> this.getLastName().compareTo(people.getLastName());
	
	
	

}
