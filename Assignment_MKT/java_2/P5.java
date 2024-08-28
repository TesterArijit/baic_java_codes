package test.one;
//public boolean equals(Object obj)
public class P5 {
	public boolean equals(Object obj) 
	{
		return true;
	}
	

	public static void main(String[] args) {
		
		P5 p1=new P5();
		System.out.println(p1); //test.one.P5@4517d9a3
		
		P5 p2=new P5();
		System.out.println(p2);//test.one.P5@372f7a8d
		
		System.out.println(p1.equals(p2));//true
		
		
	}

}
