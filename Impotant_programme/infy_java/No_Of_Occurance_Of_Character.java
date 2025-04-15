package infy_java;

public class No_Of_Occurance_Of_Character {

	public static void main(String[] args) {
		
		String s="java 2025  selenium  automation";
		int total_count = s.length();
		int without_a = s.replace("a", "").length();
		int count= total_count-without_a ;
		System.out.println(count);

	}

}
