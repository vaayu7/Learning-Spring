package springCore.LifeCycle.com;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hotel implements InitializingBean, DisposableBean {
	private String HotelName;

	public String getHotelName() {
		return HotelName;
	}

	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hotel [HotelName=" + HotelName + "]";
	}
	

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Interface Bean...............");
		// TODO Auto-generated method stub
		
	}
	public void destroy() throws Exception {
		System.out.println("Destroy Inteface Bean.......");
		// TODO Auto-generated method stub
		
	}
	

}
