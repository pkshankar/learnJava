package genericsConcept;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {

		List<String> fruitList = new ArrayList<>();
		fruitList.add("orange");
		fruitList.add("apple");
		fruitList.add("mango");

		printList(fruitList);

		List<Integer> numList = new ArrayList<>();
		numList.add(34);
		numList.add(12);
		numList.add(78);

		printList(numList);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(100, "Peter"));
		empList.add(new Employee(200, "Jack"));
		empList.add(new Employee(150, "Zuber"));
		
		printList(empList);

	}

	public static <E> void printList(List<E> list) {

		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}

	}

}
