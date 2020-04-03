package EqualsAndHashcode;

public class Employee {

	private int empId;
	private String empName;

	public Employee(int empId, String empName) {

		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {

			return true;
		}

		if (obj == null) {

			return false;
		}
		
		if(this.getClass() != obj.getClass()) {
			
			return false;
		}

		Employee emp = (Employee) obj;

		if (this.empId != emp.empId) {

			return false;
		}

		if (this.empName == null) {

			if (emp.empName != null) {

				return false;
			}
		}

		if (!this.empName.equals(emp.empName)) {

			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {

		return this.empId;
	}

}
