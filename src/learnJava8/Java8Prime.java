package learnJava8;

import java.util.stream.IntStream;

public class Java8Prime {

	public static void main(String[] args) {

		int num = 2341;

		if (isPrimeWithoutJava8(num))
			System.out.println("IMPERATIVE STYLE : " + num + " IS A PRIME NUMBER");
		else
			System.out.println("IMPERATIVE STYLE : " + num + " IS NOT A PRIME NUMBER");

		System.out.println("*********************************************************");

		if (isPrimeWithJava8(num))
			System.out.println("FUNCTIONAL STYLE : " + num + " IS A PRIME NUMBER");
		else
			System.out.println("FUNCTIONAL STYLE : " + num + " IS NOT A PRIME NUMBER");

	}

	// IMPERATIVE STYLE
	public static boolean isPrimeWithoutJava8(Integer n) {

		boolean flag = true;

		if (n <= 1) {

			flag = false;
		}

		else {

			for (int counter = 2; counter < n; counter++) {

				if (n % counter == 0) {

					flag = false;
					break;
				}
			}
		}

		return flag;
	}

	// FUNCTIONAL STYLE
	public static boolean isPrimeWithJava8(Integer n) {

		return n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0);

	}

}
