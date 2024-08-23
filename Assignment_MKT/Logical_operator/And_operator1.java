package Logical_operator;

public class And_operator1 {

	public static void main(String[] args) {
		int age=19;
		char gender='M';
		if(age>=18 && gender=='M')
		{
			System.out.println("Full ticket");
		}
		if(age>=18 || gender=='F')
		{
			System.out.println("Statement-2");
		}
		if(!(age>=18 || gender=='F')) // not execute -->> using OR with NoT(!) operator
		{
			System.out.println("Statement-1"); // first inner bracket will execute
			//if it is true, then due to the ! opetator the result become false.
			//(!(true)) -->> false , (!(false)) --->> true
		}
		if(!((age>=18 && gender=='M')))//not execute -->> using And with NoT(!) operator
		{
			System.out.println("Statement-4");
		}

	}

}
