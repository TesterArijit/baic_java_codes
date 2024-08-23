package Asignment_java;

public class Assignment02 {
	public void Addition()
	{
		int a=20,b=5;
		int c=a+b;
		System.out.println("The sum is: "+c);
	}
	public void Substraction()
	{
		int a=20,b=5;
		int c=a-b;
		System.out.println("The sub is: "+c);
	}
	
	public void Multiplication()
	{
		int a=20,b=5;
		int c=a*b;
		System.out.println("The mult is: "+c);
	}
	public void Division()
	{
		int a=20,b=5;
		int c=a/b;
		System.out.println("The div is: "+c);
	}
	public void Mod()
	{
		int a=20,b=5;
		int c=a%b;
		System.out.println("The mod is: "+c);
	}
	
	public static void main(String[] args) {
		Assignment02 p=new Assignment02();
		p.Addition();
		p.Substraction();
		p.Multiplication();
		p.Division();
		p.Mod();
		
	}

}
