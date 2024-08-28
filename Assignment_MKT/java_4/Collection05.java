package Demo;

import java.util.LinkedHashSet;

//LinkedHashSet
//N--->>Allow(only One)
//I--->> xx
//D--->> xx
//H--->>Allow(homogenious+hetrogenious)
//I--->> xx

public class Collection05 {

	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(null);
		lh.add(null);
		lh.add(20);
		lh.add(15);
		lh.add('c');
		lh.add("OnePlus");
		lh.add(15);
		
		System.out.println(lh);
		System.out.println();
		
	}

}
