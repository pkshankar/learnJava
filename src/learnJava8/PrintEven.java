package learnJava8;

import java.util.Arrays;
import java.util.List;

public class PrintEven {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 94, 38, 90, -24, 24);

		// USING LAMBDA EXPRESSIONS

		System.out.println("USING LAMBDA EXPRESSIONS");
		 numList.forEach(i -> {
		
		 if (i > 1 && i % 2 == 0) {
		
		 System.out.println(i);
		 }
		
		 });

		// USING STREAMS

		System.out.println("*****************************");
		System.out.println("USING STREAMS");

		numList.stream().filter(i -> i % 2 == 0 && i > 1).forEach(j -> System.out.println(j));

	}

}
