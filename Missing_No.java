package infy_java;

public class Missing_No {
	
// must be sequential.
	public static void main(String[] args) {
		int a[]= {1,2,4,5};
		
		int sum_given=0;
		int sum_all=0;
		
		for(int num:a)
		{
			sum_given=sum_given+num;
		}
		//need a range> here rangle is 1-5
		for(int i=1;i<=5;i++)
		{
			sum_all=sum_all+i;
		}
		System.out.println("Missing no is: "+(sum_all-sum_given));
			

	}

}
