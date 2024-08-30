package Assignment_MKT;

import java.util.ArrayList;
import java.util.ListIterator;

public class As_59_Beheviour_ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Hi");
		al.add("Hello");
		al.add("Tata");
		al.add("Bye");
		ListIterator i=al.listIterator();
		// Forward iteration ---->>
		System.out.println("========");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		// Backward iteration ---->>
		System.out.println("========");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		//Behavior---->>
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10);
		a.add(1);
		a.add(null);
		a.add(null);
		a.add("Hope");
		a.add('c');
		System.out.println(a);
		// Follow indexing, order of insertion, allow duplicate and multiple null, 
		//allow heterogeneous
		//value, not auto sorted.
		

	}

}
