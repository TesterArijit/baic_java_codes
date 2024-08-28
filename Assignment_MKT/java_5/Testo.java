package Test_java;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
public class Testo {

public static void main(String[] args) {
	LinkedHashMap<Integer,String> h =new LinkedHashMap<Integer,String>();
	h.put(1, null);
	h.put(2, null);
	h.put(3, "Hi");
	h.put(4, "Hello");
	h.put(5, "Hola");
	
	//System.out.println(h);
	for(Entry<Integer,String> ele:h.entrySet())
	{
		System.out.println(ele.getKey()+" : "+ele.getValue());
	}
	}
}
