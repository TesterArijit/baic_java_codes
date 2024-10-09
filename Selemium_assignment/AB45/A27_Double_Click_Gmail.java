package ab45_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A27_Double_Click_Gmail {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
	WebElement	e=driver.findElement(By.linkText("Gmail"));
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);
		        a.doubleClick(e).perform();
		 Thread.sleep(1000);
		 driver.quit();
		

	}

}
