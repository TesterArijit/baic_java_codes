package basic01;

public class Thread_a {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t.getName());//main
		System.out.println(t.getId());//1
		System.out.println(t.getPriority());//5
		//Change Thread name.
		t.setName("Java21");
		System.out.println(t.getName());//Java21
		t.setPriority(8);
		System.out.println(t.getPriority());//8
	}

}
