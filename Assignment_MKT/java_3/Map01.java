package com.jsp;
import java.util.HashMap;
import java.util.Map.Entry;
public class Map01 {

	public static void main(String[] args) 
	{
		int key = 0;
		int[]a={1,1,2,2,2,3,4,4};
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			 key = a[i];
		}
		
		if(h.containsKey(key))
		{
			int Value=h.get(key);
			h.put(key,Value+1);
		}
		else
		{
			h.put(key,1);
		}
		for(Entry<Integer,Integer> e : h.entrySet())
		{
			System.out.println(e.getKey();
		}
		
		

	}

}
