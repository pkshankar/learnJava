package management_System_Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeDriver {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// 1. How many male and female employees are there in the organization

		System.out.println("How many male and female employees are there in the organization");
		Map<String, Long> map = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);

		System.out.println("****************************************************************");
		// 2. Print the name of all departments in the organization

		System.out.println("Print the name of all departments in the organization");
		employeeList.stream().map(emp -> emp.getDepartment()).distinct().forEach(dept -> System.out.println(dept));

		System.out.println("****************************************************************");
		// 3. What is the average age of male and female employees?
		System.out.println("What is the average age of male and female employees?");
		Map<String, Double> mapAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(mapAge);

		System.out.println("****************************************************************");
		// 4. Get the details of highest paid employee in the organization?
		employeeList.stream().max((e1, e2) -> {

			if (e1.getSalary() > e2.getSalary())
				return 1;
			else if (e1.getSalary() < e2.getSalary())
				return -1;
			else
				return 0;

		}).ifPresent(maxSalary -> System.out.println(maxSalary.getName() + " : " + maxSalary.getSalary()));

		System.out.println("****************************************************************");
		// 5. Get the details of highest paid employee in the organization? -
		// ALTERNATIVE WAY
		System.out.println(
				employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

		System.out.println("****************************************************************");
		// 6. Get the names of all employees who have joined after 2015?

		System.out.println("Get the names of all employees who have joined after 2015?");
		employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015)
				.forEach(emp -> System.out.println(emp.getName()));

		System.out.println("****************************************************************");
		// 7. Count the number of employees in each department?
		Map<String, Long> mapDeptCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		mapDeptCount.forEach((a, b) -> System.out.println(a + " : " + b));

		System.out.println("****************************************************************");
		// 8. What is the average salary of each department?

		Map<String, Double> mapDeptAvgSalary = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		mapDeptAvgSalary.forEach((a, b) -> System.out.println(a + " : " + b));

		System.out.println("****************************************************************");
		// 9. Get the details of youngest male employee in the product development
		// department?
		Employee e = employeeList.stream()
				.filter(emp -> emp.getGender().equalsIgnoreCase("male")
						&& emp.getDepartment().equalsIgnoreCase("Product Development"))
				.min(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println(e.getName());

		System.out.println("****************************************************************");
		// 10. Who has the most working experience in the organization?
		Employee eMinYear = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get();
		System.out.println(eMinYear);

		System.out.println("****************************************************************");
		// 11. How many male and female employees are there in the sales and marketing
		// team?
		Map<String, Long> mapCount = employeeList.stream()
				.filter(emp -> emp.getDepartment().equalsIgnoreCase("sales and marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		mapCount.forEach((a, b) -> System.out.println(a + " : " + b));

		System.out.println("****************************************************************");
		// 12. What is the average salary of male and female employees?
		Map<String, Double> mapSalary = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		mapSalary.forEach((a, b) -> System.out.println(a + " : " + b));
		
		System.out.println("****************************************************************");
		// 13. List down the names of all employees in each department?
		Map<String, List<Employee>> mapStrListEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		mapStrListEmp.forEach((a,b) -> System.out.println(a + ": " + b));
		
		System.out.println("****************************************************************");
		// 14. What is the average salary and total salary of the whole organization?
		DoubleSummaryStatistics dbl = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("ÄVERAGE : " + dbl.getAverage());
		System.out.println("SUM : " + dbl.getSum());

		
		System.out.println("****************************************************************");
		// 15. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
		employeeList.stream().filter(emp -> emp.getAge() > 25).forEach(emp -> System.out.println(emp.getName() + " : " + emp.getAge()));
		System.out.println("---------------------");
		employeeList.stream().filter(emp -> emp.getAge() <= 25).forEach(emp -> System.out.println(emp.getName() + " : " + emp.getAge()));
		
		
		System.out.println("****************************************************************");
		// 15. Who is the oldest employee in the organization? What is his age and which department he belongs to?
		
		Employee emp = employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println("OLDEST PERSON NAME : " + emp.getName());
		System.out.println("OLDEST PERSON AGE : " + emp.getAge());
		System.out.println("OLDEST PERSON DEPARTMENT : " + emp.getDepartment());

		



	}

}
