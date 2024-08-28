package basic01;

public class To_Char_Array1 {

	public static void main(String[] args) {
	String s="ARIJIT";
	char [] c= s.toCharArray();
//	for(char ele : c)
//	{
//		System.out.println(ele);
//	}
	for(int i=0;i<s.length();i++)
	{
		System.out.println(c[i]);
	}

	}

}
