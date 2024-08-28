package test.one;
// 1D Array
//Print the age of 5 students in a class by using 1D Array.
import java.util.Scanner;
public class Arr2 {

	public static void main(String[] args) {
		int[]a=new int[5];
	Scanner scan=new Scanner(System.in);
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter the age");
		a[i]=scan.nextInt();
	}
	System.out.println("The ages are");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
		
	}
	
		

	}

}
