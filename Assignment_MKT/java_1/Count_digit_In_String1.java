package basic01;

import java.util.Scanner;

public class Count_digit_In_String1 {

	public static void main(String[] args) {
		int count_digit=0;
   	Scanner	sc=new Scanner(System.in);
   	System.out.println("Enter the string");
   	String a=sc.next();
   	
   	char [] c= a.toCharArray();
   	for(int i=0;i<a.length();i++)
   	{
   		boolean ans=Character.isDigit(c[i]);
   		
   		if(ans==true)
   		{
   			count_digit++;
   		}
  	 }
   	System.out.println(count_digit);
	

	}

}
