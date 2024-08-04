package Assignment_MKT;

public class This_calling_Statement {
	public This_calling_Statement()
	{
		this(5.85f);
		System.out.println("I am with zero parameter");
	}
	public This_calling_Statement(int a)
	{
		this();
		System.out.println("I am integer datatype");
	}
	public This_calling_Statement(float a)
	{
		this("Hi");
		System.out.println("I am float datatype");
	}
	public This_calling_Statement(String a)
	{
		System.out.println("I am String datatype");
	}

	public static void main(String[] args) {
		
		new This_calling_Statement(5);

	}

}
