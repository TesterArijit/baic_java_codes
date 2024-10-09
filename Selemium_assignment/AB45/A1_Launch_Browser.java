package ab45_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//WAP for launch multiple empty browser like Chrome,Firefox,Edge,safari"

public class A1_Launch_Browser {
	static FirefoxDriver driver1;
	static EdgeDriver driver2;
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(1000);	
		driver1=new FirefoxDriver();
		
		Thread.sleep(1000);	
		 driver2=new EdgeDriver();
		Thread.sleep(1000);
		driver.quit();

	}

}
