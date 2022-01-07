package springCore.LifeCycle.com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("springCore/LifeCycle/com/config.xml");
		//Travel t= (Travel)context.getBean("travel");
		context.registerShutdownHook();
		//System.out.println(t);
		Hotel H= (Hotel)context.getBean("hotel");
		System.out.println(H);
		// TODO Auto-generated method stub

	}

}
