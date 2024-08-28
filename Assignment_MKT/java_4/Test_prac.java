package Demo;
import java.util.Scanner;
public class Test_prac {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input1");
		int a=scan.nextInt();
		System.out.println("Enter the input2");
		int b=scan.nextInt();
		System.out.println("Enter the value");
		int value=scan.nextInt();
		switch (value) {
		case 1:{
			System.out.println("The sum is:- "+(a+b));
				break;
		}
		case 2:{
			System.out.println("The sub is:- "+(a-b));
				break;
		}
		case 3:{
			System.out.println("The sum is:- "+(a*b));
				break;
		}
		case 4:{
			System.out.println("The sum is:- "+(a/b));
				break;
		}
		case 5:{
			System.out.println("The sum is:- "+(a%b));
				break;
		}
		default:{
			System.out.println("Invalid input!");
		}

		
		}
	}
}
			
		
			
		
		
		
		
		
		

	


