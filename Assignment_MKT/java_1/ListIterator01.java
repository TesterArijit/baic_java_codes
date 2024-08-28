package basic01;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator01 {

	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(44);
		
		ListIterator Li = al.listIterator();
		System.out.println("Forward Iteration");
		
		while(Li.hasNext())
		{
			System.out.println(Li.next());
		}
		System.out.println("Backword Iteration");
		
		while(Li.hasPrevious())
		{
			System.out.println(Li.previous());
		}
		
		
	}

}
