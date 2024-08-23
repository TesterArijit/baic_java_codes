package Logical_operator;

public class And_operator {

	public static void main(String[] args) {
		int age=19;
		char gender='M';
		if(age>=18 && gender=='M')
		{
			System.out.println("Full ticket");
		}
		else
		{
			System.out.println("Half ticket");
		}

	}
	// o/p--->>"Full ticket" , if we make gender=='F', then else block execute and
	// ans will be >> "Half ticket"

}
