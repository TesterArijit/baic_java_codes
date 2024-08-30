package Assignment_MKT;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class As_64_stack_Behaviour {

	public static void main(String[] args) {
		Stack<String> ll =new Stack<String>();
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
	}

}
