package javaAssignments;
//Assignment 2: Login Check
//Assume two boolean values:
//boolean isUsernameCorrect = true;
//boolean isPasswordCorrect = false;
//Use:
//- & and && to print whether login is successful or not.
//- | and || to explore the behavior when one of the credentials is correct.
public class And_Or_Operator2 {

	public static void main(String[] args) {
		boolean isUsernameCorrect = true;
		boolean isPasswordCorrect = false;
		if (isUsernameCorrect && isPasswordCorrect) {
		System.out.println("Login successful (&&)");
		} else {
		System.out.println("Login failed (&&)");
		}
		if (isUsernameCorrect & isPasswordCorrect) {
		System.out.println("Login successful (&)");
		} else {
		System.out.println("Login failed (&)");
		}
		if (isUsernameCorrect || isPasswordCorrect) {
		System.out.println("At least one credential is correct (||)");
		} else {
		System.out.println("Both credentials are incorrect (||)");
		}
		if (isUsernameCorrect | isPasswordCorrect) {
		System.out.println("At least one credential is correct (|)");
		} else {
		System.out.println("Both credentials are incorrect (|)");
		}

	}

}
