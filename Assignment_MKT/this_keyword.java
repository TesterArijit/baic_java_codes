package Asignment_java;

public class this_keyword {
	int age=10;
	String car="Maruti";
	double milage=78.54874;
	int price=5000;
	
	public void Clash(int age, String car,double milage,int price)
	{
		this.age=age;
		this.car=car;
		this.milage=milage;
		this.price=price;
		System.out.println("Hello world!");
		
	}

	public static void main(String[] args) {
	this_keyword t =new this_keyword();
	t.Clash(5, "Hola", 5.8678, 7874);
	System.out.println(t.age);
	System.out.println(t.car);
	System.out.println(t.milage);
	
	}

}
