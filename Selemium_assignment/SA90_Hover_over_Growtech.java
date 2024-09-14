package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SA90_Hover_over_Growtech {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.grotechminds.com/automate-me/");
		driver.manage().window().maximize();
				
		WebElement flight = driver.findElement(By.xpath("//div[@data-id='e3e596b']"));
		
		Actions a1 = new Actions(driver);
		
		Thread.sleep(2000);
		a1.moveToElement(flight).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
