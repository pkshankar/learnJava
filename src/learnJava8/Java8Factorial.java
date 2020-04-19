package learnJava8;

import java.util.stream.IntStream;

public class Java8Factorial {

	public static void main(String[] args) {

		int number = 5;
		int result = findFactorialWithoutJava8(number);
		System.out.println("IMPERATIVE STYLE");
		System.out.println(number + "!= " + result);
		System.out.println("***********************");
		System.out.println("FUNCTIONAL STYLE");
		int resultAgain = findFactorialWithJava8(number);
		System.out.println(number + "!= " + resultAgain);

	}

	public static int findFactorialWithoutJava8(int n) {

		int result = 1;
		for (int i = 1; i <= n; i++) {

			result = result * i;
		}

		return result;
	}

	public static int findFactorialWithJava8(int n) {

		return IntStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y);
	}
}
