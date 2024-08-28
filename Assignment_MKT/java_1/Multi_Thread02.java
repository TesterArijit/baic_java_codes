package basic01;

import java.util.Scanner;

class Addition extends Thread 
{
	public void run()
	{
		System.out.println("Addtion operaton starts !");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a =s.nextInt();
		System.out.println("Enter the second number");
		int b =s.nextInt();
		int c=a+b;
		System.out.println(c);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Char extends Thread
{
	public void run()
	{
		System.out.println("Character printing start!");
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Character printing ends!");
	}
}
class Number extends Thread
{
	public void run()
	{
		System.out.println("Number printing start!");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Number printing ends!");
	}
}

public class Multi_Thread02 {

	public static void main(String[] args) {
		Addition a=new Addition();
		Thread t1=new Thread(a);
		t1.start();
		/////////
		Char c=new Char();
		Thread t2=new Thread(c);
		t2.start();
		/////////
		Number n=new Number();
		Thread t3=new Thread(n);
		t3.start();
		
		

	}

}
