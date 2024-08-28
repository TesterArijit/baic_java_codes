package Demo;
import java.util.ArrayList;
public class Collection01 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(null);
		al.add(50);
		al.add(30);
		al.add(40);
		al.add(100);
		
		
		System.out.println(al); //[null, 50, 30, 40, 100]
		//al.remove(2);
		Object o=100;
		al.remove(o);
		System.out.println(al); //[null, 50, 30, 40]
		
		al.add(3, 455);
		System.out.println(al); // [null, 50, 30, 455, 40]
		//System.out.println(al.size());
		
		/////////
		
		ArrayList al1=new ArrayList();
		al1.add("Hi");
		al1.add('s');
		al1.add(125);
		
		
		System.out.println(al1);
		System.out.println(al1.get(0));
		
		
		
		al.addAll(al1);
		//System.out.println(al);
		
		
		
		
		
		
	}

}
