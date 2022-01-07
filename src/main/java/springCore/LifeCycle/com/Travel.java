package springCore.LifeCycle.com;

public class Travel {
	private String fromcity;
	private String Tocity;
	public String getFromcity() {
		return fromcity;
	}
	public void setFromcity(String fromcity) {
		this.fromcity = fromcity;
	}
	public String getTocity() {
		return Tocity;
	}
	public void setTocity(String tocity) {
		Tocity = tocity;
	}
	public Travel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Travel [from=" + fromcity + ", To=" + Tocity + "]";
	}
	public void init(){
		System.out.println("intializizng......");
	}
	public void destroy() {
		System.out.println("Destroy Bean.......");
	}
}
