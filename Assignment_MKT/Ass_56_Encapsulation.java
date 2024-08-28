package Assignment_MKT;

 class Asset{
	 private String a="Property";

	public String getProperty() {
		return a;
	}

	public void setProperty(String a) {
		this.a = a;
	}
	 
 }
public class Ass_56_Encapsulation {
	
public static void main(String[] args) {
	Asset p=new Asset();
	System.out.println(p.getProperty());
	p.setProperty("Gold");
	System.out.println(p.getProperty());
	
	}

}
