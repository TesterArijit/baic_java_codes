package Demo;
//import java.util.LinkedList;
import java.util.Stack;
//Slack
//N--->>Allow
//I--->> Allow
//D--->> Allow
//H--->>Allow(homogenious only+hetrogenious)
//I--->> Allow
public class Collection07 {

	public static void main(String[] args) {
		Stack s=new Stack();
		
//		s.add(null);
//		s.add(null);
//		s.add(10);
//		s.add(100);
//		s.add(10);
//		s.add("Hi");
//		s.add('d');
//		s.add(50);
//		System.out.println(s);//[null, null, 10, 100, 10, Hi, d, 50]
		
		
		s.push(null);
		s.push(null);
		s.push(120);
		s.push(120);
		s.push(100);
		s.push("wow");
		s.push('c');
		
		System.out.println(s);//[null, null, 120, 120, 100, wow, c]
		System.out.println(s.peek());//c
		// "pop" is used to remove the emement entering in last.
		s.pop();
		System.out.println(s);//[null, null, 120, 120, 100, wow]

	}

}
