package exceptionHandlingLambda;

import java.util.function.BiConsumer;

public class HandleException {

	public static void main(String[] args) {

		int[] numArr = { 4, 2, 8, 5, 9 };
		int key = 2;
		process(numArr, key, wrapperLambda((a, b) -> System.out.println(a * b)));

	}

	public static void process(int[] intArr, int k, BiConsumer<Integer, Integer> biConsumer) {

		for (int i = 0; i < intArr.length; i++) {

			biConsumer.accept(intArr[i], k);

		}
	}

	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {

		return (a, b) -> {

			try {

				biConsumer.accept(a, b);
			}

			catch (Exception e) {

				System.out.println("EXCEPTION CAUGHT INSIDE WRAPPER LAMBDA");
			}

		};

	}

}
