package Demo;
import java.util.TreeSet;
//TreeSet
//Null poin--->> xx
//Insertion order--->> xx
//Duplicate--->> xx
//Homo/hetro--->>Allow(homogenious only)
//Indexing--->> xx

public class TreeSet01 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		//t.add(null); ----->>null pointer exception.
		//t.add(null);
		t.add(10);
		t.add(10);
		t.add(40);
		//t.add("Hi");
		t.add(10);
		//t.add('c');  ----->>class cast exception.
		t.add(115);
		t.add(125);
		
		System.out.println(t);// [10, 40, 115, 125]
		

	}

}
