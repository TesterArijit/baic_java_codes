package basic_selinium;
// Assignment 97 Launch amazon, hover over account & list and click on sign in
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SA_97_Hoverhover_Amazon {
	   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
	WebElement e =driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute' and @id='nav-link-accountList']"));
		
		Actions a=new Actions(driver);
		        a.moveToElement(e).perform();
		        Thread.sleep(2000);
		 WebElement e1=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		            e1.click();
		            Thread.sleep(2000);
		            driver.quit();

	}

}
