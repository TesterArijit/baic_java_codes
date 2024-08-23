package Logical_operator;

public class Or_Operator {

	public static void main(String[] args) {
		int a=10,b=20;
		if(a>b || a==b)
		{
			System.out.println("First if condition");
		}
		if(a==b || b<a)
		{
			System.out.println("Second if condition");
		}
		else
		{
			System.out.println("Else block");
		}
		

	}

}
