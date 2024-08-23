package Asignment_java;

class Override1{
	public void display()
	{
		System.out.println("Display text");
	}
}
class Override2 extends Override1{
	public void display()
	{ super.display();
		System.out.println("Display image");
	}
}
public class super_keyword extends Override2 {
	public void display()
	{
		super.display();
		System.out.println("Display audio");
		
	}

	public static void main(String[] args) {
	super_keyword s=new super_keyword();
	s.display();

	}
}
