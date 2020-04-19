package learnJava;

public class Singleton {

	private static Singleton instance = null;
	public String str;

	private Singleton() {

		str = "This is singleton class";
	}

	public static Singleton getInstance() {

		if (instance == null) {

			instance = new Singleton();
		}

		return instance;
	}

	public static void main(String[] args) {

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		obj1.str = obj1.str.toUpperCase();
		System.out.println(obj1.str);
		System.out.println(obj2.str);

	}

}
