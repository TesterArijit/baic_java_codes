package basic01;
// As-51   both Parent and child class has 2 nonstatic and 2 static methods.
//do up casting and down casting
class Grand1{
	public void Land()  // -------->> Non-static Method.
	{
		System.out.println("Grand parent have 10 acr land");
	}
	public void House() // -------->> Non-static Method.
	{
		System.out.println("Grand parent have 2 houses");
	}
	public static void Property() // -------->> static Method.
	{
		System.out.println("Grand parent have property");
	}
	public static void FarmHouse() // -------->> static Method.
	{
		System.out.println("Grand parent have FarmHouse ");
	}
	
}

public class ASS_51_mkt extends Grand1 {
	public void Job()
	{
		System.out.println("Parent have job");
	}
	public void Car()
	{
		System.out.println("Parent have car");
	}
	public static void Sleep()
	{
		System.out.println("Parent hate sleeping");
	}
	public static void Music()
	{
		System.out.println("Parent love music");
	}
	

	public static void main(String[] args) {
		System.out.println("Output Of Upcasting:>>");
		Grand1	ass1= new ASS_51_mkt();  // Upcasting
		ass1.House();
		FarmHouse();
		System.out.println("===========");
		System.out.println();
		System.out.println("Output Of Downcasting :>>");
		
		ASS_51_mkt	 P = (ASS_51_mkt) ass1;  //Downcasting
		Property();
		P.House();
		P.Land();
		P.Car();
		P.Job();
	}

}
