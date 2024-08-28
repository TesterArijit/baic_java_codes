package Test_java;
class Movie{
	public void Reshmika()
	{
		System.out.println("Bhabi");
	}
}
class Akash {
	public static void Watch_Akash( Movie m1)
	{
		m1.Reshmika();
	}
}
class Rupam  {
	public static void Watch_Rupam(Movie m2)
	{
		m2.Reshmika();
	}
}
public class Two {
	

public static void main(String[] args) {
	Movie m=new Movie();
	
	Rupam.Watch_Rupam(m);
	Akash.Watch_Akash(m);
	m.Reshmika();
	
		
	}

}
