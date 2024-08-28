package Demo;
import java.util.PriorityQueue;
public class Collection03 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
		
		
		/////////////////
		
		PriorityQueue pq1=new PriorityQueue();
		pq1.add(80);
		pq1.add(20);
		pq1.add(30);
		pq1.add(90);
		System.out.println(pq1);
		
		
		

	}

}
