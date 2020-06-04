package employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AddEmployeeTest {

	private AddEmployee empList;
	
	@Before
	public void setUp () {
		empList = new AddEmployee();
		EmployeePOJO emp1 = new EmployeePOJO("E01", "Donald", "Lahore");
		EmployeePOJO emp2 = new EmployeePOJO("E02", "Imran", "Delhi");
		EmployeePOJO emp3 = new EmployeePOJO("E03", "Narendra", "Washington");
		empList.addEmployee(emp1);
		empList.addEmployee(emp2);
		empList.addEmployee(emp3);		
	}
	
	@Test
	public void testGetEmployee() {
		EmployeePOJO emp = empList.getEmployee("E03");
		EmployeePOJO testEmp = new EmployeePOJO("E03", "Narendra", "Washington");
		assertNotNull(emp);
		assertEquals(testEmp, emp);
	}	

	@Test
	public void testGetEmployeeForNull() {
		EmployeePOJO emp = empList.getEmployee("E05");
		assertNull(emp);
	}

}
