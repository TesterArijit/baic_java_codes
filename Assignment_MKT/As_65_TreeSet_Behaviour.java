package Assignment_MKT;

import java.util.Iterator;
import java.util.TreeSet;

public class As_65_TreeSet_Behaviour {

	public static void main(String[] args) {
		TreeSet<String> h=new TreeSet<String>();
		h.add("Ram");
		h.add("Sita");
		h.add("Laxman");
		h.add("Hanuman");
		h.add("Ramayan");
		
		Iterator<String> i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		TreeSet h1=new TreeSet();
		h1.add(10);
		h1.add(10);// do not allow duplicate
		//h1.add(null);------>>Null pointer Exception
		//h1.add("Hi");---->>class cast  exception
		//h1.add('c'); ---->>class cast  exception
		h1.add(1);
		h1.add(35);
		h1.add(22);
		System.out.println(h1); //Auto Sorted
		}
}
