package Assignment_MKT;

interface Car_model  // interface
{
	void Interior_design(); // abstract method1.
	void Exterior_design(); // abstract method2.
}
// 100 % implimentation in child class 

public class Interface_demo1_44 implements Car_model{
	
    public void Interior_design() {
	// here un implemented methods are implimented.	
		System.out.println("Interior design should be updated from privious model");
	}

	
	public void Exterior_design() {
		
		System.out.println("Exterior design should be same as privious model");
	
	}

	public static void main(String[] args) {
	Interface_demo1_44	in=new Interface_demo1_44();
	in.Interior_design();
	in.Exterior_design();

	}

	
	

}
