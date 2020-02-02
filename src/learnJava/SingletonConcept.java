package learnJava;

public class SingletonConcept {

	int empId;
	String empName;
	private static SingletonConcept obj1 = null;

	// static SingletonConcept obj1 = new SingletonConcept();
	// static SingletonConcept obj2 = new SingletonConcept();

	private SingletonConcept(int empId, String empName) {

		this.empId = empId;
		this.empName = empName;
	}

	public static SingletonConcept getInstance(int empId, String empName) {

		if (obj1 == null)

			obj1 = new SingletonConcept(empId, empName);

		return obj1;

	}

	public static void main(String[] args) {

		// obj1.empId = 105;
		// obj1.empName = "John";
		// System.out.println("EMPLOYEE ID : " + obj1.empId);
		// System.out.println("EMPLOYEE NAME : " + obj1.empName);
		// obj2.empId = 908;
		// obj2.empName = "Kim";
		// System.out.println("EMPLOYEE ID : " + obj2.empId);
		// System.out.println("EMPLOYEE NAME : " + obj2.empName);

		SingletonConcept object1 = SingletonConcept.getInstance(105, "JOHN");
		System.out.println(object1.empId + " : " + object1.empName);
		SingletonConcept object2 = SingletonConcept.getInstance(623, "PETER");
		System.out.println(object2.empId + " : " + object2.empName);
	}

}
