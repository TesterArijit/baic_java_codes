package test.one;

public class S2 {

	public static void main(String[] args) {
		String a="Rupam";
		System.out.println(a.hashCode());//79325017
		a=a+" Rupali";
		System.out.println(a.hashCode());//-71942472
		//Duplicate is not allowed if we create Object without without new keyword.

	}

}
