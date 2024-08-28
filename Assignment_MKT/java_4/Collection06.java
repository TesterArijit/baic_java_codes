package Demo;

import java.util.Vector;

//Vector
//N--->>Allow
//I--->> Allow
//D--->> Allow
//H--->>Allow(homogenious+hetrogenious)
//I--->> Allow
public class Collection06 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(null);
		v.add(null);
		v.add(100);
		v.add(50);
		v.add('c');
		v.add("Sheela");
		v.add(50);
		v.add(2);
		
		System.out.println(v);//[null, null, 100, 50, c, Sheela, 50, 2]
		System.out.println(v.get(2));//100
		System.out.println(v.contains('c'));//true
		System.out.println(v.size());//8
				

	}

}
