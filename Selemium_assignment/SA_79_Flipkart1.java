package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_79_Flipkart1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement search =driver.findElement(By.xpath("//input[@name='q']"));
	           search.sendKeys("mobile");
	           search.sendKeys(Keys.ENTER);
	           Thread.sleep(2000);
	    driver.quit();
	           
	}

}
