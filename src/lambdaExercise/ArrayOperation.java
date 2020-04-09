package lambdaExercise;

public class ArrayOperation {

	public static void main(String[] args) {

		int numArr[] = { 2, 9, 4, 1, 3 };
		int key = 2;

		// PERFORM ADDITION
		System.out.println("PERFORM ADDITION");
		System.out.println("-----------------");
		for (int i : numArr) {

			doOperation(i, j -> i + key);

		}
		
		// PERFORM SUBTRACTION
		System.out.println("PERFORM SUBTRACTION");
		System.out.println("-----------------");

		for (int i : numArr) { 

			doOperation(i, j -> i - key);

		}
		System.out.println("PERFORM MULTIPLICATION");
		System.out.println("-----------------");

		for (int i : numArr) {

			doOperation(i, j -> i * key);

		}


	}

	public static void doOperation(int num, PerformOperation<Integer> performOperation) {

		System.out.println(performOperation.perform(num));

	}

}

interface PerformOperation<Integer> {

	int perform(int num);
}
