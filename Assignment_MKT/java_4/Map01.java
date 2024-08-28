package Demo;
import java.util.HashMap;
import java.util.*;
public class Map01 {

	public static void main(String[] args) {
		HashMap<Integer,String> HM=new HashMap();
		HM.put(1,"ABC");
		HM.put(2,"ABC");
		HM.put(3,null);
		System.out.println(HM);//{1=ABC, 2=ABC, 3=null}
		
		///////////
		
		LinkedHashMap<Integer,String> L=new LinkedHashMap();
		L.put(2,"Hi");
		L.put(10,"Hi");// Aki index jodi null , String er hoi, null print hobe.
		L.put(9,"Hi");
		L.put(1,null);
		L.put(5,null);
		L.put(4,null);
		L.put(7,null);
		System.out.println(L);//{2=Hi, 10=Hi, 9=Hi, 1=null, 5=null, 4=null, 7=null}
		
		///////////
		
		TreeMap<Integer,Character> T=new TreeMap();
		//Completely Autoshorted based on key .
		T.put(1, 'a');
		T.put(5, null);
		T.put(2, 'a');
		T.put(8, 'a');
		T.put(6, 'f');
		System.out.println(T);//{1=a, 2=a, 5=null, 6=f, 8=a}
		
		
		/////////////////
		
		TreeMap<Integer,String> T1=new TreeMap();
		T1.put(2, "Hi");
		T1.put(4, "Hello");
		T1.put(6, "Bye");
		
		System.out.println(T1);//{2=Hi, 4=Hello, 6=Bye}
		
		
		

	}

}
