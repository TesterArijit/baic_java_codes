package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SA_66_LaunchBrowsers {

	public static void main(String[] args) throws InterruptedException {
		//Chrome browser---->.
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//Firefox browser----.>
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//Edge browser--->
		EdgeDriver driver2=new EdgeDriver ();
		driver2.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.quit();
		

	}

}
