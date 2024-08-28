package test.one;

public class Ex0 {

	public static void main(String[] args) {
		System.out.println("Main starts");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			System.out.println("Handled in main()");
		}
		System.out.println("Main ends");
		

	}

}
