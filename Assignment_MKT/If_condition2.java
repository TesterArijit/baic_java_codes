package Assignment_MKT;
// "Assignment 15
//WAP on if condition 2 Genders Male and Female if Female travelling is free 
//if Male then less than equals to 12 then half ticket
//more than 12 till 59 then full ticket
//else more than 60 then senior citizen ticket"
import java.util.Scanner;

public class If_condition2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Gender(Male/Female)");
		String a=s.next();
		s.close();
//		String p="Female";
//		String p1="Male";
		if(a=="Female")
		{
			System.out.println("Travelling is free");
		}
		
		else if(a=="Male")
		{
			System.out.println("Enter the age");
			int age1=s.nextInt();
			if(age1<=12)
			{
				System.out.println("Travelling with half fare");
			}
			if(age1>12 && age1<=59)
			{
				System.out.println("Travelling with full fare");
			}
			else
			{
				System.out.println("Senior citizen ticket");
			}
		}
		
	}

}
