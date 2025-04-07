package infy_java;

public class Remove_Duplicate_Character_From_String {

	public static void main(String[] args) {
		String s="programming";
		
		StringBuilder sb =new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			int ind = s.indexOf(ch,i+1);
			
			if(ind==-1)
			{
				sb.append(ch);
			}
		}
		System.out.println(sb);

	}

}
