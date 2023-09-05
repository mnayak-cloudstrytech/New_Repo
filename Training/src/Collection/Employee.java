package Collection;

public class Employee {

	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", salary=" + salary + "]";
	}
	public Employee(int empCode, double salary, String empName) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.salary = salary;
	}
	private int empCode;
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private String empName;
	private double salary;

	
			
			
		}

	


