package learnJava;

public class Prime {

	public static void main(String[] args) {

		if (isPrime(4679)) {

			System.out.println("PRIME");
		}

		else {

			System.out.println("NOT PRIME");
		}
	}

	public static boolean isPrime(int num) {

		boolean flag = true;

		if (num <= 1) {

			flag = false;
		}

		else {

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {

					flag = false;
					break;
				}
			}

		}

		return flag;
	}

}
