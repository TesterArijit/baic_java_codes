package test.one;
//2D Array
import java.util.Scanner;
public class Arr_3 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int[][]a =new int[2][5];
		
//		a[0][3]=25;
//		System.out.println(a[0][0]);
//		System.out.println(a[0][1]);
//		System.out.println(a[0][2]);
//		System.out.println(a[0][3]);
//		
//		System.out.println(a.length);//2---->>Row numbers=2
//		System.out.println(a[1].length);//5---->>Column number=5, row 2 no have 5 column.
//		
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			
			System.out.println("Class of"+i+" , "+"Section "+j);
			a[i][j] =scan.nextInt();
			
		}
	}
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println("The ages are");
		for(int j=0;j<a[i].length;j++)
		{
			
			
			a[i][j] =scan.nextInt();
			
		}
	}
	}
}


