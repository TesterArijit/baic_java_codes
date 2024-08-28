package test.one;
//Method overriding

class AB{
	public void m1()
	{
		System.out.println("One");
	}
}
class BC extends AB{
	public void m1()
	{
		System.out.println("Two");
	}
}
class CD extends BC{
	
	public void m1()
	{
		System.out.println("Three");
	}
}

public class Override01 {

	public static void main(String[] args) {
		
		CD s=new CD();
		s.m1();

	}

}
