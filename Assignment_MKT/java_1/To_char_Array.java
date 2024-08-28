package basic01;

import java.util.Arrays;

public class To_char_Array {

	public static void main(String[] args) {
		
		String s="pooja";
		char [] c= s.toCharArray();
		System.out.println(Arrays.toString(c));  // [p, o, o, j, a]
		
		String a="KV NO 1";
		char [] c1= a.toCharArray();
		boolean ans=Character.isAlphabetic(c1[0]);
		System.out.println(ans); // true
		boolean ans1=Character.isAlphabetic(c1[2]);
		System.out.println(ans1);
		
		
		

	}

}
