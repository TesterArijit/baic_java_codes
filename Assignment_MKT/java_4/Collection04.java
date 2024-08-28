package Demo;
//HashSet 
//N--->>Allow(only One)
//I--->> xx
//D--->> xx
//H--->>Allow(homogenious+hetrogenious)
//I--->> xx
import java.util.HashSet;
public class Collection04 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(null);
		hs.add(null);
		hs.add(10);
		hs.add(50);
		hs.add(10);
		hs.add('c');
		hs.add("Hello");
		System.out.println(hs);//[null, 50, c, Hello, 10]
		
//	==========================
//	==========================
		
		System.out.println(hs.getClass());//class java.util.HashSet
		System.out.println(hs.remove(10));
		System.out.println(hs);//[null, 50, c, Hello]
		
		
		}

}
