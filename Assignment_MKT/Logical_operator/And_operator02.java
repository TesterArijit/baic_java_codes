package Logical_operator;
// Find largest and smallest among 3 numbers.
public class And_operator02 {

	public static void main(String[] args) {
		int a=10,b=15,c=25;
		if(a>b && a>c)
		{
			System.out.println(a+ "is largest");
		}
		if(a<b && a<c)
		{
			System.out.println(a+" is smallest");
		}
		if(b>a && b>c)
		{
			System.out.println(b+ "is largest");
		}
		if(b<a && b<c)
		{
			System.out.println(b+ "is  smallest");
		}
		if(c>a && c>b)
		{
			System.out.println(c+" is largest");
		}
		if(c<a && c<b)
		{
			System.out.println(c+ "is smallest");
		}
		
		
		
	}

}
