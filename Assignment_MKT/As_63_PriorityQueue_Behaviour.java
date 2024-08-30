package Assignment_MKT;

import java.util.Iterator;
import java.util.PriorityQueue;

public class As_63_PriorityQueue_Behaviour {

	public static void main(String[] args) {
		PriorityQueue<String> h=new PriorityQueue<String>();
		h.add("Ram");
		h.add("Sita");
		h.add("Laxman");
		h.add("Hanuman");
		h.add("Ramayan");
		
		Iterator<String> i=h.iterator();
		while(i.hasNext())
		{
			System.out.println("Forward iteration :>>"+i.next());
		}
	
	}

}
