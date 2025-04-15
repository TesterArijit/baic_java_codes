package infy_java;

public class Word_Count_In_String {
	
	public static void main(String[] args) {
		String s="selenium is auomation tool";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
