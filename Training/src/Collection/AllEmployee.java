package Collection;

public class AllEmployee {

	public static void main(String[] args) {
		

		Department department = new Department (101, "IT" , "NewWork");
		
		
		Employee emp1 = new   Employee(1 ,2000 , "john ");
		Employee emp2 = new   Employee ( 2 , 3000 , "Sonu ");
		
		department.addEmployee(emp1);
		department.addEmployee(emp2);
		
		department.displayEmployeeDetatils();
		
		

	}

}
