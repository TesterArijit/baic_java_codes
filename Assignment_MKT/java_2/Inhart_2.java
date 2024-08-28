package test.one;
//Multi level inheritance
class Grand_paa{
	public void land()
	{
		System.out.println("Grand paa having land");
	}
}
class paa extends Grand_paa{
	public void House()
	{
		System.out.println("paa having House");
	}
}
class Paa_elderson extends paa{
	public void Salary()
	{
		System.out.println("Elderson having Salary");
	}
}
class Son1 extends Paa_elderson{
	public void Car()
	{
		System.out.println("son having car");
	}
	
}
public class Inhart_2 {

	public static void main(String[] args) {
		Son1 s1=new Son1();
		s1.Car();
		s1.House();
		s1.land();
		s1.Salary();
	}

}
