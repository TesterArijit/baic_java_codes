package Demo;

public class D3 {

	public static void main(String[] args) {
		System.out.println("Manin method Starts");
		String s=null;
		
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NPE Handled");
		}
		System.out.println("Manin method ends");

	}

}
