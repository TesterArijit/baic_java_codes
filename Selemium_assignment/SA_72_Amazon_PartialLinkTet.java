package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_72_Amazon_PartialLinkTet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement today =driver.findElement(By.partialLinkText("Today's"));
        Thread.sleep(2000);
        today.click();
        Thread.sleep(2000);
        driver.quit();
		
		
	}
	}
