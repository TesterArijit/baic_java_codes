package Demo;
import java.util.ArrayList;
// removeAll , retailAll
public class Collection_a {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(null);
		al.add(10);
		al.add("Hello!");
		al.add('x');
		al.add(151);
		al.add(10);
		al.add(80);
		
		System.out.println(al);//[null, 10, Hello!, x, 151, 10, 80]
		
		ArrayList al1=new ArrayList();
		al1.add(null);
		al1.add(100);
		al1.add("Hello!");
		al1.add('x');
		al1.add(165);
		al1.add(1);
		al1.add(80);
		
		System.out.println(al1);//[null, 100, Hello!, x, 165, 1, 80]
		
//removeAll is used to remove the common element from collection 1 - Collection 2
		//al.removeAll(al1);
		//System.out.println(al);//[10, 151, 10]
		
//		al1.removeAll(al);
//		System.out.println(al1);//[100, 165, 1]
		
	//	retainAll is used to keep the common element b/w 2 collections.
		al.retainAll(al1);
		System.out.println(al);//[null, Hello!, x, 80]
		
		
		
	

	}

}
