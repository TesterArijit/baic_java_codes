package test.one;

public class S3 {

	public static void main(String[] args) {
		String a=new String("Hello");
		String a1=new String("Hello");
		System.out.println(a.equals(a1));//true
		System.out.println(a1.equals(a));//true
		// ===============
		System.out.println(a.hashCode());//69609650
		System.out.println(a1.hashCode());//69609650
		//=================
		String a3=new String("Amazon");
		System.out.println(a3.hashCode());//1964569124
		String a4=new String("Flipkart");
		System.out.println(a4.hashCode());//1916568613
		
		

	}

}
