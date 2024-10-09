package ab45_selenium;

//login to Amazon.in with Xpath"
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A10_amazon_false_login_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);	
		driver.manage().window().maximize();
		//Amazon--->>
		driver.get("https://www.amazon.in/");
		WebElement e = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		e.click();
		Thread.sleep(2000);	
		WebElement e1 = driver.findElement(By.xpath("(//div[@class='a-box-inner a-padding-extra-large']/div[@class='a-row a-spacing-base']/input )[1]"));
		e1.sendKeys("abc@gmail.com");
		Thread.sleep(1000);	
		WebElement e2 = driver.findElement(By.xpath("//input[@id='continue']"));
		e2.click();
		Thread.sleep(1000);	
		WebElement e3 = driver.findElement(By.xpath("//input[@name='password']"));
		e3.sendKeys("abcd1234");
		WebElement e4 = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		e4.click();
		Thread.sleep(8000);
		driver.close();

	}

}
