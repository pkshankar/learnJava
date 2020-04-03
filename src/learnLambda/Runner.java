package learnLambda;

public class Runner {

	public static void main(String[] args) {

		// METHOD 1

		// EducationDepartment educationDepartment = new DelhiSchool();
		// educationDepartment.typeOfSchool();

		// METHOD 2 : ANONYMOUS INNERE CLASS

		// EducationDepartment educationDepartment = new EducationDepartment() {
		//
		// @Override
		// public void typeOfSchool() {
		//
		// System.out.println("TYPE OF SCHOOL : SENIOR SECONDARY");
		//
		// }
		//
		// };
		//
		// educationDepartment.typeOfSchool();

		// METHOD 3 : LAMBDA EXPRESSION

//		EducationDepartment educationDepartment = () -> System.out.println("TYPE OF SCHOOL : SENIOR SECONDARY");
//		educationDepartment.typeOfSchool();
		
		EducationDepartment educationDepartment = (num1, num2) -> num1  + num2;
		//educationDepartment.typeOfSchool(3, 4);
		System.out.println(educationDepartment.typeOfSchool(3, 4));

	}

}
