package basic01;
class Whatsapp1 implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("Whatsapp Thread: "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	}
class Instagram1 extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Instagram Thread:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
}

public class Multi_Thread01 {

	public static void main(String[] args) {
		Whatsapp1 w=new Whatsapp1();
		Thread t1 =new Thread(w);
		t1.start();
		
	
		/////////////
		Instagram1 p=new Instagram1();
		Thread t2 =new Thread(p);
		t2.start();
			
		
	}

}
