package basic01;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator01 {

	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(44);
		
		Iterator i1 =al.iterator();
		System.out.println("Forward Ireration:-");
		while(i1.hasNext())  // Forward iteration.
		{
			System.out.println(i1.next());
		}

	}

}
