package infy_java;

public class Duplicate_element_In_array {

	public static void main(String[] args) {
		int a[]= {1,2,5,2,6,8};
		int count=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					System.out.println("Duplicate present in inex of :"+a[i]);
					flag=true;
				}
				
			}
		}
		System.out.println("No of duplicate is: "+count);

	}

}
