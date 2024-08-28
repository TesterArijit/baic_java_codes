
package Test_java;



public class String002 {

	public static void main(String[] args) {
		
		StringBuffer b=new StringBuffer();
		//System.out.println(b.capacity());
		System.out.println(b.append("Java"));
		System.out.println(b.append("Javascripttfykufhj"));
		System.out.println(b.capacity());
		System.out.println(b.length());
		b.trimToSize();
		System.out.println(b.capacity());
		
		
		

	}

}
