package test.one;

class Animal05{
	public void Resmika()
	{
		System.out.println("Bhabi-1");
	}
}
class Akash{
	public static void Watch_Akash(Animal05 a)
	{
		a.Resmika();
	}

}
class Rupam{
	public static void Watch_Rupam(Animal05 a1)
	{
		a1.Resmika();
	}
	}
public class Pass_Reference01 {

	public static void main(String[] args) {
		Animal05 Ani=new Animal05();
		Akash.Watch_Akash(Ani);
		Rupam.Watch_Rupam(Ani);
		Ani.Resmika();
		
		

	}

}
