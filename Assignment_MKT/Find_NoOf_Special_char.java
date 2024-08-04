package Assignment_MKT;

public class Find_NoOf_Special_char {

	public static void main(String[] args) {
		String a="java 1995 @@ ";
		int count_Alphabets=0;
		int count_Digits=0;
		int count_Spaces=0;
		
		char [] c= a.toCharArray();
		
		for(int i=0;i<a.length();i++)
		{
			boolean ans=Character.isAlphabetic(c[i]);
			if(ans==true)
			{
				count_Alphabets++;
			}
		}
		
		
		for(int i=0;i<a.length();i++)
		{
			boolean ans1=Character.isDigit(c[i]);
			if(ans1==true)
			{
				count_Digits++;
			}
		}
		for(int i=0;i<a.length();i++)
		{
			boolean ans2=Character.isSpaceChar(c[i]);
			if(ans2==true)
			{
				count_Spaces++;
			}
		}
		int Special_Char=a.length()-count_Alphabets-count_Digits-count_Spaces;
		
		System.out.println("Number of special character is :> "+Special_Char);
		
		
	}

}
