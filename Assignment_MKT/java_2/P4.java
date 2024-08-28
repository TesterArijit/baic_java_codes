package test.one;

public class P4 {
	
	public static void main(String[] args) {
		
		P4 p=new P4();
		System.out.println(p);//test.one.P4@4517d9a3
		
		P4 p1=new P4();
		System.out.println(p1);//test.one.P4@372f7a8d
		
		System.out.println(p.equals(p));//true
		System.out.println(p.equals(p1));//false

		

	}

}
