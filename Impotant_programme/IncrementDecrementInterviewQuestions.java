package basic_java;

public class IncrementDecrementInterviewQuestions {

	public static void main(String[] args) {
//		int i = 11;
//		int j = i++ + ++i;
//
//		System.out.println(i);
//		System.out.println(j);
//
//		int a = 11;
//		int b = 22;
//
//		int c = a + b + a++ + b++ + ++a + ++b;
//
//		System.out.println(a);//13
//		System.out.println(b);//24
//		System.out.println(c);//103

//		int i = 0;
//		int j = i++ - --i + ++i - i--;
//		
//		
//		System.out.println(i);
//		System.out.println(j);

//		int i = 1, j = 2, k = 3;
//		int m = i-- - j-- - k--;
//
//		System.out.println(i);
//
//		System.out.println(j);
//
//		System.out.println(k);
//
//		System.out.println(m);

//		int a = 1, b = 2;
//		int c = --b - ++a + ++b - --a;
//
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);

		int m = 0, n = 0;

		int p = --m * --n * n-- * m--;

		System.out.println(p);
		System.out.println(m);
		System.out.println(n);
		
		
		double d = 1.5, D = 2.5;
		
		System.out.println(d++ + ++D);
		System.out.println(d);
		System.out.println(D);
		
//		int v = 10;
//		int b = -(++v);
//		System.out.println(v);
//		System.out.println(b);
		
//		byte b = 127;
//		int c = b++;
//		
//		System.out.println(c);
//		System.out.println(b);
//		
//		System.out.println(++b);
		

	}

}
