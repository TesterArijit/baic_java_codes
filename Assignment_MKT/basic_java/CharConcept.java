package basic_java;

public class CharConcept {

	public static void main(String[] args) {
		//ASCII: characters: value: universal 
				//unicode : 16000 : ASCII table
				
				//a-z: 97 to 122
				//A-Z: 65 to 90
				//0-9: 48 to 57
				
				char ch = 'a';
				char bh = 'b';
				
				System.out.println(ch+bh);//97+98=195
				
				System.out.println(ch);//a
				
				System.out.println(ch-bh);//97-98=-1
				
				System.out.println(ch/2);//97/2

				System.out.println('a'+'A');//97+65=162
				
				System.out.println('$'+'a');//36+97=133
				
				System.out.println(' '+1);//32+1=33
				
				System.out.println("hello"+"world"+ch+bh);//helloworldab
				System.out.println("hello"+"world"+(ch+bh));//helloworld195

				char th = ' ';
				System.out.println(th+0);//32
				
				char yh = 'a';//97
				System.out.println((byte)yh);
//				System.out.println((short)yh);
//				System.out.println((int)yh);
//				System.out.println((long)yh);
				

				char rh = 'a';
				char ph = 'b';
				int er = 100;
				System.out.println(rh+ph+er);//97+98+100=295
				
				System.out.println((char)97);
				System.out.println((char)45);
				System.out.println((char)16009991);
				
				System.out.println((char)32);
				
				System.out.println((char)97 + (char)98);//'a'+'b'=97+98=195
				
				System.out.println((char)97 + (char)98);//'a'+'b'-->additon
				
				System.out.println('a'+" "+'b');//a b
				
				System.out.println((char)0);//nothing
				
				
				int k = 'a';
				System.out.println(k);//97
				System.out.println((char)k);//int-->char: 97-->a
				
				float f1 = 'a';//97
				System.out.println(f1);//97.0
				
				
				String name = "tom";
				
				System.out.println("naveen");
				
				System.out.println("my name is " + name);
				
				System.out.println('a' + "" +'b');//ab
				
				System.out.println('a'+" "+'b' + ('a'+'b'));
				
				
				char m = 'a';
				System.out.println(m+0);
				System.out.println((byte)m);
				
				//""+anything ---> concat
				//num+num --> addition
				//char + char --> addition
				//char +"" --> concat
				//""+"" --> concat

	}

}
