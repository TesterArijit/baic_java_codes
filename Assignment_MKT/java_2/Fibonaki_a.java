package test.one;

public class Fibonaki_a {

	public static void main(String[] args) {
		int a=0;// 0 1 1 2 3
		int b=1;// 1 1 2 3 5
		//c    //  1 2 3 5 8
		//3+2=5,
		for(int i=0;i<=10;i++)
		{
			int c=a+b;
			System.out.print("  "+c);
			a=b;
			b=c;
			
					}
	
		
	}

}
