package learnJava;

public class EqualsConcept {

	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = "Java";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		String str3 = new String("Java");
		String str4 = new String("Java");
		
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);
		
		

	}

}
