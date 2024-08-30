package Assignment_MKT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Check Behavior of ArrayList class and check weather it follows  Iterator n ListOf iterator
public class As_59_Beheviour_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(12);
		al.add(1);
		al.add(25);
		al.add(4);
		al.add(66);
		// Following Iterator------>>Forward iteration
		Iterator<Integer> i =al.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
		
		System.out.println("==============");
		ListIterator<Integer> i1 =al.listIterator();
		
		
		System.out.println("==============");
		//Following ListIterator------->> Forward Iteration.
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	
	}

}
