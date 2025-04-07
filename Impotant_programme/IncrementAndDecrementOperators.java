package basic_java;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		//++ and --
		
				//1. post increment: ++
				int a = 1;
				int b = a++;
				
				System.out.println(a);//2
				System.out.println(b);//1
				
				int m = -99;
				int n = m++;
				System.out.println(m);
				System.out.println(n);
				
				int p = 10;
				System.out.println(p++);//10
				System.out.println(p);//11
				
				//2. pre increment: ++
				int c = 1;
				int d = ++c;
				System.out.println(c);//2
				System.out.println(d);//2
				
				int a1 = -999;
				int a2 = ++a1;
				System.out.println(a1);//-998
				System.out.println(a2);//-998
				
				int total = 10;
				System.out.println(++total);//1
				System.out.println(total);//1
				
				
				//3. post decrement: --
				int g = 2;
				int h = g--;
				System.out.println(g);
				System.out.println(h);
				
				//4. pre decrement: --
				int x = 2;
				int y = --x;
				System.out.println(x);
				System.out.println(y);
				
				int bill = 200;
				System.out.println(--bill);//199
				System.out.println(bill);//199

	}

}
