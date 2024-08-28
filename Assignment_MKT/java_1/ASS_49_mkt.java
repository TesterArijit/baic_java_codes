package basic01;
// Assignment 49 WAP to handle the String Out Of Bound Exception using Exception Handling
public class ASS_49_mkt {

	public static void main(String[] args) {
		
		String a="arijit";
		try {
			System.out.println(a.charAt(8));
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
			
		}
	}

}
