package springCore.Collection.com;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String Ename;
	private List<String> Phone;
	private Set<String> Adderess;
	private Map<String, Integer> Courses;
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public List<String> getPhone() {
		return Phone;
	}
	public void setPhone(List<String> phone) {
		Phone = phone;
	}
	public Set<String> getAdderess() {
		return Adderess;
	}
	public void setAdderess(Set<String> adderess) {
		Adderess = adderess;
	}
	public Map<String, Integer> getCourses() {
		return Courses;
	}
	public void setCourses(Map<String, Integer> courses) {
		Courses = courses;
	}
	public Emp(String ename, List<String> phone, Set<String> adderess, Map<String, Integer> courses) {
		super();
		Ename = ename;
		Phone = phone;
		Adderess = adderess;
		Courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
