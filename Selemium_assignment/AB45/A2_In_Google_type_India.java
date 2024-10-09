package ab45_selenium;

//open Google and type INDIA 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_In_Google_type_India {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(1000);	
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement e = driver.findElement(By.name("q"));
		e.sendKeys("india");
		Thread.sleep(2000);
		driver.quit();

	}

}
