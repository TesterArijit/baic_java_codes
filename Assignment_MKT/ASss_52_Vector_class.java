package Assignment_MKT;

import java.util.Enumeration;
import java.util.Vector;

public class ASss_52_Vector_class {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add("Hi");
		v.add(26);
		v.add(6);
		v.add(38);
		System.out.println("Elements of legacy vector class is :>> "+v);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		

	}

}
