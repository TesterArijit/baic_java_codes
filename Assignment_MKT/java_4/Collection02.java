package Demo;
//removeALL()
import java.util.ArrayList;
public class Collection02 {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(12);
		a.add(3);
		a.add(40);
		System.out.println(a); // [1, 12, 3, 40]
		
		/////////////
		ArrayList a1=new ArrayList();
		a1.add(5);
		a1.add(2);
		a1.add(48);
		a1.add(8);
		System.out.println(a1); //[5, 2, 48, 8]
		//a.addAll(a1);
		
		//addAll to add the colection object elements just after the specified collection list
		
		//System.out.println(a);//[1, 12, 3, 40, 5, 2, 48, 8]
		a.addAll(2, a1);
		System.out.println(a); //[1, 12, 3, 40, 5, 2, 48, 8]
		
		
		
		
	}

}
