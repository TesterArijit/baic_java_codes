package ab45_selenium;
//WAP launch Amazon.in and click on Customer service with help of  PartialLinkText locator"
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7_Amazon_PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);	
		WebElement e = driver.findElement(By.partialLinkText("Customer Se"));
		e.click();
		Thread.sleep(2000);	
		driver.quit();

	}

}
