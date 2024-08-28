package Demo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
public class Generics01 {

	public static void main(String[] args) {
		ArrayList<Integer> aL=new ArrayList();
		aL.add(2);
		aL.add(10);
		aL.add(20);
		aL.add(10);
		aL.add(03);
		//aL.add("Hi");
		//aL.add('c');
		System.out.println(aL); //[2, 10, 20, 10, 3]
		Collections.sort(aL);
		System.out.println(aL); //[2, 3, 10, 10, 20]
		
		//////////////////
		
		LinkedList<Integer> LL=new LinkedList();
		LL.add(2);
		LL.add(5);
		LL.add(1);
		LL.add(10);
		LL.add(8);
		LL.add(6);
		System.out.println(LL);//[2, 5, 1, 10, 8, 6]
		Collections.sort(LL);
		System.out.println(LL); //[1, 2, 5, 6, 8, 10]
		
		
		
		
		

	}

}
