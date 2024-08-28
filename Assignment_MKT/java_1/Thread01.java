package basic01;
class Whatsapp implements Runnable
{

	@Override
	public void run() {
		System.out.println("Whats up!");
		
	}
	}
class Instagram extends Thread{
	public void run() {
		System.out.println("Instagram!");
		
	}
	
}

public class Thread01 {
public static void main(String[] args) {
	Whatsapp w=new Whatsapp();
	w.run();
//	Thread t1=new Thread();
//	t1.start();
	Instagram i=new Instagram();
	i.run();
//	Thread t2=new Thread();
//	t2.start();
	
}
}

