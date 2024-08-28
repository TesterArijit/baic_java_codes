package test.one;

public class Final_01 {
	 static final int r=8;
	 static final double pi=3.14d;
	public static void main(String[] args) {
		
		//pi=4.78d;//The final field Final_01.pi cannot be assigned
		double area=pi*r*r;
		
		System.out.println(area);
		
		
	}
}
