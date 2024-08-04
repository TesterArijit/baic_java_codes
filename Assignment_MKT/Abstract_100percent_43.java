package Assignment_MKT;
// 2 abstract menthod and 2 conctrete method --->> 50% abstraction
abstract class Property{
	abstract void Salary(); // Abstract method
	void House() // Concrete method
	{
		System.out.println("Parents have a house");
	}
	abstract void Gold(); // Abstract method
	void car() // Concrete method
	{
		System.out.println("Parents have a car");
	}
	
}

public class Abstract_100percent_43 extends Property {
	
	void Salary() {
		System.out.println("having monthly salar=60,000/-");
			
	}

	void Gold() {
		System.out.println("having one bag of gold");
		
	}
	
public static void main(String[] args) {
	Abstract_100percent_43 ab=new Abstract_100percent_43();
	ab.car();
	ab.House();
	ab.Salary();
	ab.Gold();

	}
}
