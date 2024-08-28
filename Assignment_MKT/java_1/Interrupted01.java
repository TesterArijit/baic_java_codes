package basic01;

public class Interrupted01 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("Main ends");

	}

}
