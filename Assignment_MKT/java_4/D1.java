package Demo;

import java.util.Iterator;

public class D1 {

	public static void main(String[] args) {
		
		String [] s= {"A","AB","ABC","ABCD"};
		
//		for(int i=0;i<s.length;i++)
//		{
//			System.out.println(s[i]);
//		}
		
		//Using for each llop getting same O/p
		
		for(String ele:s)
		{
			System.out.println(ele);  
		}
//		A
//		AB
//		ABC
//		ABCD

		int[]a={1,12,123,1234};
		
		for(int ele1:a)
		{
			System.out.println(ele1);
		}
//		1
//		12
//		123
//		1234

	}

}
