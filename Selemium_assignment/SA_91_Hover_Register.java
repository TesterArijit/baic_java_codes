package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SA_91_Hover_Register {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	WebElement register = driver.findElement(By.xpath("//div[@data-id='d602956']"));
	
	Actions a =new Actions(driver);
	        a.moveToElement(register).perform();
	        Thread.sleep(2000);
	        driver.quit();
	
	
	}

}
