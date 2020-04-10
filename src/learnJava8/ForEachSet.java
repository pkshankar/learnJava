package learnJava8;

import java.util.HashSet;
import java.util.Set;

public class ForEachSet {

	public static void main(String[] args) {
		
		Set<String> employeeName = new HashSet<String>();
		employeeName.add("Avi Gupta");
		employeeName.add("Ronit Sharma");
		employeeName.add("Kapil Mehta");
		employeeName.add("John Jason");
		employeeName.add("Sukhi Singh");
		
		employeeName.forEach(emp -> System.out.println(emp));
		

	}

}
