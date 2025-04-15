package javasessions;

public class ANDOROperators {

	public static void main(String[] args) {
		//AND: & &&(short circuit Operator)
				//OR: | ||
				
				boolean c1 = true;
				boolean c2 = false;
				boolean c3 = false;
				boolean c4 = true;

				if(c1 & c2 & c3 & c4) {//t & f & f & t  ==> f
					System.out.println("hello Selenium");
				}
				else {
					System.out.println("bye selenium");
				}
				
				System.out.println("-------");
				
				if(c1 && c2 && c3 && c4) {//t && t && f  ==>f
					System.out.println("hello java");
				}
				else {
					System.out.println("bye java");
				}
				
				System.out.println("----------");
				
				if(c1 | c2 | c3 | c4) {//f | t | f | t ==>t
					System.out.println("hii python");
				}
				else {
					System.out.println("bye python");
				}
				
				System.out.println("----------");

				if(c1 || c2 || c3 || c4) {//f || t => t
					System.out.println("hii naveen");
				}
				else {
					System.out.println("bye naveen");
				}
				
				//three variables: with three different values:
				//find out the max value
				int a = 500;
				int b = 400;
				int c = 600;
				
				if(a>b && a>c) {//t && f ==> f
					System.out.println("a is the greatest");
				}
				else if(b>c) {//f
					System.out.println("b is the greatest");
				}
				else {
					System.out.println("c is the greatest");
				}
				
				
				System.out.println('d'+3);

	}

}
