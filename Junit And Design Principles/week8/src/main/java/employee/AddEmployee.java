package employee; 

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {

	private List<EmployeePOJO> employeeList;
	
	public AddEmployee() {
		employeeList = new ArrayList<EmployeePOJO>();
	}
	
	public void addEmployee(EmployeePOJO emp ) {
		employeeList.add(emp); 
	}
	
	public EmployeePOJO getEmployee(String id) {

		for( EmployeePOJO employee : employeeList ) {
			if (employee.getId() == id ) {
				return employee;
			}
		}
		return null ; 
	}
	
}
