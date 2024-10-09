package ab45_selenium;

//WAP in flipkart clickon fashion menu using Xpath using text messade"

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A14_text_function_flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement e = driver.findElement(By.xpath("//span[text()='Fashion']"));
		e.click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
