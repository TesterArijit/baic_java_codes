package infy_java;

import java.util.HashSet;

public class DuplicaeElement_Using_HashSet {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,4,4,5,6};
		int count=0;
		boolean flag=false;
		
		HashSet h=new HashSet();
		
		for(int p:arr)
		{
			if(h.add(p)==false)
			{
				count++;
				flag=true;
				System.out.println("Duplicate element: "+p);
			}
			
		}
		System.out.println("No of duplicate: "+count);
		
		if(flag==false)
		{
			System.out.println("Duplicate not present");
		}
		

	}

}
