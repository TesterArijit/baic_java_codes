package Demo;
//Herirachial level inheritance concept using 5 classes

class Father{
	int cash=6000;
	public void Home()
	{
		System.out.println("Fathet have home");
	}
}
class Son1 extends Father{
	public void car()
	{
		System.out.println("Son1 have a car");
	}
}
class Son2 extends Father{
	public void Makeup()
	{
		System.out.println("Son2 love makeup");
	}
}
class Son3 extends Father{
	public void Girlfriend()
	{
		System.out.println("Son3 have Girlfriend");
	}
}
class Son4 extends Father{
	public void Sleep()
	{
		System.out.println("Son4 love sleeping");
	}
}
class Son5 extends Father{
	public void Disco()
	{
		System.out.println("Son5 love disco");
	}
}
public class Arijit  {
public static void main(String[] args) {
	// Son5 class type object
	Son5 s5=new Son5();
	s5.Home();
	System.out.println(s5.cash);
	// Son4 class type object
	Son4 s4=new Son4();
	s4.Home();
	System.out.println(s4.cash);
	// Son3 class type object
	Son3 s3=new Son3();
	s3.Home();
	System.out.println(s3.cash);
	// Son2 class type object
	Son2 s2=new Son2();
	s2.Home();
	System.out.println(s2.cash);
	// Son1 class type object
	Son1 s1=new Son1();
	s1.Home();
	System.out.println(s1.cash);
			
	}
}	
