package Assignment_MKT;

public class Ass_53_StringBuffer {

	public static void main(String[] args) {
		// append(); ------->> Add another string same as String concatination,concat
				StringBuffer s=new StringBuffer("Arijit");
				s.append(" Chatterjee");
				System.out.println(s);
				
				// insert(int offset, String s);
				StringBuffer s1=new StringBuffer("Bangalore");
				s1.append(" City");
				System.out.println(s1);
				// to insert any text into the specified position.
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
				
				
				
				StringBuffer p=new StringBuffer("Hare");
				//add /modify string
				p.append(" Krishna");
				System.out.println(p);
				
				// To find out the capacity, return type >> int
				System.out.println(p.capacity());
				
				//ensurecapacity, RT-void
				p.ensureCapacity(0);
				//To find out the length of the String
				System.out.println(p.length());
				//Lastindex
				System.out.println(p.lastIndexOf("r"));
				
				//To Reverse the String
				p.reverse();
				System.out.println(p);
				
				StringBuffer p1=new StringBuffer("Raja");
				p1.append(" Ram");
				System.out.println(p1);
				System.out.println(p1.replace(5, 8, "Dasarath"));
				
				
				
				
				
				
				
				
				

	}

}
