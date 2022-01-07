package springCore.Collection.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("springCore/Collection/com/Collection.xml");
	Emp e= (Emp)context.getBean("Employee");
	System.out.print(e.getEname());
	System.out.print(e.getPhone());
	System.out.print(e.getAdderess());
	System.out.print(e.getCourses());
	//e.getPhone();
		// TODO Auto-generated method stub

	}

}
