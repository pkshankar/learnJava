package learnJava;

public class Palindrome {

	public static void main(String[] args) {
		
		

		if (isPalindrome(124)) {

			System.out.println("PALINDROME");
		}

		else

		{
			System.out.println("NOT PALINDROME");

		}

	}

	public static boolean isPalindrome(int num) {

		int rem;
		int revNum = 0;
		boolean flag;
		int actualNum = num;
		while (num != 0) {

			rem = num % 10;
			revNum = revNum * 10 + rem;
			num = num / 10;
		}

		if (actualNum == revNum) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;
	}

}
