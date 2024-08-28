package Assignment_MKT;

public class Ass_53_1_StringBuilder {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Hare");
		//modify String object by append method.
		s.append(" Ram ");
		System.out.println(s); //Hare Ram
		//Character at Specified Index.
		System.out.println(s.charAt(0)); //H
		//To findout the length
		System.out.println(s.length()); //9
		//To insert new String
		System.out.println(s.insert(9, "Govinda"));
		//to replace the String
		System.out.println(s.replace(9, 16, "Hare Krishna"));
		//To delete String
		System.out.println(s.delete(0, 4));
		//Find index of any char
		System.out.println(s.indexOf("r"));//2
		//Last Index of stringBuilder
		System.out.println(s.lastIndexOf("a"));
		// Find capaciyy
		System.out.println(s.capacity());
		//To find the String Builder empty or not,Return type=boolean
		System.out.println(s.isEmpty());
		//to find tostring
		System.out.println(s.toString());
		System.out.println(s.indexOf("K"));
		System.out.println(s.deleteCharAt(0));
		
			}

}
