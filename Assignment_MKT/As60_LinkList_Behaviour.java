package Assignment_MKT;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class As60_LinkList_Behaviour {

	public static void main(String[] args) {
		LinkedList<String> ll =new LinkedList<String>();
		ll.add("Ram");
		ll.add("Sita");
		ll.add("Laxman");
		ll.add("Hanuman");
		ll.add("Ramayan");
		
		ListIterator<String> li =ll.listIterator();
		//Forward iteration---->>
		while(li.hasNext()) 
		{
			System.out.println(li.next());
		}
		System.out.println("========");
		//Backward iteration---->>
		while(li.hasPrevious()) 
		{
			System.out.println(li.previous());
		}
		System.out.println("====Using Iterator=====");
		
		Iterator<String> i=ll.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		//Behavior
		LinkedList ap=new LinkedList();
		ap.add(10);
		ap.add(10);
		ap.add(1);
		ap.add(null);
		ap.add(null);
		ap.add("Hola");
		ap.add('c');
		System.out.println(ap);
		// Follow indexing, order of insertion, allow duplicate and multiple null, 
		//allow heterogeneous
		//value, not auto sorted.
		LinkedList<Integer> a1=new LinkedList<Integer>();
		a1.add(10);
		a1.add(1);
		a1.add(22);
		a1.add(2);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
				
		}
	
}
