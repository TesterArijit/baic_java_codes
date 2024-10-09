package ab45_selenium;

//WAP launch Amazon.in try to click mobile with help of Linktest Locator "
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6_amazon_linktext {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);	
		WebElement e = driver.findElement(By.linkText("Mobiles"));
		e.click();
		Thread.sleep(2000);	
		driver.quit();
	}

}
