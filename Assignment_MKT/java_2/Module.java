package test.one;
//Assignment 5-Write a program to find the area of a circle using a for loop 
//where radius is coming from
//math.random and pi is coming from math.pi.The loop has to execute 10 times.
public class Module {
	
	public static void main(String[] args) {
		//double r=10*Math.random();
		double pi=Math.PI;
		//double area=pi*r*r;
			for(int i=1;i<=10;i++)
		{
				double r=10*Math.random();
				double area=pi*r*r;
			System.out.println("The area of circle is :"+area);
		}
}
}



