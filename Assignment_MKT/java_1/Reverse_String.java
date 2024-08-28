package basic01;
// Reverse the String
public class Reverse_String {
	

	public static void main(String[] args) {
		String s ="ARIJIT";
		String rev="";
		System.out.println(s.length());
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev= rev+s.charAt(i);
		}
		System.out.println(rev);
		
		}

}
