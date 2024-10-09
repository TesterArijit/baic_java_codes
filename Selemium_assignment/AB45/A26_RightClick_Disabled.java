package ab45_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A26_RightClick_Disabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Myntra--->>
		driver.get("https://www.myntra.com/");
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		Thread.sleep(1000);
		search.sendKeys("shirt");
		Thread.sleep(1000);
		driver.quit();
	
	}

}
