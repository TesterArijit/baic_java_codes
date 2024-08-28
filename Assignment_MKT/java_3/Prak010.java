package com.jsp;
import java.util.*;
import java.util.Map.Entry;



public class Prak010  {

public static void main(String[] args) {
	HashMap <Integer,String> h =new HashMap();
	h.put(1, null);
	h.put(1, "AB");
	h.put(2, "ABC");
	h.put(3, "ABCD");
	
	System.out.println(h);
	
	for(Entry<Integer,String> i : h.entrySet())
	{
		System.out.println(i.getKey()+" : "+i.getValue());
	}
	
}
}
