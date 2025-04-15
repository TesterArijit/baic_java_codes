package infy_java;

import java.util.Scanner;

public class Count_alphabet_digit_specialchar_In_String1 {

	public static void main(String[] args) {
		int count_alphabet=0;
		int count_digit=0;
		int count_space=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String a = sc.next();
		char[] ch = a.toCharArray();
		
		for(int i=0;i<a.length();i++)
		{
			boolean ans=Character.isAlphabetic(ch[i]);
			if(ans)
			{
				count_alphabet++;
			}
		}
		System.out.println("the number of alphabet are :"+count_alphabet);
		
		for(int i=0;i<a.length();i++)
		{
			boolean ans1=Character.isDigit(ch[i]);
			if(ans1)
			{
				count_digit++;
			}
		}
		System.out.println("the number of digits are :"+count_digit);
		
		for(int i=0;i<a.length();i++)
		{
			boolean ans2=Character.isSpaceChar(ch[i]);
			if(ans2)
			{
				count_space++;
			}
		}
		System.out.println("the number of spaces are :"+count_space);
		sc.close();
		

	}

}
