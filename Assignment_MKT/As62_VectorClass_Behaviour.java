package Assignment_MKT;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
// Check Beheviour of Vector class and perform Iterator n ListOf iterator and Enumeration
import java.util.Vector;

public class As62_VectorClass_Behaviour {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(55);
		v.add(25);
		v.add(1);
		v.add(36);
		// Enumeration cursor--->>
		System.out.println("===========Enumeration cursor===========");
		Enumeration<Integer> e =v.elements();
		while(e.hasMoreElements())
		{
			System.out.println("Forward Iteration :>>"+e.nextElement());
		}
		System.out.println("===========ListIterator cursor===========");
		//ListIterator cursor--->>
		ListIterator<Integer> l =v.listIterator();
		while(l.hasNext())
		{
			System.out.println("Forward Iteration :>>"+l.next());
		}
		System.out.println("===========");
		while(l.hasPrevious())
		{
			System.out.println("Backward Iteration :>>"+l.previous());
		}
		System.out.println("===========Iterator cursor===========");
		//Iterator cursor--->>
		Iterator<Integer> i=v.iterator();
		while(i.hasNext())
		{
			System.out.println("Forward Iteration :>>"+i.next());
		}
		}

}
