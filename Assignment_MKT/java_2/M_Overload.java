package test.one;
//Non-static overloading
public class M_Overload {
	
	public void Display()
	{
		System.out.println("O parameter");
	}
	public void Display(int a)
	{
		System.out.println("One parameter");
	}
	public void Display(int b, int c)
	{
		System.out.println("Two parameter");
	}
	public void Display(float f)
	{
		System.out.println("Float parameter");
	}

	public static void main(String[] args) {
		M_Overload m=new M_Overload();
		m.Display();
		m.Display(10);
		m.Display(20,30);
		m.Display(5.4f);
	}

}
