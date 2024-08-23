package Math_class;



public class Math01 {

	public static void main(String[] args) {
		System.out.println(Math.addExact(50, 120));// int,int
		System.out.println(Math.addExact(458745854545l, 7458965565477l));//long, long
		// [add exact method is ovrloaded]
		
		System.out.println(Math.subtractExact(100, -900));//int,int
		System.out.println(Math.subtractExact(78574589658l, 45874589l));//long,long
		
		System.out.println(Math.multiplyExact(785, 54));//int,int
		System.out.println(Math.multiplyExact(78787878787l, 784574));//long,int
		System.out.println(Math.multiplyExact(7875121247l, 45452361l));//long,long
		
		System.out.println(Math.divideExact(48, 7)); // int-int ==6
		System.out.println(Math.divideExact(4587458547l, 2551111111l)); //long-long ==1
		
		// PI is a static-final variable.
		System.out.println(Math.PI); // To get the exact pi value --> 3.141592653589793
		
		//To get random number always, return type double
		System.out.println(Math.random());
		// To convert negative value into positive absolute method used.
		System.out.println(Math.abs(-85));//int == 85
		System.out.println(Math.abs(-8745896584l)); // long == 8745896584
		System.out.println(Math.abs(-5.487f));// float == 5.487
		System.out.println(Math.abs(-785.4589645478)); //double == 785.4589645478
		
		// To find out the max value b/w two number
		System.out.println(Math.max(458, 49)); // int , int == 458
		System.out.println(Math.max(7845121244l, 1212121212l)); // long, long == 7845121244
		System.out.println(Math.max(15.48, 783.87)); // float, float
		System.out.println(Math.max(487.58745998, 9987458.487)); 
		
		// To find out the min value b/w two number
		
		System.out.println(Math.min(45, 20)); // int, int ==20
		// same as max method min method have 4 types (int-int, long-long, float-float, double-double)
		
		
	}

}
