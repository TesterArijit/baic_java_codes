package basic01;

public class Count_digit_In_String {

	public static void main(String[] args) {
		int count_digit=0;
		String s="arijit25 1991";
		char [] c= s.toCharArray();
		
		for(int i=0;i<s.length();i++)
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
