package test.one;

public class S4 {

	public static void main(String[] args) {
		
		String a="Qspiders";
		System.out.println(a.charAt(2));//p
		//=================
		System.out.println(a.toLowerCase());//qspiders
		//=================
		System.out.println(a.toUpperCase());//QSPIDERS
		//=================
		System.out.println(a.substring(1, 5));//spid
		//=================
		System.out.println(a.substring(2));//piders
		//=================
		System.out.println(a.concat(" Jspider"));//Qspiders Jspider
		//=================
		System.out.println(a.contains("spider"));//true
		//=================
		System.out.println(a.startsWith("Qspi"));//true
		//=================
		System.out.println(a.startsWith("Qsi"));//false
		//=================
		System.out.println(a.endsWith("ders"));//true
		//=================
		System.out.println(a.endsWith("deoos"));//false
		//=================
		a=a+" Hello";
		System.out.println(a.length());//14
		System.out.println(a.replace("Hello", "Bolo"));//Qspiders Bolo
		//=================
		char[] b=a.toCharArray();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}
		
//		Q
//		s
//		p
//		i
//		d
//		e
//		r
//		s
//		 
//		H
//		e
//		l
//		l
//		o
		
		

		
		
		
		
		
		
		
		
		

		
	}

}
