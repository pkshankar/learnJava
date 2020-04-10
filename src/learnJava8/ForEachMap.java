package learnJava8;

import java.util.HashMap;
import java.util.Map;

public class ForEachMap {

	public static void main(String[] args) {

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(109, "Somit Dev");
		employeeMap.put(154, "Rehan Khaitan");
		employeeMap.put(123, "Abidev Roshan");
		employeeMap.put(119, "Hardeep Singh");
		employeeMap.put(176, "Ankit Swapan");

		employeeMap.forEach((employeeId, employeeName) -> System.out
				.println("EMPLOYEE ID : " + employeeId + " | EMPLOYEE NAME " + employeeName));
		
		System.out.println("*******************************");
		System.out.println("PRINT KEYS");
		employeeMap.keySet().forEach(key -> System.out.println(key));

		System.out.println("*******************************");
		System.out.println("PRINT VALUES");
		employeeMap.values().forEach(value -> System.out.println(value));

	}

}
