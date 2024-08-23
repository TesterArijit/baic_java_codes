package Split_methos_String;

import java.util.Arrays;

public class Split_Method {

	public static void main(String[] args) {
		String a="Gour Gopal Das";
		String [] name= a.split(" "); // return type String []
		System.out.println(Arrays.toString(name)); //[Gour, Gopal, Das]
		
		
		String b="Atul Kumar Dey";
		String[] name1=b.split(" ", 3);
		System.out.println(Arrays.toString(name1)); //[Atul, Kumar, Dey]
		
		
		String b1="Moloy Kumar Dey";
		String[] name2=b1.split(" ", 2);
		System.out.println(Arrays.toString(name2)); // [Moloy, Kumar Dey]
	}

}
