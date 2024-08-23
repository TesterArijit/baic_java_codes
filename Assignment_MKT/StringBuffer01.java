package StringBuilder_StringBuffer;

public class StringBuffer01 {

	public static void main(String[] args) {
		// append(); ------->> Add another string same as String concatination,concat
		StringBuffer s=new StringBuffer("Arijit");
		s.append(" Chatterjee");
		System.out.println(s);
		
		// insert(int offset, String s);
		StringBuffer s1=new StringBuffer("Bangalore");
		s1.append(" City");
		System.out.println(s1);
		s1.insert(9, " is a");
		System.out.println(s1);
		
		//delete(starting index, ending index);
		StringBuffer s2=new StringBuffer("Manish Tiwari");
		System.out.println(s2.delete(0, 7));
		
		//deleteCharAt(char index);
		System.out.println(s2.deleteCharAt(2));
		
		//subString(int Starting)
		StringBuffer s3=new StringBuffer("Amit Kumer Dey");
		System.out.println(s3.substring(4)); // Kumer Dey
		//subString(int Starting, int ending index)
		System.out.println(s3.substring(5, 10));
		
		
		
		
		
		
		
		
		

	}

}
