package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_75_LinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement boy =driver.findElement(By.linkText("BOY FASHION"));
	           boy.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
