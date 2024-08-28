package basic01;

class Bb0{
	Bb0(int a)
	{
		System.out.println("Country");
	}
}
class Cc0 extends Bb0{
	Cc0(double c)
	{super(5);
		System.out.println("Zone");
	}
}
class Dd0 extends Cc0{
	Dd0(String a)
	{super(10.5);
		System.out.println("Area");
	}
}
public class Super_calling extends Dd0 {
	Super_calling(int a,int b)
	{super("Hi");
		System.out.println("State");
	}
		public static void main(String[] args) {
		new Super_calling(2,4);

}
}
