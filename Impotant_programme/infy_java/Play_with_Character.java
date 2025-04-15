package infy_java;

public class Play_with_Character {

	public static void main(String[] args) {
		
		char ph='a';
		char hp='b';
		System.out.println(ph);
		System.out.println(ph+hp);//97+98=195--> asci values of a and b.
		System.out.println((char)99);//c
		System.out.println((byte)'d');//100
		
		byte k='a';
		System.out.println(k);//97
		
		String a="hello";
		String b="selenium";
		byte x=10;
		byte y=20;
		System.out.println(a+b+x+y);//helloselenium1020
		System.out.println(x+y+a);//30hello
		System.out.println(a+b+(x+y));//helloselenium30
		
		char th=' ';//space
		System.out.println((byte)th);//32
		System.out.println(th); //nothing will display
		
		//Ascii value find out of any character--->> way1
		char pt='e';
		System.out.println(pt+0);//101
		//Ascii value find out of any character--->> way2
		System.out.println((byte)pt);//101
		
		char m1='a';
		char m2='b';
		System.out.println((byte)m1+""+(byte)m2);//9798--> char+string+char=concatination
		
		System.out.println((byte)m1+(byte)m2); //97+98=195--> asci values of a and b.
		
		System.out.println((byte)m1+' '+(byte)m2);//97+32+98=227
		System.out.println((byte)m1+""+' '+(byte)m2);//97 98 
		System.out.println('a'+""+'b'+('a'+'b')); //ab195
		
		
		

	}

}
