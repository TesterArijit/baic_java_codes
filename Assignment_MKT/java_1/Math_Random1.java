package basic01;

public class Math_Random1 {
	
	public static final double pi=Math.PI;
	
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			double r=6*Math.random();
			double area=pi*r*r;
			double cir=2*pi*r;
			System.out.println("The area of circle is >> "+area);
			System.out.println("The circumference of circle is >>"+cir);
		}
		

	}

}
