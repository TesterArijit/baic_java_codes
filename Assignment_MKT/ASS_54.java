package Assignment_MKT;

public class ASS_54 {

	public void Person(String a)
	{
		System.out.println("Acts as a Child");
	}
	public void Person(String a,String b)
	{
		System.out.println("Acts as a Father");
	}
	public void Person(String a,String b,String c)
	{
		System.out.println("Acts as a Friend");
	}
	public void Person(String a,String b,String c,String d)
	{
		System.out.println("Acts as a Chairman");
	}
		
	public static void main(String[] args) {
		ASS_54 a =new ASS_54();
		a.Person("For parents");
		a.Person("Kid1", "Kid2");
		a.Person("Rahul", "Raja","Hari");
		a.Person("com1", "com2", "com3","com4");
	
	}

}
