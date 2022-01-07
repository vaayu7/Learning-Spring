package springCore.ConstructorInj.com;

public class Certificate {
   String Certi;

public Certificate(String certi) {
	super();
	Certi = certi;
}

@Override
public String toString() {
	return "Certificate {"+this.Certi+"}";
}
   
}
