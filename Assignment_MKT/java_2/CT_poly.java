package test.one;
//CT  
class Animal1{
	public void sound()
	{
		System.out.println("Making Sound!");
	}
}
class Dog1 extends Animal1
{
	public void sound()
	{
		System.out.println("Making Sound-Bhauuu Bhauuu");
	}
}
class Cat1 extends Animal1
{
	public void sound()
	{
		System.out.println("Making Sound-Meauuu");
	}
}
class Snake1 extends Animal1
{
	public void sound()
	{
		System.out.println("Making Sound-zzzzzzz!!!");
	}
}
class Singlepoint_of_Contact{
	
	public static void Singlepoint(Animal1 a)
	{
		a.sound();
	}
	
}

public class CT_poly {

	public static void main(String[] args) {
		//Animal1 an=new Animal1();
		Dog1 d=new Dog1();
		Singlepoint_of_Contact.Singlepoint(d);
		Cat1 c=new Cat1();
		Singlepoint_of_Contact.Singlepoint(c);
		Snake1 s=new Snake1();
		Singlepoint_of_Contact.Singlepoint(s);
		
		
		
		
		
		

	}

}
