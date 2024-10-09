package ab45_selenium;

//With help of ID Locator  search something on Amazon "
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_idSelector_AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);	
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("Books",Keys.ENTER);
		Thread.sleep(2000);	
		driver.quit();

	}

}
