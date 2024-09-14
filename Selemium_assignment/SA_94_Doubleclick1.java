package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SA_94_Doubleclick1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement	gmail =driver.findElement(By.xpath("//a[.='Gmail']"));
	
	Actions a =new Actions(driver);
	        a.doubleClick(gmail).perform();
	        Thread.sleep(3000);
	        driver.quit();
	}

}
