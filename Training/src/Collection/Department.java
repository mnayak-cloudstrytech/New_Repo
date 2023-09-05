package Collection;
import java.util.*;
public class Department {
	
    public Department(Integer deptCode, String deptName, String city) {
		super();
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.city = city;
		this.employees = new ArrayList<>();
	}
	
	private Integer deptCode;
    private String deptName;
    private String city ;
    List<Employee>employees;
    
	public Integer getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(Integer deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Department [deptCode=" + deptCode + ", deptName=" + deptName + ", city=" + city + "]";
	}
    
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	
	public void displayEmployeeDetatils() {
		
		System.out.println("Department :" + deptName );
		System.out.println("City "+ city );
		System.out.println("Employee Details :");
		
		for ( Employee employee : employees ) {
			System.out.println("departMentName :"+ employee.getEmpName());
			System.out.println("deptCode:"+ employee.getEmpCode());
			System.out.println( "salary :"+ employee.getSalary());
			
		}
		
	}
		
}
