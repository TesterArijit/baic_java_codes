package test.one;

public class P2 extends Object {
	//extends Object --- is not mandetory to mention.
	public String toString()
	{
		return "jaa!";
	}

	public static void main(String[] args) {
		 P2 p=new P2();
		 System.out.println(p);// implicitly come , print the obj address
		 P2 p2=new P2();
		 System.out.println(p2.toString());//explicitly come.
		 
		

	}

}
