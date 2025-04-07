package infy_java;


public class Count_alphabet_digit_specialchar_In_String {

	public static void main(String[] args) {
		String a="Core java 1995";
		int count_alphabet=0;
		int count_digit=0;
		int count_space=0;
		// To find out the no of alphabets in a given String ...>>
		char [] c=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
		boolean ans=Character.isAlphabetic(c[i]);
		  
		   if(ans==true)
		   {
			   count_alphabet++;
		   }
			
		}
		System.out.println("the number of alphabet are := "+count_alphabet);
		
		// To find out the no of Numbers in a given String ...>>
		
		for(int i=0;i<a.length();i++)
		{
		boolean ans1=Character.isDigit(c[i]);
		  
		   if(ans1==true)
		   {
			   count_digit++;
		   }
			
		}
		System.out.println("the number of digits are := "+count_digit);
		
		// To find out the no of Spaces in a given String ...>>
		
		for(int i=0;i<a.length();i++)
		{
		boolean ans2=Character.isSpaceChar(c[i]);
		  
		   if(ans2==true)
		   {
			   count_space++;
		   }
			
		}
		System.out.println("the number of spaces are := "+count_space);
		}
}
