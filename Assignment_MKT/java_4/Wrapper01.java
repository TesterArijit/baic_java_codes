package Demo;
import java.util.*;
public class Wrapper01 {

	public static void main(String[] args) {
		Integer a=new Integer(10); //Boxing ----->>Upcasting.
		System.out.println(a);
		int b=(int)a;
		System.out.println(b); //Unboxing ----->>Downcasting.
		
		//////////////
		Character c=new Character('s');
		System.out.println(c); //Boxing ----->>Upcasting.
		char d=(char)c;
		System.out.println(d);
		
		//////////////
		
		Float f=new Float(10.5);
		System.out.println(f); //Boxing ----->>Upcasting.
		
		float g=(float)f;  //Unboxing ----->>Downcasting.
		System.out.println(g);
		
		

	}

}
