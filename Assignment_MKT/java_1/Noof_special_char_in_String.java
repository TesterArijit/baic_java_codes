package basic01;

public class Noof_special_char_in_String {

	public static void main(String[] args) {
		String a="@Java 1995! ";
		char c[]=a.toCharArray();
		int count_alphabets=0;
		int count_digits=0;
		int count_spaces=0;
		
		for(int i=0;i<a.length();i++)
		{
			if(Character.isAlphabetic(c[i])==true)
			{
				count_alphabets++;
			}
			 if(Character.isDigit(c[i])==true)
			{
				 count_digits++;
			}
			 if(Character.isSpaceChar(c[i])==true)
			 {
				 count_spaces++;
			 }
		}
		int count_special=a.length()-count_alphabets-count_digits-count_spaces;
		System.out.println(count_special);

	}

}
