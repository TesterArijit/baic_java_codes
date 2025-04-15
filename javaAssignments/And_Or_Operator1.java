package javaAssignments;
//Assignment 1: Voter Eligibility
//Write a program to check if a person is eligible to vote:
//- The person should be 18 or older.
//- The person must be a citizen of the country.
//Use both & and && to show the difference in behavior.
public class And_Or_Operator1 {

	public static void main(String[] args) {
		int age=20;
		boolean isCitizen = true;
		if(age >= 18 && isCitizen) {
		System.out.println("Eligible to vote (&&)");
		} else {
		System.out.println("Not eligible to vote (&&)");
		}
		if(age >= 18 & isCitizen) {
		System.out.println("Eligible to vote (&)");
		} else {
		System.out.println("Not eligible to vote (&)");
		}
		

	}

}
