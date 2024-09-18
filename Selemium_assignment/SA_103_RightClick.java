package basic_selinium;
import org.openqa.selenium.By;
// Assignment 103- Launch Google and Right Click on Gmail
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SA_103_RightClick {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
	WebElement	e=driver.findElement(By.linkText("Gmail"));
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);
		        a.contextClick(e).perform();
		 Thread.sleep(1000);
		 driver.quit();
		
		
		

	}

}
