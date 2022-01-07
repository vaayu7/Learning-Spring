package springCore.Reference.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceTest {

	public static void main(String[] args) {
	    ApplicationContext con = new ClassPathXmlApplicationContext("springCore/Reference/com/Ref.xml");
	   	B o=(B)con.getBean("Ref2");
	   	System.out.println(o.getY());
	   	System.out.println(o.getOb().getX());
	   	System.out.print(o);
		// TODO Auto-generated method stub
	}

}
