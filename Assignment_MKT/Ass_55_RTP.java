package Assignment_MKT;

class Animal{
	 public void Sound()
	 {
		 System.out.println("Making Sound");
	 }
}
class Dog extends Animal{
	 public void Sound()
	 {
		 System.out.println("Making Sound as-Bhauuuu!");
	 }
}
class Cat extends Animal{
	 public void Sound()
	 {
		 System.out.println("Making Sound as-Meauuu!");
	 }
}
class Snake extends Animal{
	 public void Sound()
	 {
		 System.out.println("Making Sound as-zzzzzzzz!");
	 }
}
class SinglePoint{
	public static void SinglePointOfContact(Animal a)
	{
		a.Sound();
	}
}

public class Ass_55_RTP {
 
public static void main(String[] args) {
	Dog	d=new Dog();
	SinglePoint.SinglePointOfContact(d);
	Cat c=new Cat();
	SinglePoint.SinglePointOfContact(c);
	Snake s=new Snake();
	SinglePoint.SinglePointOfContact(s);
	 
		

	}

}
