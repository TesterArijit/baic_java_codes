package ab45_selenium;
//"Login to Amazon ,Facebook,flipkart provide email and pwd then click on login"
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Login to Amazon ,Facebook,flipkart provide email and pwd then click on login"
public class A3_Login_click_Amazon_Facebook_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(1000);	
		driver.manage().window().maximize();
		//Amazon--->>
		driver.get("https://www.amazon.in/");
		WebElement e = driver.findElement(By.partialLinkText("Account & Lists"));
		e.click();
		Thread.sleep(2000);	
		WebElement e1 = driver.findElement(By.id("ap_email"));
		e1.sendKeys("abc@gmail.com");
		Thread.sleep(1000);	
		WebElement e2 = driver.findElement(By.id("continue"));
		e2.click();
		Thread.sleep(1000);	
		WebElement e3 = driver.findElement(By.id("ap_password"));
		e3.sendKeys("abcd1234");
		WebElement e4 = driver.findElement(By.id("signInSubmit"));
		e4.click();
		Thread.sleep(4000);
		//Facebook--->>
		driver.get("https://www.facebook.com/");
		WebElement e5 = driver.findElement(By.id("email"));
		e5.sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		WebElement e6 = driver.findElement(By.id("pass"));
		e6.sendKeys("abcd1234");
		Thread.sleep(1000);
		WebElement e7 = driver.findElement(By.name("login"));
		e7.click();
		Thread.sleep(2000);
		//Flipkart--->>
		driver.get("https://www.flipkart.com/");
		WebElement e8 = driver.findElement(By.partialLinkText("Login"));
		e8.click();
		Thread.sleep(2000);
		driver.quit();
	
	}

}
