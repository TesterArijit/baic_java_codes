package Demo;

public class Str01 {
	

	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		System.out.println(s1.hashCode());//2301506
		System.out.println(s2.hashCode());//2301506
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s1));//true
		
	//	=========================================
		
		String s3="Java";
		String s4="JAVA";
		System.out.println(s3.hashCode());////2301506
		System.out.println(s4.hashCode());//2269730
		
		System.out.println(s3.equals(s4));//false
		System.out.println(s4.equalsIgnoreCase(s3));//true
		
		
		
		
		
		

	}

}
