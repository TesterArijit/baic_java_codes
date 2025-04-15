package infy_java;

public class Remove_Space_in_string {
	
	public static void main(String[] args) {
		
		String s="java 2025  selenium  automation";
		System.out.println(s);
		s=s.replaceAll("\\s",""); // use replace all method and use "\\s", ""
		System.out.println(s);
		
	}
	
}
