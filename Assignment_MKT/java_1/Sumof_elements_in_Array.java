package basic01;


public class Sumof_elements_in_Array {

	public static void main(String[] args) {

		int  [] a= {10,20,30,40,50};
		int sum=0;
		for(int number : a)
		{
			sum=sum+number;
			
		}
		System.out.println(sum);

	}

}
