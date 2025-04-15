package infy_java;

import java.util.Scanner;

public class Vowel_Count_In_String {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		for(int i=0;i<a.length();i++)
		{
			char ch = a.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
		}
		System.out.println("No of vowels are: "+count);
		sc.close();
					

	}		

}
