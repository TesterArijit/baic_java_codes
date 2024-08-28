package test.one;

public class Pass_Reference {
	int x=50;
	public static void m1(Pass_Reference pass)
	{
		System.out.println(pass.x);
	}

	public static void main(String[] args) {
	Pass_Reference p1=new Pass_Reference();
	
		m1(p1);
		

	}

}
