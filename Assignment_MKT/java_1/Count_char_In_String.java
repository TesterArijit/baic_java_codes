package basic01;

public class Count_char_In_String {
     
	public static void main(String[] args) {
		int count_alphabet=0;
		String a="india 1997";
		char [] c=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			boolean ans=Character.isAlphabetic(c[i]);
			
			if(ans==true)
			{
				count_alphabet++;
			}
						
		}
		System.out.println(count_alphabet);
		

		
		
	}

}
