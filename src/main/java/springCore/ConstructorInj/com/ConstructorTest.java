package springCore.ConstructorInj.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorTest {

	public static void main(String[] args) {
	    ApplicationContext cont= new ClassPathXmlApplicationContext("springCore/ConstructorInj/com/Constructor.xml");
	    Person p=(Person)cont.getBean("per");
	    System.out.println(p);
		// TODO Auto-generated method stub

	}

}
