package infy_java;



public class Min_Max_values_In_Array {

	public static void main(String[] args) {
		
		int a[]= {10,5,18,20,25};
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximun no is: "+max);  
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum no is: "+min);
	
	}

}
