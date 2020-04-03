package EqualsAndHashcode;

import java.util.HashMap;
import java.util.Map;


public class Runner {

	public static void main(String[] args) {

		Employee emp1 = new Employee(100, "John");
		Employee emp2 = new Employee(101, "Peter");
		Employee emp3 = new Employee(100, "John");

//		HashSet<Employee> empSet = new HashSet<Employee>();
//		empSet.add(emp1);
//		empSet.add(emp2);
//		empSet.add(emp3);

//		for (Employee e : empSet) {
//
//			System.out.println(e.getEmpId() + " : " + e.getEmpName() + " : " + e.hashCode());
//		}

		HashMap<Employee, Integer> hMap = new HashMap<Employee, Integer>();
		hMap.put(emp1, 25);
		hMap.put(emp2, 26);
		hMap.put(emp3, 25);
		for(Map.Entry<Employee, Integer> m : hMap.entrySet()) {
			
			System.out.println(m.getKey().hashCode() + " : " +  m.getKey().getEmpId() + " : " + m.getKey().getEmpName() + " : " + m.getValue());
		}
		
		System.out.println(emp1.equals(emp3));
	}

}
