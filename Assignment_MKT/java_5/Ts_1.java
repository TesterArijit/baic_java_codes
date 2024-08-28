package Test_java;
import java.util.Scanner;
public class Ts_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int p=scan.nextInt();
		if(p%5==0)
		{
			System.out.println("Lucky!");
		}
		else
		{
			System.out.println("Un-Lucky!");
		}
				
	}

}
