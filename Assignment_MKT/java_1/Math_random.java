package basic01;

public class Math_random {
	public static final double pi=Math.PI;
	public static double r=5*Math.random();
	
	public void Circle_Area()
	{
	    double area=pi*r*r;
	    System.out.println("Area of Circle is :>> "+area);
	}
	public void Circle_Circumference()
	{
		 double cir=2*pi*r;
		 System.out.println("Circumference of Circle is :>> "+cir);
	}

	public static void main(String[] args) {
		Math_random	m=new Math_random();
		m.Circle_Area();
		m.Circle_Circumference();

	}

}
