package learnJava8;

import java.util.Arrays;
import java.util.List;

public class PrintEven {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 94, 38, 90, -24, 24);
		numList.forEach(i -> {

			if (i > 1 && i % 2 == 0) {

				System.out.println(i);
			}

		});

	}

}
