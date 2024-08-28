package Test_java;

class Father{
	int Salary=6000;
	String Land="2 khatha land";
}
class Son extends Father{
	
	public void House()
	{
		//int Salary=6000;
		System.out.println("Son have a house!");
		//s.Super();
	}
}



public class Single_Level_inheritance {
	public static void main(String[] args) {
		
		Son s=new Son();
		s.House();
		System.out.println(s.Salary);
		System.out.println(s.Land);
		
	}

}
