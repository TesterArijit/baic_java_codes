package Assignment_MKT;
import java.util.Collections;
// Check Behavior of HashSet class and check weather it perform Iterator or ListofIterator
import java.util.HashSet;
import java.util.Iterator;


public class As61_HashSet_Behaviour {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
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
		
		HashSet<Integer> a1=new HashSet<Integer>();
		a1.add(10);
		a1.add(1);
		a1.add(22);
		a1.add(2);
		System.out.println(a1);
		
		for(Object ele:a1)
		{
			System.out.println(ele);
		}
		}

}
