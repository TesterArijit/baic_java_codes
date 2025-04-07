package basic_java;

public class StringConcatination {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		String x = "hello";
		String y = "selenium";
		
		System.out.println(a+b);
		System.out.println(a+x);//100hello
		System.out.println(x+y);//helloselenium
		
		
		System.out.println(x+a+b+y);
		
		System.out.println(a+b+x+y);//300helloselenium
		
		System.out.println(x+y+a+b);//helloselenium100200
		System.out.println(x+y+(a+b));//helloselenium300
		
		System.out.println(a+x+b+y);//100hello200selenium
		
		double c = 12.33;
		double d = 22.33;
		
		System.out.println(c+d+x+y);//34.66helloselenium
		
		System.out.println(c+d+x+y+a+b);//34.66helloselenium100200
		
		System.out.println(c+d+x+y+(a+b));//34.66helloselenium300
		
		float f1 = 11.2f;
		float f2 = 32.3f;
		System.out.println(x+y+f1+f2);//helloselenium11.232.3
		System.out.println(x+y+(f1+f2));//helloselenium43.5
		
		char ch = 'a';
		System.out.println(x+ch);//helloa
		
		boolean flag = true;
		System.out.println(flag+x+y);//truehelloselenium
		
		
		int total = 1000;
		int fee = 200;
		System.out.println("your total bill is: "+ total);
		System.out.println("your total fee is: "+ fee);
		System.out.println("your final amount : " + (total+fee));
		
		
		//String p = "world";
		String mobile = "9876543212";
		System.out.println("mobile number is : " + mobile);
		
		System.out.println(10+20+30+"hello"+"world");//60hellojava
		System.out.println("hello"+"world"+10+20+30);//helloworld102030
		
		System.out.println(12.33+23.44+"hello"+"world"+(10+20+30));	//35.77helloworld60

	}

}
