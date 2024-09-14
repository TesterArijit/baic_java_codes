package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Assignment 71  Launch FirstCry.com and click on Girl Fashion  and perform partial link text locator
public class SA_71_PartialLinkTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement fashion =driver.findElement(By.partialLinkText("GIRL"));
		           Thread.sleep(2000);
		           fashion.click();
		           Thread.sleep(2000);
		driver.quit();
		

	}

}
