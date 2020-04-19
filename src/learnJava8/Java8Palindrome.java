package learnJava8;

import java.util.stream.IntStream;

public class Java8Palindrome {

	public static void main(String[] args) {

		String str = "Malayalam";
		str = str.toLowerCase();

		if (isPalindromeWithoutJava8(str))
			System.out.println("IMPERATIVE STYLE : " + str.toUpperCase() + " IS A PALINDROME");
		else
			System.out.println("IMPERATIVE STYLE : " + str.toUpperCase() + " IS NOT A PALINDROME");

		System.out.println("*********************************************************");

		if (isPalindromeUsingJava8(str))
			System.out.println("FUNCTIONAL STYLE : " + str.toUpperCase() + " IS A PALINDROME");
		else
			System.out.println("FUNCTIONAL STYLE : " + str.toUpperCase() + " IS NOT A PALINDROME");

	}

	public static boolean isPalindromeWithoutJava8(String str) {

		boolean flag = true;

		for (int i = 0; i < (str.length() / 2); i++) {

			if (str.charAt(i) == str.charAt(str.length() - i - 1)) {

				return flag;
			} else {

				flag = false;
			}

		}

		return flag;
	}

	public static boolean isPalindromeUsingJava8(String str) {

		return IntStream.range(0, str.length()).allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));

	}

}
