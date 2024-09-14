package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_68_Login_Facebook1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	          email.sendKeys("Watercolout.arijit@gmail.com");
		Thread.sleep(2000);
		WebElement password =driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Hello1234");
		Thread.sleep(2000);
		WebElement login =driver.findElement(By.xpath("//button[.='Log in']"));
		login.click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
