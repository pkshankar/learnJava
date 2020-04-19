package learnJava8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8CountDuplicateWords {

	public static void main(String[] args) {

		CountDuplicateWordsWithJava8("nobody in alice in wonderland is unhappy but unhappy alice");
		System.out.println("*****************************************");
		CountDuplicateWordsWithJava8("nobody in alice in wonderland is unhappy but unhappy is alice");

	}

	public static void CountDuplicateWordsWithoutJava8(String str) {

		String[] strArr = str.split(" ");
		int counter = 1;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String key : strArr) {

			if (!map.containsKey(key)) {

				map.put(key, counter);
			}

			else {
				counter = counter + 1;
				map.put(key, map.get(key + 1));

			}
		}

		for (Map.Entry<String, Integer> m : map.entrySet()) {

			if (m.getValue() > 1) {

				System.out.println(m.getKey() + " : " + m.getValue());
			}

		}

	}

	public static void CountDuplicateWordsWithJava8(String str) {

		String[] strArr = str.split(" ");
		Map<String, Long> map = Arrays.stream(strArr).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		map.forEach((a, b) -> {

			if (b > 1)
				System.out.println(a + " : " + b);
		});

	}

}
