package Exception_1;

public class NullPointer01 {

	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(s.length()); // will not execute
			
		} catch (NullPointerException e) {
			System.out.println("Null ponter Exception handled"); // will execute
		}
	////////////
			
	}
	}
