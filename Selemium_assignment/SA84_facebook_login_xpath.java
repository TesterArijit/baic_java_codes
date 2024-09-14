package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA84_facebook_login_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
	           email.sendKeys("Selinium");
	    Thread.sleep(2000);
	WebElement password =driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("Shf4587");
        Thread.sleep(2000);
    WebElement login =driver.findElement(By.xpath("//button[@name='login']"));
        login.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.quit();

	}

}
