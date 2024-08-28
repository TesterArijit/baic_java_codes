package basic01;
// AS-50, Write your age in byte datatype and convert it to short datatype

public class ASS_50_mkt {

	public static void main(String[] args) {
		byte age=30;
		short a=age;  // Upcasting --->> Implicitly
		System.out.println("The age is (Implicitly) : > "+a); 
		
		short a1=(short) a; // // Upcasting --->> Explicitly
		System.out.println("The age is (Explicitly) : > "+a); 
	
	}

}
