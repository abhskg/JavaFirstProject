package week7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpContext {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("EmpBeanContainer.xml");
		Employee emp = (Employee) factory.getBean("emp1");
		System.out.println(emp);

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter emp code: ");
//		String empId = scan.next();
//
//		Employee emp1 = (Employee) factory.getBean(empId);
//		System.out.println(emp1);
//		scan.close();

		ApplicationContext factory1 = new AnnotationConfigApplicationContext(EmpContainer.class);
		Employee emp2 = (Employee) factory1.getBean("emp5");
		System.out.println(emp2);

		Employee emp3 = (Employee) factory1.getBean("emp6");
		System.out.println(emp3);
	}
}
