package test.one;
//Upcasing & Downcasting
class Papa{
	public void salary()
	{
		System.out.println("Having salary!");
	}
}
class Pinku extends Papa{
	public void Party()
	{
		System.out.println("Having party!");
	}
}
class Pinki extends Papa{
	public void Movie()
	{
		System.out.println("Having Movie ticket!");
	}
}
public class Casting_01 {

	public static void main(String[] args) {
		
		Papa p=new Pinki();// Upcasting
		p.salary();
		Pinki s=(Pinki)p;
		s.Movie();
	}

}
