package learnJava8;

import java.util.Arrays;
import java.util.List;

public class ForEachList {

	public static void main(String[] args) {

		List<String> employeeNames = Arrays.asList("Avi Gupta", "Ronit Sharma", "Kapil Mehta", "John Jason",
				"Sukhi Singh");
		employeeNames.forEach(empNames -> System.out.println(empNames.toUpperCase()));

	}

}
