package test.one;
//Single level Inheritance

class Father{
	public void salary()
	{
		System.out.println("Have salary");
	}
}
class Son extends Father{
	public void car()
	{
		System.out.println("Son have car");
	}
	
	
}
public class Inhart_1 {

	public static void main(String[] args) {
		 Son s=new Son();
		 s.salary();
		 s.car();
		

	}

}
