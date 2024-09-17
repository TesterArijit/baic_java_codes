package basic_selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//Assignment 96 In Google, type India using tagName()
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_96_tagName {
         static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.tagName("textarea"));
		           e.sendKeys("india"+Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
		

	}

}
