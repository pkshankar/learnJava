package lambdaExcercise01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MathematicalOperation {

	public static void main(String[] args) throws IOException {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

		List<Integer> otherNumbers = Arrays.asList(90, 67, 1, 87, 890, -90, 0, -390, 78);

		// 1. FIND THE SUM OF DOUBLE OF EACH INTEGER
		System.out.println("SUM OF DOUBLE OF EACH INTEGER");
		System.out.println("**********************************");
		System.out.println(numbers.stream().mapToInt(num -> num * 2).sum());

		// 2. FIND THE DOUBLE OF THE FIRST EVEN NUMBER THAT IS GREATER THAN 3

		System.out.println("DOUBLE OF FIRST EVEN NUMBER THAT IS GREATER THAN 3");
		System.out.println("**********************************");

		System.out.println(numbers.stream().filter(num -> num % 2 == 0 && num > 3).map(num -> num * 2).findFirst());

		// 3. SUM OF NUMBERS DIVISIBLE BY 5 - OTHERNUMBERS LIST

		System.out.println("SUM OF NUMBERS DIVISIBLE BY 5 - OTHERNUMBERS LIST");
		System.out.println("**********************************");
		System.out.println(otherNumbers.stream().filter(num -> num % 5 == 0).mapToInt(num -> num).sum());

		// 4. SORTED LIST - ASCENDING ORDER

		System.out.println("SORTED LIST - ASCENDING ORDER");
		System.out.println("**********************************");

		otherNumbers.stream().sorted().forEach(i -> System.out.println(i));

		// 5. MORE METHODS

		System.out.println("MORE METHODS - SKIP");
		System.out.println("**********************************");

		otherNumbers.stream().skip(5).forEach(i -> System.out.println(i));

		// 6. SORTED

		System.out.println("SORTED");
		System.out.println("**********************************");
		Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(name -> System.out.println(name));

		// 7. AVERAGE OF SQUARES OF AN INT ARRAY

		System.out.println("AVERAGE OF SQUARES OF AN INT ARRAY");
		System.out.println("**********************************");

		int[] someNum = { 2, 4, 6, 8, 10 };
		int sum = Arrays.stream(someNum).map(i -> (i * i)).reduce(0, (a, b) -> a + b);
		System.out.println("AVERAGE IS : " + (sum / someNum.length));

		// 8. AVERAGE OF SQUARES OF AN INT ARRAY - USING SUMMARY STATISTICS

		System.out.println("AVERAGE OF SQUARES OF AN INT ARRAY - USING SUMMARY STATISTICS");
		System.out.println("**********************************");

		System.out.println(Arrays.stream(someNum).map(i -> (i * i)).summaryStatistics().getAverage());

		// 9. STREAM - READ FROM TEXT FILE
		System.out.println("STREAM - READ FROM TEXT FILE");
		System.out.println("**********************************");

		Stream<String> fileStream = Files.lines(Paths.get("C:\\Users\\P K Shankar\\Documents\\InputFile.txt"));
		fileStream.sorted().filter(str -> str.length() > 9).forEach(str -> System.out.println(str));

		fileStream.close();

		// 10. STREAM - READ FROM TEXT FILE - SEARCH FOR A PATTERN
		System.out.println("STREAM - READ FROM TEXT FILE - SEARCH FOR A PATTERN");
		System.out.println("**********************************");

		System.out.println(Files.lines(Paths.get("C:\\Users\\P K Shankar\\Documents\\InputFile.txt"))
				.filter(str -> str.contains("java")).collect(Collectors.toList()));

		// 11. STREAM - READ FROM TEXT FILE - NO. OF ROWS WITH MULTIPLE CHARACTERS
		System.out.println("STREAM - READ FROM TEXT FILE - NO. OF ROWS WITH MULTIPLE CHARACTERS");
		System.out.println("**********************************");

		Stream<String> anotherFileStream = Files.lines(Paths.get("C:\\Users\\P K Shankar\\Documents\\InputFile.txt"));
		System.out.println(anotherFileStream.map(str -> str.split(",")).filter(str -> str.length == 3).count());
		anotherFileStream.close();

		// 12. STREAM - READ FROM TEXT FILE - NO. OF ROWS WITH MULTIPLE CHARACTERS
		System.out.println("STREAM - READ FROM TEXT FILE - NO. OF ROWS WITH MULTIPLE CHARACTERS");
		System.out.println("**********************************");

		// 13. STREAM - READ FROM TEXT FILE - MORE OPERATIONS
		System.out.println("STREAM - READ FROM TEXT FILE - MORE OPERATIONS");
		System.out.println("**********************************");

		Stream<String> yetAnotherFileStream = Files
				.lines(Paths.get("C:\\Users\\P K Shankar\\Documents\\InputFile.txt"));
		yetAnotherFileStream.map(str -> str.replace(" ", "").split(",")).map(str -> str)
				.filter(str -> str.length == 3 && Integer.parseInt(str[1]) > 15).forEach(x -> {

					for (int i = 0; i < x.length; i++) {

						System.out.println(x[i]);
					}
				});

		yetAnotherFileStream.close();

		// 14. STORE STREAM TO MAP

		System.out.println("STORE STREAM TO MAP");
		System.out.println("**********************************");

		Stream<String> mapStream = Files.lines(Paths.get("C:\\Users\\P K Shankar\\Documents\\InputFile.txt"));
		Map<String, String> map = mapStream.map(str -> str.replace(" ", "").split(","))
				.filter(str -> str.length == 3 && Integer.parseInt(str[1]) > 15)
				.collect(Collectors.toMap(k -> k[0], v -> v[1]));
		
		for(Map.Entry<String, String> m : map.entrySet()) {
			
			System.out.println(m.getKey() + " : " + m.getValue());
		}

	}

}
