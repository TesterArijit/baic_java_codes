package ab45_selenium;
//WAP for getWindowhandle()"
import org.openqa.selenium.chrome.ChromeDriver;

public class A8_getWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);	
		String window = driver.getWindowHandle();
		Thread.sleep(1000);	
		System.out.println(window);
		driver.quit();

	}

}
