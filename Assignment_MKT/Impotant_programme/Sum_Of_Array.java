package com.basic.Impotant_programme;

public class Sum_Of_Array {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50};
		int sum=0;
		for(int number : a)
		{
			sum=sum+number;
		}
		System.out.println(sum);

	}

}
// Logic-->>
//    sum   number  sum=sum+number
 //    0       10   10=0+10
//     10      20    30=10+20
//     30      30     60=30+30
//     60      40     100=60+40
//     100     50     150=100+50
// O/P -->> 150

