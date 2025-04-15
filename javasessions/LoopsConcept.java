package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		//1. while:
				//1 to 10:
				
				int i = 1;
				while(i<=10) {
					System.out.println(i);//1234567..9
					i++;
					//++i;
					//i=i+1;
				}
				
				//
				while(true) {
					System.out.println("welcome to hotel Taj!");
					break;
				}
				System.out.println("hello world");
				
				System.out.println("-------------");
				//
				int t = 1;
				while(t<=10) {//T
					System.out.println(t);//12345
						if(t==5) {//T
							System.out.println("Hii");//Hii
							break;
						}
					t++;//5
					
				}
				
				System.out.println("-------------");
				
				
				int r = 1;
				while(r<=100) {
					System.out.println(r);//12345..10
						if(r % 5 == 0) {
							System.out.println("Hello!!");
						}
					r++;//6..10
				}
				
				System.out.println("-------------");

				int num = 1;
				while(num<=10) {//1
					if(num%2==0) {
						System.out.println(num + " is even number");
					}
					else {
						System.out.println(num + " is odd number");
					}
					num++;//2
				}
				
				System.out.println("-------------");
				
				int n = 1;
				while(n<=10) {//1
					if(n%2==1) {
						System.out.println(n + " is odd number");
					}
					n++;//2
				}
				
				System.out.println("-------------");

				byte total = 1;
				while(total <=5) {
					System.out.println(total);
					total++;
				}
				System.out.println("-------------");

				double index = 1.1;
				while(index<=5.5) {
					System.out.println(index);//1.1 2.1
					index++;
				}
				
				System.out.println("-------------");
				//a-z
				//a=97
				//b=98
				char ch = 'a';
				while(ch<='z') {
					System.out.println(ch+" = " + (byte)ch);//a = 97
					ch++;
				}
				
				System.out.println("-------------");

				//2. for loop:
				//1 to 10:
				for(int k = 1; k<=10; k++) {
					System.out.println(k);
				}
				
				
				System.out.println("-------------");
				int a = 1;
				for(;a<=10;) {
					System.out.println(a);//1
					a++;
				}
				
				System.out.println("-------------");

//				for(int k = 1; k<=10;) {
//					System.out.println(k);//111111.....111....111
//				}
				
				System.out.println("-------------");

				for(;;) {
					System.out.println("hello world!!");
					break;
				}
				
				System.out.println("-------------");

				for(int m=1; m<=10; m++) {
					if(m%2==0) {
						System.out.println(m);
					}
				}
				
				System.out.println("-------------");

				for(ch='A'; ch<='Z'; ch++) {
					System.out.println(ch);
				}
				
				//use cases for while loop:
				//when number of iterations are not fixed
				//infinite scrolling
				//calendar: 
				//webtable with pagination
				//wait for element on the page: 0 5 10 20 50
				//wait for page loading 2 5 8 10
				
				
				//use cases for for loop:
				//when number of iterations are fixed
				//with array, arraylist
				//month drop/ day drop
				//menu sub menu handing
				//footers

	}

}
