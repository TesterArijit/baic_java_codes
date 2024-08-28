package basic01;

import java.util.Scanner;

public class Count_spaces_In_String {

	public static void main(String[] args) {
		Scanner	sc =new Scanner(System.in);
		System.out.println("Enter the string");
		int count_space=0;
		String s;
		s=sc.next();
		
		char c [] = s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			boolean ans = Character.isSpaceChar(c[i]);
			
			if(ans==true)
			{
				count_space++;
			}
		}
		System.out.println(count_space);
		
		
		
		
		
//		int count_space=0;
//		char [] c=s.toCharArray();
//		
//		for(int i=0;i<s.length();i++)
//		{
//			boolean ans=Character.isSpaceChar(c[i]);
//			
//			if(ans==true)
//			{
//				count_space++;
//			}
//		}
//		System.out.println(count_space);

	}

}
