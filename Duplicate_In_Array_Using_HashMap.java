package infy_java;

import java.util.HashMap;
import java.util.Map.Entry;

public class Duplicate_In_Array_Using_HashMap {
	public static void main(String[] args) {
		int a[]= {1,2,2,3,3,4,4,5,6};
		
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int Key=a[i];
			if(h.containsKey(Key))
			{
				int Value=h.get(Key);
				h.put(Key, Value+1);
			}
			else
			{
				h.put(Key,1);
			}
		}
		for(Entry<Integer, Integer> e: h.entrySet())
		{
			int v = e.getValue();
			if(v>1)
			{
				System.out.println(e.getKey());
			}
		}

	}
}

	
