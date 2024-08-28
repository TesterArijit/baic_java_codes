package basic01;

public class String_Function1 {

	public static void main(String[] args) {
		String s="Bangalore";
		
		// Fo find out the length of the string
		System.out.println(s.length());//9
		
		//To convert lower case to all upper case
		System.out.println(s.toUpperCase()); // BANGALORE
		
		//To get the index of the specified character of the string
		System.out.println(s.charAt(1)); //a
		
		// To trim the extra space use trim function.No remove the middle space, only remove 
		// bigining and ending space.
		String a="  Core Java  ";
		System.out.println(a);
		System.out.println(a.trim());
		
		//To find out the index of the character for a given string.
		System.out.println(s.indexOf('a')); //1
		
		// To find out the substring 
		System.out.println(s.substring(2)); // ngalore
		
		// to compare the value of toString -->> equals method.
		String b="java";
		String c="Java";
		System.out.println(b.equals(c)); // false
		
		// equalsignorecase gives opposite result of euals method.
		System.out.println(b.equalsIgnoreCase(c)); // true 
		
		
		
		
		
		

	}

}
