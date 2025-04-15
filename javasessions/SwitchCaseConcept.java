package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String browser = "chrome";

		switch (browser.toLowerCase().trim()) {//chrme
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "opera":
			System.out.println("launch opera");
			break;

		default:
			System.out.println("plz pass the right browser...chrome/firefox/edge/safari/");
			break;
			
		case "brave":
			System.out.println("launch brave");
			break;	
			

		}
		
		
		System.out.println("-------------");
		//1 to 7:
		int days = 10;
		
		switch (days) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thu");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;

		default:
			System.out.println("plz pass the right day number....");
			break;
		}
		
		
		System.out.println("-------------");
		//byte, short, int : allowed in switch
		//long: is not allowed
//		long test = 10;
//		
//		switch (test) {
//		case 1:
//			
//			break;
//
//		default:
//			break;
//		}
		
		System.out.println("-------------");
		//float, double:  not allowed
//		double bmi = 15.55;
//		
//		switch (bmi) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		System.out.println("-------------");

//		boolean flag = true;
//		//true/false: not allowed
//		switch (flag) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		
		System.out.println("-------------");
		//vowels: a e i o u
		char ch = 'a';
				
		//char to String:
		String alpha = String.valueOf(ch);//'Z'-->"Z"
		
		switch (alpha.toLowerCase()) {//"z"
		case "a":
			System.out.println(ch +" is a vowel");
			break;
		case "e":
			System.out.println(ch +" is a vowel");
			break;
		case "i":
			System.out.println(ch +" is a vowel");
			break;
		case "o":
			System.out.println(ch +" is a vowel");
			break;
		case "u":
			System.out.println(ch +" is a vowel");
			break;

		default:
			System.out.println(ch + " is a consonant");
			break;
		}
		
		
		System.out.println("---------");
		
		char th = 'A';
		switch (th) {//A
		case 97:
			System.out.println("hiii");
			break;

		default:
			break;
		}
		
		//use cases:
		//cross browser logic
		//cross os logic: win/mac/linux
		//multi environments: QA/DEV/Stage/UAT/PROD
		//RBAC: user permissions: user, admin, seller, partner, vendor, distributor
		//payment methods: upi, paypal, cc, debit, netbanking
		//emp dept: admin, hr, eng, IT
		//booking type: single, multiple
		//order status

	}

}
