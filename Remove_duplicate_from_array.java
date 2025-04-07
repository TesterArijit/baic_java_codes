package infy_java;

public class Remove_duplicate_from_array {

	public static void main(String[] args) {
		int a[]= {1,1,2,2,3,4,5,6,6,7};
		int j=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j]=a[i+1];
				j++;
			}
		}
		System.out.println("Count :"+j);
		
		for(int i=0;i<j;i++)
		{
			System.out.print(a[i]+" ");
		}
		}

	}


