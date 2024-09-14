package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SA_67_Amazon_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement e1 = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute'][1]"));
	//hover_over
	Actions a1 = new Actions(driver);
	a1.moveToElement(e1).perform();
	
	Thread.sleep(2000);
	WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
	signin.click();
	Thread.sleep(2000);
	WebElement email = driver.findElement(By.xpath("(//div[@class='a-box']/div/div/input)[1]"));
	email.sendKeys("watercolout.arijit@gmail.com");
	Thread.sleep(2000);
	WebElement conti = driver.findElement(By.xpath("//span[@id='continue']"));
	conti.click();
	Thread.sleep(1000);
	driver.quit();
	
	
		
	}

}
