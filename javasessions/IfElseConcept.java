package javasessions;

public class IfElseConcept {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		
		System.out.println(a>b);
		
		if(a>b) {
			System.out.println("hii");
		}
		else {
			System.out.println("hello");
		}
		
		//
		if(true) {
			System.out.println("selenium");
		}
		else {//Dead code
			System.out.println("Bye!!!!");
		}
		
		//
		boolean exec = true;
		if(exec) {
			System.out.println("cypress");
		}
		else {
			System.out.println("Bye!");
		}
		
		//
		if(10>50) {
			System.out.println("Testing");
		}
		else {
			System.out.println("automation");
		}
		
		//nested if-if-if--else -if-if-else
		int num = 120;
		if(num>=90) {
			System.out.println("grade A");
				if(num>=95) {
					System.out.println("eligible for scholarship");
						if(num==100) {
							System.out.println("grade A++");
						}
						else {
							System.out.println("wrong marks");
						}
				}
		}
		else {
			System.out.println("you are not eligible for scholarship");
			if(num<=80) {
				System.out.println("grade B");
					if(num<=60) {
						System.out.println("grade C");
							if(num<=30) {
								System.out.println("FAIL!!");
							}
					}
			}
			else {
				System.out.println("you are eligible for scholarship with 50%");
			}
		}
		
		System.out.println("-------------");
		
		//if if if if ....else
		String browser = "chrome";
		
		if(browser.equals("chrome")) {//true
			System.out.println("launch chrome browser");
		}
		if(browser.equals("firefox")) {//F
			System.out.println("launch firefox browser");
		}
		if(browser.equals("edge")) {//F
			System.out.println("launch edge browser");
		}
		if(browser.equals("safari")) {//F
			System.out.println("launch safari browser");
		}
		else {
			System.out.println("plz pass the right browser...");
		}
		
		//if - else if--else if-----else
//		String browser = "safari";
//		if(browser.equals("chrome")) {//F
//			System.out.println("launch chrome browser");
//		}
//		else if(browser.equals("firefox")) {//F
//			System.out.println("launch firefox browser");
//		}
//		else if(browser.equals("edge")) {//F
//			System.out.println("launch edge browser");
//		}
//		else if(browser.equals("safari")) {//T
//			System.out.println("launch safari browser");
//		}
//		else {
//			System.out.println("plz pass the right browser...");
//		}

	}

}
