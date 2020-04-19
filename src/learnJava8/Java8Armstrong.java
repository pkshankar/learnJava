package learnJava8;

import java.util.stream.IntStream;

public class Java8Armstrong {

	public static void main(String[] args) {

		int num = 54748;

		if (isArmstrongWithoutJava8(num))
			System.out.println("IMPERATIVE STYLE : " + num + " IS AN ARMSTRONG NUMBER");
		else
			System.out.println("IMPERATIVE STYLE : " + num + " IS NOT AN ARMSTRONG NUMBER");

		System.out.println("*********************************************************");

		if (isArmstrongWithJava8(num))
			System.out.println("FUNCTIONAL STYLE : " + num + " IS AN ARMSTRONG NUMBER");
		else
			System.out.println("FUNCTIONAL STYLE : " + num + " IS NOT AN ARMSTRONG NUMBER");

	}

	public static boolean isArmstrongWithoutJava8(int n) {

		String str = String.valueOf(n);
		int noOfDigits = str.length();
		int sum = 0;

		for (int count = 0; count < noOfDigits; count++) {

			sum = (int) (sum + Math.pow(Integer.parseInt(Character.toString(str.charAt(count))), noOfDigits));

		}

		if (sum == n)
			return true;
		else
			return false;

	}

	public static boolean isArmstrongWithJava8(int n) {

		String str = String.valueOf(n);
		int noOfDigits = str.length();

		int sumOfDigits = (int) IntStream.range(0, noOfDigits)
				.mapToDouble(i -> Math.pow(Integer.parseInt(Character.toString(str.charAt(i))), noOfDigits)).sum();

		if (n == sumOfDigits)
			return true;
		else
			return false;

	}

}
